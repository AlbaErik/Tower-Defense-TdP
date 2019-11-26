package Logica.Mapa.Hordas;

import java.util.LinkedList;

import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.*;
import Logica.Mapa.Mapa;

public class Horda1 extends Horda {

	public Horda1(Mapa m) {
		super(m,2);
	}

	@Override
	public LinkedList<Entidad> crearAtacantesFaciles() {
		return crearColeccionAtacantes(2);
	}

	@Override
	public LinkedList<Entidad> crearAtacantesMedios() {
		return crearColeccionAtacantes(4);

	}

	@Override
	public LinkedList<Entidad> crearAtacantesDificiles() {
		return crearColeccionAtacantes(6);

	}
	
	private LinkedList<Entidad> crearColeccionAtacantes(int dificultad){
		LinkedList<Entidad> toRet = new LinkedList<Entidad>();
		int cantEnemigos = 2;
		while(cantEnemigos > 0) {
			toRet.add(crearAtacanteRandom(dificultad));
			cantEnemigos--;
		}
		return toRet;
	}

}
