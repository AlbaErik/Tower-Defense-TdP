package Logica.Entidades.Municiones;

import Logica.Entidades.Entidad;
import Logica.Estados.Municion.EstadoMunicion;
import Logica.Mapa.Mapa;

public abstract class Municion extends Entidad {

	protected Mapa mapa;
	protected double velocidad;
	protected int daño;

	protected Municion(int x, int y, Mapa m) {
		super(x, y, m);
		mapa = m;
		velocidad = 5;
		estado = new EstadoMunicion(this);
	}
	
	public void setDaño(int d) {
		daño = d;
	}
		
	@Override
	public void ejecutarEstado() {
		estado.ejecutar();		
	}
	
	public int getDaño() {
		return daño;
	}
	
	public double getVel() {
		return velocidad;
	}
	
}
