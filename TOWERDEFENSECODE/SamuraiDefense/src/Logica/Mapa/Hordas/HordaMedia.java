package Logica.Mapa.Hordas;

import Logica.Fabricas.Atacantes.FabricaArquero;
import Logica.Fabricas.Atacantes.FabricaEjecutor;
import Logica.Mapa.Mapa;

public class HordaMedia extends Horda {

	public HordaMedia(Mapa m) {
		super(m);
		inicializarHorda();
	}
	
	private void inicializarHorda() {
		lista.add(new FabricaArquero(mapa));
		lista.add(new FabricaEjecutor(mapa));
		
	}

}
