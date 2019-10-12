package Logica.Mapa.Niveles;

import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Obstaculos.Temporales.Barro;

public class ClonadorEntidades {
	public Atacante clonarAtacantes(Atacante e) {
		return e.copyEntidad();
	}
	
	/*
	 * clonarObstaculo sirve para hacer prototypes con los obstaculo de manera aleatoria
	 */
	public Barro clonarObstaculo(Barro o) {
		return o;		
	}

}
