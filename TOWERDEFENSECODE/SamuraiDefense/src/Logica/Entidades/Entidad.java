package Logica.Entidades;

import Grafica.Entidades.EntidadGrafica;
import Logica.Mapa.Posicion;

public abstract class Entidad {
	protected int life;
	protected Posicion miCelda;
	protected EntidadGrafica grafico;
	
	public Entidad() {
		grafico=null;
	}
	
	public abstract int getLife();
	public abstract void setLife(int lp);
	public Posicion getPos() {
		return miCelda;
	}
	public void setPos(Posicion c) {
		miCelda=c;
	}

}
