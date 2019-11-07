package Logica.PowerUps;

import java.util.LinkedList;
import java.util.Random;

import Logica.Mapa.Mapa;
import Logica.PowerUps.Preciosos.*;
import Logica.PowerUps.Temporales.*;

public class TiendaPowerUp {

	private LinkedList<PowerUp> lista;
	private Random rand;
	private Mapa map;

	public TiendaPowerUp(Mapa m) {
		map = m;
		rand = new Random();
		lista = new LinkedList<PowerUp>();
		inicializarLista();
	}

	private void inicializarLista() {
		lista.add(new CampoProteccion(map));
		lista.add(new BolsaDeDinero(map));
		lista.add(new PocionDeFuerza(map));
		lista.add(new Barricada(map));
		lista.add(new Bomba(map));
	}

	public PowerUp getRandom() {
		int num = rand.nextInt(lista.size());
		return lista.get(num).clone();
	}

}
