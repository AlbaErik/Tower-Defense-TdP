package Logica;

import Mapa.Mapa;

public class Juego{
	protected Mapa mapa;
	
	public Juego() {
		mapa=new Mapa();
	}
	/**
	 * Devuelve el mapa del juego
	 * @return el mapa del juego
	 */
	public Mapa getMapa() {
		return mapa;
	}
	

}
