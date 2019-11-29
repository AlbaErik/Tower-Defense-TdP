package Logica.Fabricas;

import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;

public abstract class FabricaPowerUp {
	
	protected Mapa map;
	
	protected FabricaPowerUp(Mapa m) {
		map = m;
	}
	
	public abstract PowerUp crearPowerUp();	

}
