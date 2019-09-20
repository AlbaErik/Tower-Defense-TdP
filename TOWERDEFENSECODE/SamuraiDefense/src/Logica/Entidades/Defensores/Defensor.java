package Logica.Entidades.Defensores;

import Logica.Entidades.Personaje;
import Logica.Mapa.Posicion;

public abstract class Defensor extends Personaje {
	protected int cost;
	//protected IntelDef
	
	public Defensor(Posicion c) {
		super(c);
	}
	
	public abstract int getCost();
}
