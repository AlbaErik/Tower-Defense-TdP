package Logica.Mapa.Hordas;

import java.util.LinkedList;
import java.util.Random;

import Logica.Entidades.Atacantes.Atacante;
import Logica.Mapa.Mapa;
import Logica.Mapa.Niveles.ClonadorEntidades;

public abstract class Horda {
	
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
	}

	public abstract LinkedList<Atacante> crearAtacantes();

	
}
