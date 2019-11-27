package Logica.Mapa.Hordas;

import Logica.Fabricas.Atacantes.FabricaEmperador;
import Logica.Fabricas.Atacantes.FabricaNecromante;
import Logica.Mapa.Mapa;

public class HordaDificil extends Horda {

	public HordaDificil(Mapa m) {
		super(m);
		inicializarHorda();

	}
	
	private void inicializarHorda() {
		lista.add(new FabricaNecromante(mapa));
		lista.add(new FabricaEmperador(mapa));
	}
	
}
