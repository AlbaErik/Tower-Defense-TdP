package Armas;

import Armas.Municiones.Lanza;
import Armas.Municiones.Municion;
import Logica.Entidades.Personaje;
import Logica.Mapa.Mapa;

public class TiraLanzas extends Arma{

	public TiraLanzas(Personaje p, Mapa m) {
		super(p, m);
	}

	@Override
	public Municion crarMunicion() {
		return new Lanza(mapa);
	}

}
