package Logica.Fabricas.Atacantes;

import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Atacantes.Espadachin;
import Logica.Fabricas.FabricaAtacantes;
import Logica.Mapa.Mapa;

public class FabricaEspadachin extends FabricaAtacantes {

	public FabricaEspadachin(Mapa m) {
		super(m);
	}

	@Override
	public Atacante crearAtacante() {
		return new Espadachin(0, 0, map);
	}

}
