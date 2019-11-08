package Logica.Entidades.Atacantes;

import java.util.Random;

import Grafica.Entidades.Atacantes.AtacanteGrafico;
import Logica.Colisionadores.Adistancia.ColCaminoLibreEnem;
import Logica.Entidades.Personaje;
import Logica.Entidades.Municiones.Municion;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;
import Logica.PowerUps.TiendaPowerUp;
import Logica.PowerUps.Preciosos.Barricada;
import Logica.PowerUps.Preciosos.Bomba;
import Logica.PowerUps.Temporales.BolsaDeDinero;
import Logica.PowerUps.Temporales.CampoProteccion;
import Logica.PowerUps.Temporales.PocionDeFuerza;

public abstract class Atacante extends Personaje implements Cloneable {
	protected double movementSpeed;
	protected InteligenciaAtacante intel;
	protected TiendaPowerUp tiendaPowerUp;

	public Atacante(int x, int y, Mapa m) {
		super(x, y, m);
		colCaminoLibre = new ColCaminoLibreEnem();
		direccion = -1;
		tiendaPowerUp = new TiendaPowerUp(m);
	}

	public void morir() {
		
		mapa.notificarMuerteEnemigo();
		mapa.eliminarEntidad(this);
		int dinero = this.dineroDropeado();
		mapa.actualizarOroTienda(dinero);
		System.out.println("ATACANTE: Enemigo muerto");
		
		devolverPowerUp();
	}

	protected void devolverPowerUp() {
		/*
		Random ran = new Random();
		int i = ran.nextInt(10);
		if(i % 2 == 0)
			tiendaPowerUp.getRandom();
		 */
		int x=(int) this.getPos().getX();
		int y=(int) this.getPos().getY();
		mapa.agregarPowerUp(x,y,new Bomba (mapa));
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
