package Logica.Entidades.Defensores;

import Logica.Entidades.Personaje;
import Logica.Entidades.Municiones.Municion;
import Logica.Mapa.Mapa;

public abstract class Defensor extends Personaje {
	protected int cost;
	
	public Defensor(int x, int y, Mapa m) {
		super(x, y, m);
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
