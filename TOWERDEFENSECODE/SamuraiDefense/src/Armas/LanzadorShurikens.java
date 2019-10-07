package Armas;

import Armas.Municiones.Municion;
import Logica.Entidades.Personaje;
import Logica.Mapa.Mapa;

public class LanzadorShurikens extends Arma{

	public LanzadorShurikens(Personaje p, Mapa m) {
		super(p, m);
	}

	@Override
	public Municion crarMunicion() {
		return new Shuriken(mapa);
	}

}
