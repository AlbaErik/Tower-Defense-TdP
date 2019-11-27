package Logica.Fabricas;

import Logica.Entidades.Atacantes.Atacante;
import Logica.Mapa.Mapa;

public abstract class FabricaAtacantes{
	protected Mapa map;
	
	protected FabricaAtacantes(Mapa m) {
		map = m;
	}

	public abstract Atacante crearAtacante();
	
}
