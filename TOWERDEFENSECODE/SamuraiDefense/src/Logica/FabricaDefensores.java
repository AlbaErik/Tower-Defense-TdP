package Logica;

import Logica.Entidades.Personaje;
import Logica.Entidades.Defensores.EspadachinElite;
import Logica.Mapa.Mapa;

public class FabricaDefensores{
	
	public FabricaDefensores() {
	}

	public Personaje crearNinja() {
		return null ;
	}

	public Personaje crearArquero() {
		return null;
	}

	public Personaje crearLancero() {
		return null;
	}

	public Personaje crearEspadachinElite(Mapa m) {
		return new EspadachinElite(0,0,m);
	}

	public Personaje crearEmperador() {
		return null;
	}

	public Personaje crearSamurai() {
		return null;
	}

}
