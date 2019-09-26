package Logica.Entidades;

import Grafica.Entidades.EntidadGrafica;
import Logica.Mapa.Mapa;
import Logica.Mapa.Posicion;

public abstract class Entidad {
	protected int life;
	protected Posicion miCelda;
	protected Mapa mapa;
	protected EntidadGrafica grafico;
	
	public Entidad(int x,int y,Mapa m) {
		mapa=m;
		miCelda=new Posicion(x,y);
		grafico=new EntidadGrafica(x,y,m.getPanelMapa(),this);
	}
	
	public int getLife() {
		return life;
	}
	
	public abstract void setLife(int lp);
	public Posicion getPos() {
		return miCelda;
	}
	public void setPos(Posicion c) {
		miCelda=c;
	}
	
	public abstract EntidadGrafica getGrafico();

}
