package Logica.Entidades.Municiones.MunicionesAtacante;

import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Inteligencia.InteligenciaMunicionAtaq;
import Logica.Mapa.Mapa;

public class LanzaAtacante extends Municion {

	public LanzaAtacante(int x, int y, Mapa m) {
		super(x, y, m);
		intel = new InteligenciaMunicionAtaq(this);
		velocidad = 2;
	}

	@Override
	public void chocar(Entidad e) {
		// TODO Auto-generated method stub

	}

}
