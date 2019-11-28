package Logica.Fabricas.Defensores;

import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Defensores.SacerdoteElite;
import Logica.Fabricas.FabricaDefensores;
import Logica.Mapa.Mapa;

public class FabricaSacerdoteElite extends FabricaDefensores{

	public FabricaSacerdoteElite(Mapa m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Defensor crearDefensor() {
		// TODO Auto-generated method stub
		return new SacerdoteElite(0, 0, map);
	}

}
