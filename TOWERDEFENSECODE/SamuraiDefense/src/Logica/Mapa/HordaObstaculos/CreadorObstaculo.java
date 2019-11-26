package Logica.Mapa.HordaObstaculos;

import java.util.LinkedList;
import java.util.Random;

import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Entidades.Obstaculos.ConVida.Piedra;
import Logica.Entidades.Obstaculos.Temporales.Barro;
import Logica.Mapa.Mapa;

public class CreadorObstaculo {

	protected Mapa mapa;
	protected LinkedList<Obstaculo> obstaculos;

	public CreadorObstaculo(Mapa map) {
		mapa = map;
		obstaculos = new LinkedList<Obstaculo>();
		inicializarObstaculos();
	}

	private void inicializarObstaculos() {
		obstaculos.add(new Piedra(0, 0, mapa));
		obstaculos.add(new Barro(0, 0, mapa));
	}
	
	protected Obstaculo getObstaculoRandom() {
		Random rand = new Random();
		int r = rand.nextInt(obstaculos.size());
		return obstaculos.get(r);
	}
	
	public LinkedList<Obstaculo> getObstaculosRandom(int cant){
		LinkedList<Obstaculo> list = new LinkedList<Obstaculo>();
		while(cant >= 0) {
			list.add(getObstaculoRandom().clone());
			cant--;
		}
		return list;
	}
}
