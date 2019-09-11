package Personajes;

import Grafica.EntidadGrafica;
import Mapa.Celda;

public abstract class Entidad {
	protected int life;
	protected Celda miCelda;
	protected EntidadGrafica grafico;
	
	public Entidad(Celda c) {
		miCelda=c;
		grafico=null;
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
