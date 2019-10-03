package Logica.Mapa.Niveles;

import java.util.LinkedList;
import java.util.Random;
import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.Ninja;
import Logica.Mapa.Mapa;

public class Horda {
	protected ClonadorEntidades clonador;
	protected LinkedList<Entidad> lista;
	protected Random rand;
	protected Mapa mapa;
	
	public Horda(Mapa m) {
		mapa = m;
		clonador = new ClonadorEntidades();
		lista = new LinkedList<Entidad>();
		rand = new Random();
		inicializarHorda();
	}
	
	private void inicializarHorda() {
		lista.add(new Ninja(870, 350, mapa)); // Falta agregar el resto de los enemigos y ubicarlo en el mapa graficamente
	}

}
