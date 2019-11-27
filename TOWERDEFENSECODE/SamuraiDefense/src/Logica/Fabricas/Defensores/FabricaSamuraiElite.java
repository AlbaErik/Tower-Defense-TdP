package Logica.Fabricas.Defensores;

import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Defensores.SamuraiElite;
import Logica.Fabricas.FabricaDefensores;
import Logica.Mapa.Mapa;

public class FabricaSamuraiElite extends FabricaDefensores {

	public FabricaSamuraiElite(Mapa m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Defensor crearDefensor() {
		// TODO Auto-generated method stub
		return new SamuraiElite(0, 0, map);
	}

}
