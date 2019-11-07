package Logica.PowerUps;

import Logica.Mapa.Mapa;

public abstract class PowerUp {
	protected Mapa map;
	protected int clave;
	
	protected PowerUp(Mapa m) {
		map = m;
	}
	
	public abstract void click();
	
	public abstract PowerUp clone();

}
