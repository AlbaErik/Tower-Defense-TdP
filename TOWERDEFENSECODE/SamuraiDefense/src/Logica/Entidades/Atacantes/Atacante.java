package Logica.Entidades.Atacantes;

import Armas.Arma;
import Armas.ArmaSimple;
import Grafica.Entidades.Atacantes.AtacanteGrafico;
import Logica.Entidades.Personaje;
import Logica.Entidades.Municiones.Municion;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;

public abstract class Atacante extends Personaje implements Cloneable{
	protected double movementSpeed;
	protected InteligenciaAtacante intel;
	protected Arma arma;

	public Atacante(int x, int y, Mapa m) {
		super(x, y, m);
		arma = new ArmaSimple(this, m);
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
	
	public abstract Atacante copyEntidad();
	
	public int getDañoArma() {
		return arma.getDaño();
	}
	
	public Municion getMunicion() {
		return arma.crearMunicionAtacante();
	}

}
