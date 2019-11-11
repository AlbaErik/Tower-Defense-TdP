package Logica.Entidades.Municiones;

import Logica.Entidades.Entidad;
import Logica.Estados.Municion.EstadoMunicion;
import Logica.Mapa.Mapa;

public abstract class Municion extends Entidad {

	protected Mapa mapa;
	protected double velocidad;
	protected int da�o;

	protected Municion(int x, int y, Mapa m) {
		super(x, y, m);
		mapa = m;
		velocidad = 5;
		da�o = 5;
		estado = new EstadoMunicion(this);
	}
		
	@Override
	public void ejecutarEstado() {
		estado.ejecutar();		
	}
	
	public int getDa�o() {
		return da�o;
	}
	
	public double getVel() {
		return velocidad;
	}
	
}
