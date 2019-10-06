package Logica.Mapa.Niveles;

import java.util.LinkedList;
import java.util.Random;
import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Atacantes.Ninja;
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
		int cantEnemigos = 4;
		for (int i = 0; i < cantEnemigos; i++) {
			atacantes.add(crearAtacante());
		}

		for (Entidad e : atacantes) {
			System.out.println("HORDA entidad HASHCODE: " + e.hashCode());
			System.out.println("HORDA entidad grafica HASHCODE: " + e.getGrafico().hashCode());
			System.out.println("HORDA entidad GRAFICO ACTUAL HASHCODE: " + e.getGrafico().getGraficoActual().hashCode());
			System.out.println();
		}

	}

	private void inicializarHorda() {
		lista.add(new Ninja(870, 350, mapa));
	}

	private Atacante crearAtacante() {
		int ent = lista.size();
		int i = rand.nextInt(ent);
		return clonador.clonarAtacantes(lista.get(i));
	}

}
