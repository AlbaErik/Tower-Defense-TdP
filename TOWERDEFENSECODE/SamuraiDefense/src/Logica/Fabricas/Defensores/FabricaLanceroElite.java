package Logica.Fabricas.Defensores;

import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Defensores.LanceroElite;
import Logica.Fabricas.FabricaDefensores;
import Logica.Mapa.Mapa;

public class FabricaLanceroElite extends FabricaDefensores{

	public FabricaLanceroElite(Mapa m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Defensor crearDefensor() {
		// TODO Auto-generated method stub
		return new LanceroElite(0, 0, map);
	}

}
