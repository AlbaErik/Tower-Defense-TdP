package Logica.Entidades.Obstaculos;

import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public abstract class Obstaculo extends Entidad {
	protected Obstaculo(int x, int y, Mapa m) {
		super(x, y, m);
	}

	public abstract Obstaculo clone();
}
