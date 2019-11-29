package Logica.Fabricas.PowerUps;

import Logica.Fabricas.FabricaPowerUp;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;
import Logica.PowerUps.Preciosos.Barricada;

public class FabricaBarricada extends FabricaPowerUp{

	public FabricaBarricada(Mapa m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PowerUp crearPowerUp() {
		// TODO Auto-generated method stub
		return new Barricada(map);
	}

}
