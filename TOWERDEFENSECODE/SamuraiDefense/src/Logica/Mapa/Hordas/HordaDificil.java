package Logica.Mapa.Hordas;

import Logica.Entidades.Atacantes.Emperador;
import Logica.Entidades.Atacantes.Necromante;
import Logica.Mapa.Mapa;

public class HordaDificil extends Horda {

	public HordaDificil(Mapa m) {
		super(m);
		inicializarHorda();

	}
	
	private void inicializarHorda() {
		lista.add(new Necromante(0, 0, mapa));
		lista.add(new Emperador(0, 0, mapa));
	}
	
}
