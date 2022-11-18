package Logica.Fabricas.Obstaculos;

import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Entidades.Obstaculos.Temporales.Barro;
import Logica.Fabricas.FabricaObstaculos;
import Logica.Mapa.Mapa;

public class FabricaBarro extends FabricaObstaculos{

	public FabricaBarro(Mapa m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Obstaculo crearObstaculo() {
		// TODO Auto-generated method stub
		return new Barro(0, 0, map);
	}

}
