package Mapa;

import Personajes.Entidad;

public class Celda {
	private Entidad entidad;
	
	public Celda() {
		entidad=null;
	}
	
	public boolean CeldaOcupada() {
		return entidad!=null;
	}
	
	public Entidad getEntidad() {
		return entidad;
	}
}
	
