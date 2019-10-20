package Logica.Entidades.Defensores;

import Armas.Arma;
import Armas.ArmaSimple;
import Logica.Entidades.Personaje;
import Logica.Entidades.Municiones.Municion;
import Logica.Mapa.Mapa;

public abstract class Defensor extends Personaje {
	protected int cost;
	protected Arma arma;
	
	public Defensor(int x, int y, Mapa m) {
		super(x, y, m);
		arma = new ArmaSimple(this, m);
		direccion = 1;
	}

	public int getDireccion() {
		return direccion;
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
