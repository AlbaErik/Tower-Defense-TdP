package Logica.Mapa.Hordas;

import java.util.LinkedList;

import Logica.Entidades.Atacantes.Arquero;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Atacantes.Ejecutor;
import Logica.Entidades.Atacantes.Emperador;
import Logica.Entidades.Atacantes.Espadachin;
import Logica.Entidades.Atacantes.Necromante;
import Logica.Entidades.Atacantes.Ninja;
import Logica.Mapa.Mapa;

public class Horda3 extends Horda{

	public Horda3(Mapa m) {
		super(m);
		inicializarHorda();
		crearEnemigos1();
		crearEnemigos2();
		crearEnemigos3();
	}

	public LinkedList<Atacante> crearAtacantes1() {
		LinkedList<Atacante> ret = new LinkedList<Atacante>();
		for (Atacante e : atacantes1)
			ret.add(e);
		return ret;
	}
	
	public LinkedList<Atacante> crearAtacantes2() {
		LinkedList<Atacante> ret = new LinkedList<Atacante>();
		for (Atacante e : atacantes2)
			ret.add(e);
		return ret;
	}

	public LinkedList<Atacante> crearAtacantes3() {
		LinkedList<Atacante> ret = new LinkedList<Atacante>();
		for (Atacante e : atacantes3)
			ret.add(e);
		return ret;
	}
	
	
	private void crearEnemigos1() {
		atacantes1 = new LinkedList<Atacante>();
		int cantEnemigos = 12 ;
		for (int i = 0; i < cantEnemigos; i++) {
			atacantes1.add(crearAtacanteRandom());
		}
	}
	
	private void crearEnemigos2() {
		atacantes2 = new LinkedList<Atacante>();
		int cantEnemigos = 13;
		for (int i = 0; i < cantEnemigos; i++) {
			atacantes2.add(crearAtacanteRandom());
		}
	}
	
	private void crearEnemigos3() {
		atacantes3 = new LinkedList<Atacante>();
		int cantEnemigos = 15;
		for (int i = 0; i < cantEnemigos; i++) {
			atacantes3.add(crearAtacanteRandom());
		}
	}

	private void inicializarHorda() {
		lista.add(new Ninja(0, 0, mapa));
		lista.add(new Espadachin(0, 0, mapa));
		lista.add(new Arquero(0, 0, mapa));
		lista.add(new Ejecutor(0,0,mapa));
		lista.add(new Necromante(0,0,mapa));
		lista.add(new Emperador(0,0,mapa));
	}

	private Atacante crearAtacanteRandom() {
		int ent = lista.size();
		int i = rand.nextInt(ent);
		return lista.get(i).clone();
	}

}

