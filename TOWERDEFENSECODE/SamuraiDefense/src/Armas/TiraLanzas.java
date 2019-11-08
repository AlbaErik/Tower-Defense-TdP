package Armas;

import Logica.Entidades.Personaje;
import Logica.Entidades.Municiones.Municion;
import Logica.Entidades.Municiones.MunicionesAtacante.LanzaAtacante;
import Logica.Entidades.Municiones.MunicionesDefensor.LanzaDefensor;
import Logica.Mapa.Mapa;

public class TiraLanzas extends Arma {

	public TiraLanzas(Personaje p, Mapa m) {
		super(p, m);
	}

	@Override
	public Municion crearMunicionDefensor() {
		int x = (int) personaje.getPos().getX();
		int y = (int) personaje.getPos().getY();
		return new LanzaDefensor(x, y, mapa);
	}

	@Override
	public Municion crearMunicionAtacante() {
		int x = (int) personaje.getPos().getX();
		int y = (int) personaje.getPos().getY();
		return new LanzaAtacante(x, y, mapa);
	}

}
