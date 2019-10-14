package Logica.Mapa.Hordas;

import java.util.LinkedList;
import java.util.Random;

import Logica.Entidades.Atacantes.Atacante;
import Logica.Mapa.Mapa;

public abstract class Horda {
	
	protected LinkedList<Atacante> lista;
	protected Random rand;
	protected Mapa mapa;
	protected LinkedList<Atacante> atacantes;
	
	public Horda(Mapa m) {
		mapa = m;
		
		lista = new LinkedList<Atacante>();
		rand = new Random();
	}

	public abstract LinkedList<Atacante> crearAtacantes();

	
}
