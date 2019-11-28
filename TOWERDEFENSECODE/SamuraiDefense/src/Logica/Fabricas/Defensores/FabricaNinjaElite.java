package Logica.Fabricas.Defensores;

import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Defensores.NinjaElite;
import Logica.Fabricas.FabricaDefensores;
import Logica.Mapa.Mapa;

public class FabricaNinjaElite extends FabricaDefensores{

	public FabricaNinjaElite(Mapa m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Defensor crearDefensor() {
		// TODO Auto-generated method stub
		return new NinjaElite(0, 0, map);
	}

}
