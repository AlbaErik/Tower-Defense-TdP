package Logica.Fabricas.Atacantes;

import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Atacantes.Emperador;
import Logica.Fabricas.FabricaAtacantes;
import Logica.Mapa.Mapa;

public class FabricaEmperador extends FabricaAtacantes{

	public FabricaEmperador(Mapa m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Atacante crearAtacante() {
		// TODO Auto-generated method stub
		return new Emperador(0, 0, map);
	}

}
