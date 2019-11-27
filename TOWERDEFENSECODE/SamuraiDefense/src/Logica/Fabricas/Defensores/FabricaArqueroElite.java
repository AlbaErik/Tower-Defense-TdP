package Logica.Fabricas.Defensores;

import Logica.Entidades.Defensores.ArqueroElite;
import Logica.Entidades.Defensores.Defensor;
import Logica.Fabricas.FabricaDefensores;
import Logica.Mapa.Mapa;

public class FabricaArqueroElite extends FabricaDefensores{

	public FabricaArqueroElite(Mapa m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Defensor crearDefensor() {
		// TODO Auto-generated method stub
		return new ArqueroElite(0, 0, map);
	}

}
