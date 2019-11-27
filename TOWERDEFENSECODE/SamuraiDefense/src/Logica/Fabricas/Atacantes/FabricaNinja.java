package Logica.Fabricas.Atacantes;

import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Atacantes.Ninja;
import Logica.Fabricas.FabricaAtacantes;
import Logica.Mapa.Mapa;

public class FabricaNinja extends FabricaAtacantes{

	public FabricaNinja(Mapa m) {
		super(m);
	}

	@Override
	public Atacante crearAtacante() {
		return new Ninja(0, 0, map);
	}

}
