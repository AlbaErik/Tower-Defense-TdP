package Logica.Mapa.Niveles;

import java.util.LinkedList;
import java.util.Random;
import Logica.Entidades.Atacantes.*;
import Logica.Mapa.Mapa;

public class Horda {
	protected ClonadorEntidades clonador;
	protected LinkedList<Atacante> lista;
	protected Random rand;
	protected Mapa mapa;
	protected LinkedList<Atacante> atacantes;

	public Horda(Mapa m) {
		mapa = m;
		clonador = new ClonadorEntidades();
		lista = new LinkedList<Atacante>();
		rand = new Random();
		inicializarHorda();
		crearEnemigos();
	}

	public LinkedList<Atacante> crearAtacantes() {
		LinkedList<Atacante> ret = new LinkedList<Atacante>();
		for (Atacante e : atacantes)
			ret.add(e);
		return ret;
	}

	private void crearEnemigos() {
		atacantes = new LinkedList<Atacante>();
		int cantEnemigos = 10;
		for (int i = 0; i < cantEnemigos; i++) {
			atacantes.add(crearAtacanteRandom());
		}
	}

	private void inicializarHorda() {
		lista.add(new Ninja(870, 350, mapa));
		lista.add(new Espadachin(0, 0, mapa));
		lista.add(new Arquero(0, 0, mapa));
	}

	private Atacante crearAtacanteRandom() {
		int ent = lista.size();
		int i = rand.nextInt(ent);
		return clonador.clonarAtacantes(lista.get(i));
	}

}
