package Logica.Mapa.HordaObstaculos;

import java.util.LinkedList;
import java.util.Random;

import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Fabricas.FabricaObstaculos;
import Logica.Fabricas.Obstaculos.FabricaBarro;
import Logica.Fabricas.Obstaculos.FabricaPiedra;
import Logica.Mapa.Mapa;

public class CreadorObstaculo {

	protected Mapa mapa;
	protected LinkedList<FabricaObstaculos> obstaculos;

	public CreadorObstaculo(Mapa map) {
		mapa = map;
		obstaculos = new LinkedList<FabricaObstaculos>();
		inicializarObstaculos();
	}

	private void inicializarObstaculos() {
		obstaculos.add(new FabricaPiedra(mapa));
		obstaculos.add(new FabricaBarro(mapa));
	}
		
	public LinkedList<Obstaculo> getObstaculosRandom(int cant){
		LinkedList<Obstaculo> list = new LinkedList<Obstaculo>();
		while(cant >= 0) {
			list.add(getObstaculoRandom());
			cant--;
		}
		return list;
	}
	
	protected Obstaculo getObstaculoRandom() {
		Random rand = new Random();
		int r = rand.nextInt(obstaculos.size());
		return obstaculos.get(r).crearObstaculo();
	}
	
}
