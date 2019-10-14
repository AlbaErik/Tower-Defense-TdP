package Logica.Mapa.Hordas;

import java.util.LinkedList;
import Logica.Entidades.Atacantes.*;
import Logica.Mapa.Mapa;

public class Horda1 extends Horda{
	

	public Horda1(Mapa m) {
		super(m);		
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
		lista.add(new Ejecutor(0,0,mapa));
		lista.add(new Necromante(0,0,mapa));
	}

	private Atacante crearAtacanteRandom() {
		int ent = lista.size();
		int i = rand.nextInt(ent);
		return lista.get(i).clone();
		//return clonador.clonarAtacantes(lista.get(i));
	}

}
