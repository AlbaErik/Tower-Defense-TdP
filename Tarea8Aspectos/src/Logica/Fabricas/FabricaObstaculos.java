package Logica.Fabricas;

import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Mapa.Mapa;

public abstract class FabricaObstaculos {

	protected Mapa map;
	
	protected FabricaObstaculos(Mapa m) {
		map = m;
	}
	
	public abstract Obstaculo crearObstaculo();
	
}
