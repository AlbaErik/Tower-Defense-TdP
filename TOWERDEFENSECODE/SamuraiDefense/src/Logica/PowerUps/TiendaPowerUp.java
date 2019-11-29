package Logica.PowerUps;

import java.util.LinkedList;
import java.util.Random;

import Logica.Fabricas.FabricaPowerUp;
import Logica.Fabricas.PowerUps.FabricaBarricada;
import Logica.Fabricas.PowerUps.FabricaBolsaDeDinero;
import Logica.Fabricas.PowerUps.FabricaBomba;
import Logica.Fabricas.PowerUps.FabricaCampoDeProteccion;
import Logica.Fabricas.PowerUps.FabricaPocionDeFuerza;
import Logica.Mapa.Mapa;
import Logica.PowerUps.Preciosos.*;
import Logica.PowerUps.Temporales.*;

public class TiendaPowerUp {

	private LinkedList<FabricaPowerUp> lista;
	private Random rand;
	private Mapa map;

	public TiendaPowerUp(Mapa m) {
		map = m;
		rand = new Random();
		lista = new LinkedList<FabricaPowerUp>();
		inicializarLista();
	}

	private void inicializarLista() {
		lista.add(new FabricaCampoDeProteccion(map));
		lista.add(new FabricaBolsaDeDinero(map));
		lista.add(new FabricaPocionDeFuerza(map));
		lista.add(new FabricaBarricada(map));
		lista.add(new FabricaBomba(map));
	}

	public PowerUp getRandom() {
		int num = rand.nextInt(lista.size());
		return lista.get(num).crearPowerUp();
	}

}
