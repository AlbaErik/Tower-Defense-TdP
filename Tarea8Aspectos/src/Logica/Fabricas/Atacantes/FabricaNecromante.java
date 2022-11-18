package Logica.Fabricas.Atacantes;

import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Atacantes.Necromante;
import Logica.Fabricas.FabricaAtacantes;
import Logica.Mapa.Mapa;

public class FabricaNecromante extends FabricaAtacantes{

	public FabricaNecromante(Mapa m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Atacante crearAtacante() {
		// TODO Auto-generated method stub
		return new Necromante(0, 0, map);
	}

}
