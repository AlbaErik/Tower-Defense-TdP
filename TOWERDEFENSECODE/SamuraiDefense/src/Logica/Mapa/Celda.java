package Logica.Mapa;

import Logica.Entidades.Entidad;

public class Celda {
	private Entidad entidad;
	
	public Celda() {
		entidad=null;
	}
	/**
	 * Devuelve true si la celda esta ocupada
	 * @return true si la celda esta ocupada
	 */
	public boolean celdaOcupada() {
		return entidad!=null;
	}
	/**
	 * Devuelve la entidad en la celda
	 * @return entidad en la celda
	 */
	public Entidad getEntidad() {
		return entidad;
	}
}
	
