package Logica.Mapa.Hordas;

import Logica.Entidades.Atacantes.*;
import Logica.Mapa.Mapa;

public class HordaFacil extends Horda {

	public HordaFacil(Mapa m) {
		super(m);
		inicializarHorda();
	}

	private void inicializarHorda() {
		lista.add(new Ninja(0, 0, mapa));
		lista.add(new Espadachin(0, 0, mapa));
	}

}
