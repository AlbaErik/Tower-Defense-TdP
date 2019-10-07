package Armas;

import Logica.Entidades.Personaje;
import Logica.Entidades.Municiones.Municion;
import Logica.Mapa.Mapa;

public abstract class Arma {

	protected Personaje personaje;
	protected Mapa mapa;
	protected int daño;
	
	public Arma(Personaje p, Mapa m) {
		personaje = p;
		mapa = m;
		daño = 0;
	}
	
	public abstract Municion crearMunicionDefensor();
	public abstract Municion crearMunicionAtacante();
	
	public int getDaño() {
		return daño;
	}
	
}
