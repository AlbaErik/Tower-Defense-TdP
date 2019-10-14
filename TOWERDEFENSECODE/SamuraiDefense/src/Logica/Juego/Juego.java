package Logica.Juego;

import java.util.LinkedList;
import java.util.Random;

import GUI.Paneles.PanelJuego;
import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Mapa.Mapa;
import Logica.Mapa.Niveles.Nivel;
import Logica.Mapa.Niveles.Nivel1;
import Logica.Tienda.Tienda;

public class Juego {
	private PanelJuego Gui;
	private Tienda tienda;
	private Nivel nivel;
	private Mapa mapa;
	private LinkedList<Atacante> misAtacantes;
	private LinkedList<Entidad> miHorda;
	private LinkedList<Obstaculo> misObstaculos;

	public Juego(PanelJuego g) {
		Gui = g;
		tienda = new Tienda(this);
		mapa = new Mapa(this);
		misAtacantes = new LinkedList<Atacante>();
	}

	public void crearNivel() {
		nivel = new Nivel1(this);
	}

	public void iniciar() {

	}

	public void inicializarHorda() {
		miHorda = nivel.crearHorda();
	}
	
	public void generarObstaculos() {
		misObstaculos = nivel.crearObstaculos();
	}

	public void agregarEntidades() { // cambiar, que agregue de a uno y que lo mueva
		if (!miHorda.isEmpty()) {
			Entidad atacante = miHorda.getFirst();
			mapa.agregarEntidadAlCampo(atacante);
			miHorda.remove(miHorda.getFirst());
		}else {
			if(!misObstaculos.isEmpty()) {
				int x = randomX();
				int y = randomY();
				Obstaculo obs = misObstaculos.getFirst();
				obs.cambiarPosLogica(x, y);
				mapa.agregarEntidadAlCampoEnPosActual(obs);
				misObstaculos.remove(misObstaculos.getFirst());
			}
		}
	}
	
	private int randomY() {
		Random rand = new Random();
		int fila = rand.nextInt(5);
		fila = fila * 66 + 200;
		return fila;
	}

	private int randomX() {
		Random rand = new Random();
		int x = rand.nextInt(400);
		return x + 400;
	}

	public void accionarEstados() {
		for(Entidad e : mapa.getColeccion())
			e.ejecutarEstado();
	}
	
	public void reanudar() {
		// TODO Auto-generated method stub
	}

	public Tienda getTienda() {
		return tienda;
	}

	public PanelJuego getPanelJuego() {
		return Gui;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public Mapa getMapa() {
		return mapa;
	}

	

}
