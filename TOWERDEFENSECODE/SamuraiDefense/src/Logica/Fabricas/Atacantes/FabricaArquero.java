package Logica.Fabricas.Atacantes;

import Logica.Entidades.Atacantes.Arquero;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Fabricas.FabricaAtacantes;
import Logica.Mapa.Mapa;

public class FabricaArquero extends FabricaAtacantes{

	public FabricaArquero(Mapa m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Atacante crearAtacante() {
		// TODO Auto-generated method stub
		return new Arquero(0, 0, map);
	}

}
