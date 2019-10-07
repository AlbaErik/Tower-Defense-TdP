package Armas.Municiones;

import Logica.Inteligencia.InteligenciaMunicion;
import Logica.Mapa.Mapa;

public abstract class Municion {
	
	protected Mapa mapa;
	protected InteligenciaMunicion intel;
	
	public Municion(Mapa m) {
		mapa = m;
	}
}
