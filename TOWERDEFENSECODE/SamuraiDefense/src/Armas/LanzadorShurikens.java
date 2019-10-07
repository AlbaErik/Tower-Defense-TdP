package Armas;

import Logica.Entidades.Personaje;
import Logica.Entidades.Municiones.Municion;
import Logica.Entidades.Municiones.MunicionesAtacante.ShurikenAtacante;
import Logica.Entidades.Municiones.MunicionesDefensor.ShurikenDefensor;
import Logica.Mapa.Mapa;

public class LanzadorShurikens extends Arma{

	public LanzadorShurikens(Personaje p, Mapa m) {
		super(p, m);
	}

	@Override
	public Municion crearMunicionDefensor() {
		int x = (int) personaje.getPos().getX();
		int y = (int) personaje.getPos().getY();
		return new ShurikenDefensor(x, y, mapa);
	}

	@Override
	public Municion crearMunicionAtacante() {
		int x = (int) personaje.getPos().getX();
		int y = (int) personaje.getPos().getY();
		return new ShurikenAtacante(x, y, mapa);
	}

}
