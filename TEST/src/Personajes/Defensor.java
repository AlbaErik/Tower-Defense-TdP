package Personajes;

import Mapa.Celda;

public abstract class Defensor extends Personaje {
	protected int cost;
	//protected IntelDef
	
	public Defensor(Celda c) {
		super(c);
	}
	
	public abstract int getCost();
}