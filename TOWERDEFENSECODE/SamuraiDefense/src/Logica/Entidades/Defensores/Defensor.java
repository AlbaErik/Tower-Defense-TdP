package Logica.Entidades.Defensores;

import Logica.Entidades.Personaje;
import Logica.Mapa.Mapa;

public abstract class Defensor extends Personaje {
	protected int cost;
	//protected IntelDef
	
	public Defensor(int x,int y,Mapa m) {
		super(x,y,m);
	}
	public int getCost() {
		return cost;
	}
}
