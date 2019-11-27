package Logica.Fabricas.Obstaculos;

import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Entidades.Obstaculos.ConVida.Piedra;
import Logica.Fabricas.FabricaObstaculos;
import Logica.Mapa.Mapa;

public class FabricaPiedra extends FabricaObstaculos{

	public FabricaPiedra(Mapa m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Obstaculo crearObstaculo() {
		// TODO Auto-generated method stub
		return new Piedra(0, 0, map);
	}

}
