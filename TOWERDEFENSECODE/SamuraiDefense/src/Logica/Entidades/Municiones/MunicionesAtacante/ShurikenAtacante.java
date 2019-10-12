package Logica.Entidades.Municiones.MunicionesAtacante;

import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Inteligencia.InteligenciaMunicionAtaq;
import Logica.Mapa.Mapa;

public class ShurikenAtacante extends Municion {

	public ShurikenAtacante(int x, int y, Mapa m) {
		super(x, y, m);
		intel = new InteligenciaMunicionAtaq(this);
	}

	@Override
	public void chocar(Entidad e) {
		// TODO Auto-generated method stub

	}

}