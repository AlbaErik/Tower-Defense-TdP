package Logica.Entidades.Atacantes;

import java.util.Random;
import Grafica.Entidades.Atacantes.AtacanteGrafico;
import Logica.Colisionadores.Adistancia.ColCaminoLibreEnem;
import Logica.Entidades.Personaje;
import Logica.Entidades.Municiones.Municion;
import Logica.Entidades.Premios.EscudoEnemigo;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;
import Logica.PowerUps.TiendaPowerUp;

public abstract class Atacante extends Personaje implements Cloneable {
	protected double movementSpeed;
	protected InteligenciaAtacante intel;
	protected TiendaPowerUp tiendaPowerUp;
	protected double backupVel;
	protected EscudoEnemigo escudo = null;

	protected Atacante(int x, int y, Mapa m) {
		super(x, y, m);
		colCaminoLibre = new ColCaminoLibreEnem();
		direccion = -1;
		tiendaPowerUp = new TiendaPowerUp(m);
		intel = new InteligenciaAtacante(this);
	}
	
	public EscudoEnemigo getEscudo() {
		return escudo;
	}
	
	public void setEscudo(EscudoEnemigo esc) {
		escudo = esc;
	}

	public void restarVelocidad(double i) {
		backupVel = movementSpeed;
		movementSpeed = i;
	}

	public void morir() {

		mapa.notificarMuerteEnemigo();
		mapa.eliminarEntidad(this);
		int dinero = this.dineroDropeado();
		mapa.actualizarOroTienda(dinero);

		devolverPowerUp();
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

	public int getDireccion() {
		return direccion;
	}

	public void disparar() {
		Municion mun = arma.crearMunicionAtacante();
		mapa.agregarEntidadAlCampo(mun);
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
