package Logica.Fabricas.PowerUps;

import Logica.Fabricas.FabricaPowerUp;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;
import Logica.PowerUps.Temporales.PocionDeFuerza;

public class FabricaPocionDeFuerza extends FabricaPowerUp{

	public FabricaPocionDeFuerza(Mapa m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PowerUp crearPowerUp() {
		// TODO Auto-generated method stub
		return new PocionDeFuerza(map);
	}

}
