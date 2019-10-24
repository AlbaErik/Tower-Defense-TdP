package Logica.Entidades.Atacantes;

import Armas.Arma;
import Armas.ArmaSimple;
import Grafica.Entidades.Atacantes.AtacanteGrafico;
import Logica.Colisionadores.ColisionadorADistancia;
import Logica.Entidades.Personaje;
import Logica.Entidades.Municiones.Municion;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;

public abstract class Atacante extends Personaje implements Cloneable{
	protected double movementSpeed;
	protected InteligenciaAtacante intel;
	protected Arma arma;
	protected ColisionadorADistancia col2 = new ColisionadorADistancia();


	public Atacante(int x, int y, Mapa m) {
		super(x, y, m);
		arma = new ArmaSimple(this, m);
		direccion = -1;
	}
	
	public ColisionadorADistancia getCol2() {
		return col2;
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

}
