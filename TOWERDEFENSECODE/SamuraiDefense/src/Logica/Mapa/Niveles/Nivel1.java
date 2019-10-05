package Logica.Mapa.Niveles;

import java.util.LinkedList;

import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Juego.Juego;

public class Nivel1 extends Nivel {

	public Nivel1(Juego j) {
		super(j);
		System.out.println("Se creo Nivel 1");
	}

	@Override
	public void crearHorda() {
		LinkedList<Entidad> lista = horda.crearAtacantes();
		for(Entidad e : lista) {
			juego.getMapa().agregarEntidadAlCampo(e);
		}
	}

	@Override
	public void getSigNivel() {
		// TODO Auto-generated method stub

	}

}
