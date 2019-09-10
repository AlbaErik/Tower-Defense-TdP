package Mapa;

import Personajes.Entidad;

public class Celda {
	private int x,y, ancho, alto;
	private Mapa map;
	private Entidad entidad;
	
	public Celda(Mapa m,int x, int y, int a, int alt) {
		this.x=x;
		this.y=y;
		ancho = a;
		alto = alt;
		map=m;
		entidad=null;
	}
	
	public int getAncho() {
		return ancho;
	}
	
	public int getAlto() {
		return alto;
	}
	
	public int getx() {
		return x;
	}
	public void setx(int x) {
		this.x=x;
	}
	public int gety() {
		return y;
	}
	public void sety(int y) {
		this.y=y;
	}

	public Mapa getMap() {
		return map;
	}
	public Entidad getEntidad() {
		return entidad;
	}
	public void setEntidad(Entidad e) {
		entidad=e;
	}
}
