package Logica.Entidades.Obstaculos;

import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public abstract class Obstaculo extends Entidad {
	public Obstaculo(int x, int y, Mapa m) {
		super(x, y, m);
		// TODO Auto-generated constructor stub
	}

	public abstract Obstaculo clone();
}