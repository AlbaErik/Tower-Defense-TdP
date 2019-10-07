package Logica.Entidades.Municiones.MunicionesDefensor;

import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Inteligencia.InteligenciaMunicionDef;
import Logica.Mapa.Mapa;

public class ShurikenDefensor extends Municion {

	public ShurikenDefensor(int x, int y, Mapa m) {
		super(x, y, m);
		intel = new InteligenciaMunicionDef(this);
	}

	@Override
	public void chocar(Entidad e) {
		// TODO Auto-generated method stub

	}

}
