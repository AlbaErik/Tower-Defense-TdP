package Logica.Entidades.Defensores;

import Armas.Arma;
import Armas.ArmaSimple;
import Logica.Entidades.Personaje;
import Logica.Entidades.Municiones.Municion;
import Logica.Mapa.Mapa;

public abstract class Defensor extends Personaje {
	protected int cost;
	protected Arma arma;
	// protected IntelDef

	public Defensor(int x, int y, Mapa m) {
		super(x, y, m);
		arma = new ArmaSimple(this, m);
	}

	public int getCost() {
		return cost;
	}
	
	public int getDañoArma() {
		return arma.getDaño();
	}
	
	public Municion getMunicion() {
		return arma.crearMunicionDefensor();
	}
}
