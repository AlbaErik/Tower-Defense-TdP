package Logica.Entidades.Municiones;

import Logica.Entidades.Entidad;
import Logica.Estados.Municion.EstadoMunicion;
import Logica.Inteligencia.Inteligencia;
import Logica.Mapa.Mapa;

public abstract class Municion extends Entidad {

	protected Mapa mapa;
	protected Inteligencia intel;
	protected double velocidad;
	protected int da�o;

	public Municion(int x, int y, Mapa m) {
		super(x, y, m);
		mapa = m;
		velocidad = 5;
		estado = new EstadoMunicion(this);
		da�o = 5;
	}
	
	public abstract int getDa�o();
	
	public double getVel() {
		return velocidad;
	}
	
	public Inteligencia getIntel() {
		return intel;
	}
}
