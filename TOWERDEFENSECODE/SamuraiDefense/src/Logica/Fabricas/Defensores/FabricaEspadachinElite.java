package Logica.Fabricas.Defensores;

import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Defensores.EspadachinElite;
import Logica.Fabricas.FabricaDefensores;
import Logica.Mapa.Mapa;

public class FabricaEspadachinElite extends FabricaDefensores{

	public FabricaEspadachinElite(Mapa m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Defensor crearDefensor() {
		// TODO Auto-generated method stub
		return new EspadachinElite(0, 0, map);
	}

}
