package Logica.Entidades.Defensores;

import Logica.Entidades.Personaje;
import Logica.Mapa.Posicion;

public abstract class Defensor extends Personaje {
	protected int cost;
	//protected IntelDef
	
	public Defensor() {
		super();
	}
	
	public abstract int getCost();
}
