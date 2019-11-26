package Logica.Mapa.Hordas;

import java.util.LinkedList;
import java.util.Random;
import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Mapa.Mapa;

public abstract class Horda {

	protected LinkedList<Atacante> lista;
	protected Random rand;
	protected Mapa mapa;
	
	protected Horda(Mapa m) {
		mapa = m;
		lista = new LinkedList<Atacante>();
		rand = new Random();
	}
		
	protected Atacante crearAtacanteRandom() {
		int i = rand.nextInt(lista.size());
		return lista.get(i).clone();
	}
	
	public LinkedList<Entidad> crearAtacantes(int cantidad) {
		LinkedList<Entidad> list = new LinkedList<Entidad>();
		while(cantidad > 0) {
			list.add(crearAtacanteRandom());
			cantidad--;
		}
		return list;
	}
}
