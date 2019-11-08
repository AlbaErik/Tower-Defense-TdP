package Logica.PowerUps;

import Grafica.PowerUps.PowerUpGrafico;
import Logica.Mapa.Mapa;

public abstract class PowerUp {
	protected Mapa map;
	protected int clave;
	protected PowerUpGrafico grafica;
	
	protected PowerUp(Mapa m) {
		map = m;
	}
	
	public PowerUpGrafico getGrafico() {
		return grafica;
	}
	
	public abstract void morir();
	
	public abstract void click();
	
	public abstract PowerUp clone();

}
