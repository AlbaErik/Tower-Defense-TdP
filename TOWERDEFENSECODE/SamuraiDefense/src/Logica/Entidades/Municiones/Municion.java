package Logica.Entidades.Municiones;

import Logica.Entidades.Entidad;
import Logica.Inteligencia.Inteligencia;
import Logica.Mapa.Mapa;

public abstract class Municion extends Entidad {

	protected Mapa mapa;
	protected Inteligencia intel;

	public Municion(int x, int y, Mapa m) {
		super(x, y, m);
		mapa = m;
	}
}
