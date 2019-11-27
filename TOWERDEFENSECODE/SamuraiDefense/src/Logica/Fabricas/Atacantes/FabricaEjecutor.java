package Logica.Fabricas.Atacantes;

import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Atacantes.Ejecutor;
import Logica.Fabricas.FabricaAtacantes;
import Logica.Mapa.Mapa;

public class FabricaEjecutor extends FabricaAtacantes{

	public FabricaEjecutor(Mapa m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Atacante crearAtacante() {
		// TODO Auto-generated method stub
		return new Ejecutor(0, 0, map);
	}

}
