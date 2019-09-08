package Personajes;

import Mapa.Celda;

public abstract class Entidad {
	protected int life;
	protected Celda miCelda;
	
	public Entidad(Celda c) {
		miCelda=c;
	}
	
	public abstract int getLife();
	public abstract void setLife(int lp);
	public Celda getCelda() {
		return miCelda;
	}
	public void setCelda(Celda c) {
		miCelda=c;
	}

}
