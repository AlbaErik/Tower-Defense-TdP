package Logica.Entidades.Defensores;

import Logica.Entidades.Personaje;
import Logica.Mapa.Celda;

public abstract class Defensor extends Personaje {
	protected int cost;
	//protected IntelDef
	
	public Defensor(Celda c) {
		super(c);
	}
	
	public abstract int getCost();
}
