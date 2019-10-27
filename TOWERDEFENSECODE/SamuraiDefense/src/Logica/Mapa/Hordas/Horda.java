package Logica.Mapa.Hordas;

import java.util.LinkedList;
import java.util.Random;

import Logica.Entidades.Atacantes.Atacante;
import Logica.Mapa.Mapa;

public abstract class Horda {
	
	protected LinkedList<Atacante> lista;
	protected Random rand;
	protected Mapa mapa;
	protected LinkedList<Atacante> atacantes1,atacantes2,atacantes3;
	
	public Horda(Mapa m) {
		mapa = m;
		lista = new LinkedList<Atacante>();
		rand = new Random();
	}

	public abstract LinkedList<Atacante> crearAtacantes1();//CREA 1RA OLEADA
	public abstract LinkedList<Atacante> crearAtacantes2();//CREA 2DA OLEADA
	public abstract LinkedList<Atacante> crearAtacantes3();//CREA 3RA OLEADA

	
}
