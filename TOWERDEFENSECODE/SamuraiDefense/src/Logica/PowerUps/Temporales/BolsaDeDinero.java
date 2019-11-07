package Logica.PowerUps.Temporales;

import Logica.Entidades.Premios.Premio;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;

public class BolsaDeDinero extends MagiaTemporal{

	public BolsaDeDinero(Mapa m) {
		super(m);
	}
	
	@Override
	public PowerUp clone() {
		// TODO Auto-generated method stub
		return new BolsaDeDinero(map);
	}

	@Override
	public Premio getPremio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void click() {
		// -----------------------------------------------------------
		
	}

}
