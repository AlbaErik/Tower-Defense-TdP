package Logica.Entidades.Atacantes;

import java.util.Random;

import Grafica.Entidades.Atacantes.AtacanteGrafico;
import Logica.Colisionadores.Adistancia.ColCaminoLibreEnem;
import Logica.Entidades.Personaje;
import Logica.Entidades.Municiones.Municion;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;

public abstract class Atacante extends Personaje implements Cloneable{
	protected double movementSpeed;
	protected InteligenciaAtacante intel;


	public Atacante(int x, int y, Mapa m) {
		super(x, y, m);	
		colCaminoLibre = new ColCaminoLibreEnem();
		direccion = -1;
	}
	
	public void morir() {
		mapa.eliminarEntidad(this);
		int dinero=this.dineroDropeado();
		mapa.getTienda().actualizarOro(dinero);
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
