package Logica.PowerUps;

import Logica.Entidades.Premios.Premio;
import Logica.Mapa.Mapa;

public abstract class PowerUp {
	
	protected Mapa map;
	
	protected PowerUp(Mapa m) {
		map = m;
	}
	
	public abstract Premio getPremio();
	
	public abstract void click();
	
	public abstract PowerUp clone();

}
