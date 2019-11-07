package Logica.PowerUps.Temporales;

import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;

public class BolsaDeDinero extends MagiaTemporal{

	public BolsaDeDinero(Mapa m) {
		super(m);
		clave = 2;
	}
	
	@Override
	public PowerUp clone() {
		// TODO Auto-generated method stub
		return new BolsaDeDinero(map);
	}

	@Override
	public void click() {
		int i = (int) ((Math.random() * ((10000 - 5000) + 1)) + 5000);
		map.actualizarOroTienda(i);
	}

	
}
