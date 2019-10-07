package Logica.Mapa.Niveles;

import java.util.LinkedList;
import Logica.Entidades.Entidad;
import Logica.Juego.Juego;
import Logica.Mapa.Hordas.Horda1;

public class Nivel1 extends Nivel {

	public Nivel1(Juego j) {
		super(j);
		horda = new Horda1(juego.getMapa());
	}

	@Override
	public LinkedList<Entidad> crearHorda() {
		LinkedList<Entidad> ret = new LinkedList<Entidad>();
		for(Entidad e : horda.crearAtacantes())
			ret.add(e);
		return ret;
		
	}

	@Override
	public void getSigNivel() {
		// TODO Auto-generated method stub

	}

}
