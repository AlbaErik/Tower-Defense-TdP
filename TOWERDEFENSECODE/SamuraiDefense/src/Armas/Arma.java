package Armas;

import Armas.Municiones.Municion;
import Logica.Entidades.Personaje;
import Logica.Mapa.Mapa;

public abstract class Arma {

	protected Personaje personaje;
	protected Mapa mapa;
	
	public Arma(Personaje p, Mapa m) {
		personaje = p;
		mapa = m;
	}
	
	public abstract Municion crarMunicion();
	
}
