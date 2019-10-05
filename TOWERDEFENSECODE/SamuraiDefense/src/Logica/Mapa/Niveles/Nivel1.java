package Logica.Mapa.Niveles;

import java.util.LinkedList;
import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Juego.Juego;

public class Nivel1 extends Nivel {

	public Nivel1(Juego j) {
		super(j);
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
