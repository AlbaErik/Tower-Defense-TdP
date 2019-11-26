package Logica.Mapa.Hordas;

import java.util.LinkedList;
import java.util.Random;

import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.Arquero;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Atacantes.Ejecutor;
import Logica.Entidades.Atacantes.Emperador;
import Logica.Entidades.Atacantes.Espadachin;
import Logica.Entidades.Atacantes.Necromante;
import Logica.Entidades.Atacantes.Ninja;
import Logica.Mapa.Mapa;

public class Horda {

	private LinkedList<Atacante> lista;
	private Random rand;
	private Mapa mapa;
	private int cantidadEnemigos;
	
	public Horda(Mapa m, int cant) {
		mapa = m;
		cantidadEnemigos = cant;
		
		lista = new LinkedList<Atacante>();
		rand = new Random();
		inicializarHorda();
	}

	private void inicializarHorda() {
		lista.add(new Ninja(0, 0, mapa));
		lista.add(new Espadachin(0, 0, mapa));
		lista.add(new Arquero(0, 0, mapa));
		lista.add(new Ejecutor(0, 0, mapa));
		lista.add(new Necromante(0, 0, mapa));
		lista.add(new Emperador(0, 0, mapa));
	}
	
	public int getCantEnemigos() {
		return cantidadEnemigos;
	}

	public LinkedList<Entidad> crearAtacantesFaciles() {
		return crearColeccionAtacantes(2);
	}

	public LinkedList<Entidad> crearAtacantesMedios() {
		return crearColeccionAtacantes(4);
	}

	public LinkedList<Entidad> crearAtacantesDificiles() {
		return crearColeccionAtacantes(6);
	}
	
	private LinkedList<Entidad> crearColeccionAtacantes(int dificultad) {
		LinkedList<Entidad> toRet = new LinkedList<Entidad>();
		
		while (cantidadEnemigos > 0) {
			toRet.add(crearAtacanteRandom(dificultad));
			cantidadEnemigos--;
		}
		return toRet;
	}

	/*
	 * La variable ent determina hasta que posicion de la lista se pueden crear
	 * enemigos
	 */
	protected Atacante crearAtacanteRandom(int dificultad) {
		int i = rand.nextInt(dificultad);
		return lista.get(i).clone();
	}
}
