package Armas;

import Armas.Municiones.Flecha;
import Armas.Municiones.Municion;
import Logica.Entidades.Personaje;
import Logica.Mapa.Mapa;

public class Arco extends Arma {

	public Arco(Personaje p, Mapa m) {
		super(p, m);
	}

	@Override
	public Municion crarMunicion() {
		return new Flecha(mapa);
	}

}
