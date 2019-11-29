package Logica.Fabricas.PowerUps;

import Logica.Fabricas.FabricaPowerUp;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;
import Logica.PowerUps.Temporales.BolsaDeDinero;

public class FabricaBolsaDeDinero extends FabricaPowerUp{

	public FabricaBolsaDeDinero(Mapa m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PowerUp crearPowerUp() {
		// TODO Auto-generated method stub
		return new BolsaDeDinero(map);
	}

}
