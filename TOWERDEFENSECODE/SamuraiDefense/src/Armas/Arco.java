package Armas;

import Logica.Entidades.Personaje;
import Logica.Entidades.Municiones.Municion;
import Logica.Entidades.Municiones.MunicionesAtacante.FlechaAtacante;
import Logica.Entidades.Municiones.MunicionesDefensor.FlechaDefensor;
import Logica.Mapa.Mapa;

public class Arco extends Arma {

	public Arco(Personaje p, Mapa m) {
		super(p, m);
	}

	@Override
	public Municion crearMunicionDefensor() {
		int x = (int) personaje.getPos().getX();
		int y = (int) personaje.getPos().getY();
		return new FlechaDefensor(x, y, mapa);
	}

	@Override
	public Municion crearMunicionAtacante() {
		int x = (int) personaje.getPos().getX();
		int y = (int) personaje.getPos().getY();
		return new FlechaAtacante(x, y, mapa);
	}

}
