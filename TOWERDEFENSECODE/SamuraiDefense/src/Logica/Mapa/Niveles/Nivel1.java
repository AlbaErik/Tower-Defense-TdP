package Logica.Mapa.Niveles;

import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Juego.Juego;

public class Nivel1 extends Nivel {

	public Nivel1(Juego j) {
		super(j);
		System.out.println("Se creo Nivel 1");
		crearHorda();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crearHorda() {
		Entidad ent = horda.crearAtacante();
		juego.getMapa().getPanelMapa().agregarEntidad(ent);
	}

	@Override
	public void getSigNivel() {
		// TODO Auto-generated method stub

	}

}
