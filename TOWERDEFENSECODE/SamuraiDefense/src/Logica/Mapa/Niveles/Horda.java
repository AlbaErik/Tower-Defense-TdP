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
		Entidad ent = crearAtacante();
		System.out.println("HashCode de la entidad: " + ent.hashCode());
		System.out.println("Se creo la horda");

		
	}
	
	private void inicializarHorda() {
		lista.add(new Ninja(870, 350, mapa)); // Falta agregar el resto de los enemigos y ubicarlo en el mapa graficamente
		lista.add(new Ninja(0, 0, mapa)); // Falta agregar el resto de los enemigos y ubicarlo en el mapa graficamente
	}
	public Entidad crearAtacante(){
		int i = rand.nextInt(2); //devuelve enteros de 0..n-1
		System.out.println(i + " Entidad: ");
		lista.get(i).getPos().tostring();
		return lista.get(i).copyEntidad();
		
	}

}
