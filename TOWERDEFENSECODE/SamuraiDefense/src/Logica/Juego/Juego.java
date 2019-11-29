package Logica.Juego;

import java.util.LinkedList;
import java.util.Random;

import Audio.Player;
import GUI.Paneles.PanelJuego;
import GUI.Paneles.PanelTienda;
import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Entidades.Premios.EscudoEnemigo;
import Logica.Mapa.Mapa;
import Logica.Mapa.Niveles.Nivel;
import Logica.Mapa.Niveles.Nivel1;
import Logica.Tienda.Tienda;

public class Juego {
	private PanelJuego Gui;
	private Tienda tienda;
	private Nivel nivel;
	private Mapa mapa;
	private LinkedList<Atacante> miHorda;
	private LinkedList<Obstaculo> misObstaculos;
	private int contadorEnemigos = 0;
	private boolean perdio = false;
	private Random rand;
	private Player player;

	public Juego(PanelJuego g) {
		Gui = g;
		tienda = new Tienda(this);
		mapa = new Mapa(this);
		rand = new Random();
		player=new Player();
	}

	public void hacerPerderAlJugador() {
		perdio = true;
	}

	public boolean controlPerder() {
		return perdio;
	}

	public boolean enemigosMuertos() {
		return contadorEnemigos == 0;
	}

	public void restarEnemigoMuerto() {
		contadorEnemigos--;
	}

	public void actualizarOro(int c) {
		Gui.actualizarOroStats(c);
	}

	public void crearNivel() {
		nivel = new Nivel1(this);
	}

	public void inicializarHorda() {
		miHorda = nivel.getSigHorda();
	}

	private int randomY() {
		int fila = rand.nextInt(5);
		fila = fila * 66 + 183;
		return fila;
	}

	private int randomX() {
		int x = rand.nextInt(3);
		x = x * 100;
		return x + 400;
	}

	private int[] buscarPosRandom() {
		int[] toret = new int[2];
		int x = randomX();
		int y = randomY();
		int intentos = 30;
		boolean esValida = verificarLugarEnMapa(x, y);

		while (intentos > 0 && !esValida) {
			x = randomX();
			y = randomY();
			esValida = verificarLugarEnMapa(x, y);
			intentos--;
		}
		toret[0] = x;
		toret[1] = y;
		return toret;
	}

	public void generarObstaculos() {
		misObstaculos = nivel.getObstaculos();
		while (!misObstaculos.isEmpty()) {
			agregarObsEnPosRandom();
		}
	}
	
	private void agregarObsEnPosRandom() {
		int x = randomX();
		int y = randomY();
		int intentos = 30;
		while (intentos > 0 && mapa.hayEnPos(x, y)) { // Si no se puede colocar, devuelve false
			x = randomX();
			y = randomY();
			intentos--;
		}
		if (intentos >= 0 && !mapa.hayEnPos(x, y))
			agregarObstaculo(x, y);
	}

	public void agregarEntidades() {
		if (!misObstaculos.isEmpty()) {
			agregarObsEnPosRandom();			
		} else if (!miHorda.isEmpty()) {
			agregarAtacante();
		}
	}

	private void agregarObstaculo(int x, int y) {
		Obstaculo obs = misObstaculos.getFirst();
		obs.cambiarPosLogica(x, y);
		mapa.agregarEntidadAlCampoEnPosActual(obs);
		misObstaculos.remove(misObstaculos.getFirst());
	}

	private void agregarAtacante() {
		Atacante atacante = miHorda.getFirst();
		mapa.agregarEntidadAlCampo(atacante);
		miHorda.remove(miHorda.getFirst());
		contadorEnemigos++;
		Random rand = new Random();
		int i = rand.nextInt(10);
		if (i % 3 == 0) {
			asignarEscudo(atacante);
		}
	}

	public boolean hordaVacia() {
		return miHorda.isEmpty();
	}

	public void cargarSigHorda() {
		System.out.println("JUEGO----se va cargar la siguiente horda");
		if (nivel.haySigHorda())
			miHorda = nivel.getSigHorda();
		else
			setSigNivel();
		if (nivel.haySigNivel())
			misObstaculos = nivel.getObstaculos();
	}

	private void asignarEscudo(Atacante atacante) {
		int x = (int) atacante.getPos().getX();
		int y = (int) atacante.getPos().getY();
		EscudoEnemigo escudo = new EscudoEnemigo(x, y, mapa);
		atacante.setEscudo(escudo);
		mapa.agregarEntidadAlCampoEnPosActual(escudo);
	}

	public boolean nivelTerminado() {
		return miHorda.isEmpty() && misObstaculos.isEmpty() && !nivel.haySigHorda();
	}

	private boolean verificarLugarEnMapa(int x, int y) {// Verifica si se puede colocar una entidad en ese lugar
		boolean sepuedecolocar = false;
		int i = x;
		while (i < x + 50 && !sepuedecolocar) {
			sepuedecolocar = mapa.hayEnPos(x, y);
			i++;
		}
		i = x;
		while (i > x - 50 && !sepuedecolocar) {
			sepuedecolocar = mapa.hayEnPos(x, y);
			i--;
		}
		return sepuedecolocar;
	}

	public void accionarEstados() {
		for (Entidad e : mapa.getColeccion())
			e.ejecutarEstado();
	}

	public boolean haySiguienteNivel() {
		return nivel.haySigNivel();
	}

	public boolean haySigHorda() {
		return nivel.haySigHorda();
	}
	
	public Tienda getTienda() {
		return tienda;
	}

	public PanelJuego getPanelJuego() {
		return Gui;
	}
	
	public PanelTienda getPanelTienda() {
		return tienda.getPanelTienda();
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setSigNivel() {
		if (nivel.haySigNivel()) {
			nivel = nivel.getSigNivel();
			Gui.cambiarNivel();
			mapa.repaintComponent(nivel.getFondo());
		}
	}

	public Mapa getMapa() {
		return mapa;
	}
	
	public PanelMapa getPanelMapa() {
		return mapa.getPanelMapa();
	}

	public void ganar() {
		Gui.ganar();	
	}
	
	public void perder() {
		Gui.perder();
	}
}
