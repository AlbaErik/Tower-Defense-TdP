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
	protected LinkedList<Entidad> atacantes;
	
	public Horda(Mapa m) {
		mapa = m;
		clonador = new ClonadorEntidades();
		lista = new LinkedList<Entidad>();
		rand = new Random();
		inicializarHorda();		
		crearEnemigos();
	}
	
	public LinkedList<Entidad> getAtacantes(){
		LinkedList<Entidad> ret = new LinkedList<Entidad>();
		for(Entidad e : atacantes)
			ret.add(e);
		return ret;
	}
	
	private void crearEnemigos() {
		atacantes = new LinkedList<Entidad>();
		int cantEnemigos = 4;
		for(int i = 0; i < cantEnemigos; i++) {
			atacantes.add(crearAtacante());
		}
	}
	
	private void inicializarHorda() {
		lista.add(new Ninja(870, 350, mapa)); 
		lista.add(new Ninja(0, 0, mapa)); 
	}
	public Entidad crearAtacante(){
		int ent = lista.size();
		int i = rand.nextInt(ent);
		return lista.get(i).copyEntidad();
	}

}
