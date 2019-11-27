package Logica.Mapa.Hordas;

import Logica.Fabricas.Atacantes.FabricaEspadachin;
import Logica.Fabricas.Atacantes.FabricaNinja;
import Logica.Mapa.Mapa;

public class HordaFacil extends Horda {

	public HordaFacil(Mapa m) {
		super(m);
		inicializarHorda();
	}

	private void inicializarHorda() {
		lista.add(new FabricaNinja(mapa));
		lista.add(new FabricaEspadachin(mapa));
	}

}
