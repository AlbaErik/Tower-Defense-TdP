package Logica.Entidades.Atacantes;

import java.util.Random;
import Grafica.Entidades.Atacantes.AtacanteGrafico;
import Logica.Colisionadores.ColisionadorAtacante;
import Logica.Colisionadores.Adistancia.ColCaminoLibreEnem;
import Logica.Entidades.Contador;
import Logica.Entidades.Personaje;
import Logica.Entidades.Municiones.Municion;
import Logica.Entidades.Premios.EscudoEnemigo;
import Logica.Estados.Personajes.Atacante.Avanzar;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;
import Logica.PowerUps.TiendaPowerUp;

public abstract class Atacante extends Personaje {
	protected double movementSpeed;
	protected double backupVel;
	protected boolean estoyLento = false;
	protected InteligenciaAtacante intel;
	protected TiendaPowerUp tiendaPowerUp;
	protected EscudoEnemigo escudo = null;
	protected Contador cont2 = new Contador();

	protected Atacante(int x, int y, Mapa m) {
		super(x, y, m);

		colCaminoLibre = new ColCaminoLibreEnem();
		tiendaPowerUp = new TiendaPowerUp(m);
		intel = new InteligenciaAtacante(this);
		estado = new Avanzar(this);
		col = new ColisionadorAtacante(this);
	}

	public EscudoEnemigo getEscudo() {
		return escudo;
	}

	public void setEscudo(EscudoEnemigo esc) {
		escudo = esc;
	}

	public boolean estoyLento() {
		return estoyLento;
	}

	public void devolverVelocidad() {
		estoyLento = false;
		movementSpeed = backupVel;
	}

	public void realentizarPersonaje(double o) {
		if (!estoyLento)
			reemplazarVelocidad(o);
		cont2.resetContador();
	}

	private void reemplazarVelocidad(double i) {
		estoyLento = true;
		backupVel = movementSpeed;
		movementSpeed = i;
	}

	public void morir() {
		if(escudo != null)
			escudo.morir();
		
		devolverPowerUp();
		int dinero = this.dineroDropeado();
		mapa.actualizarOroTienda(dinero);
		
		mapa.notificarMuerteEnemigo();
		mapa.eliminarEntidad(this);
	}

	protected void devolverPowerUp() {
		PowerUp aleatorio = null;
		Random ran = new Random();
		int i = ran.nextInt(10);
		if (i % 2 == 0)
			aleatorio = tiendaPowerUp.getRandom();

		if (aleatorio != null) {
			int x = (int) this.getPos().getX();
			int y = (int) this.getPos().getY();
			mapa.agregarPowerUp(x, y, aleatorio);
		}
	}

	public int getContadorLentitud() {
		return cont2.getContador();
	}

	public void resetContadorLentitud() {
		cont2.resetContador();
	}

	public void incrementarContadorLentitud() {
		cont2.incrementarContador();
	}

	public int getDireccion() {
		return -1;
	}

	public void setGrafico(AtacanteGrafico graf) {
		this.grafico = graf;
	}

	public double getVelocidadMov() {
		return movementSpeed;
	}

	public Inteligencia getInteligencia() {
		return intel;
	}

	public abstract Atacante clone();

	public int getDañoArma() {
		return arma.getDaño();
	}

	public Municion getMunicion() {
		return arma.crearMunicionAtacante();
	}

	public int dineroDropeado() {
		return (int) ((Math.random() * ((100 - 40) + 1)) + 40);
	}

}
