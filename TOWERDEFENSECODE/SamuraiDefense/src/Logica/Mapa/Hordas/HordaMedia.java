package Logica.Mapa.Hordas;

import Logica.Entidades.Atacantes.Arquero;
import Logica.Entidades.Atacantes.Ejecutor;
import Logica.Mapa.Mapa;

public class HordaMedia extends Horda {

	public HordaMedia(Mapa m) {
		super(m);
		inicializarHorda();
	}
	
	private void inicializarHorda() {
		lista.add(new Arquero(0, 0, mapa));
		lista.add(new Ejecutor(0, 0, mapa));
		
	}

}
