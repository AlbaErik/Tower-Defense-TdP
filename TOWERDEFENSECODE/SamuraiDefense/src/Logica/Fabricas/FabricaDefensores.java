package Logica.Fabricas;

import Logica.Entidades.Defensores.Defensor;
import Logica.Mapa.Mapa;

public abstract class FabricaDefensores {
	
	protected Mapa map;
	
	protected FabricaDefensores(Mapa m) {
		map = m;
	}
	
	public abstract Defensor crearDefensor();
	

}
