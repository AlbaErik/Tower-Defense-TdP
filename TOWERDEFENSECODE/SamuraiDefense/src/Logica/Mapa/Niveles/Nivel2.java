package Logica.Mapa.Niveles;

import java.util.LinkedList;
import java.util.Random;

import Logica.Entidades.Entidad;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Juego.Juego;
import Logica.Mapa.Hordas.Horda2;

public class Nivel2 extends Nivel {

	public Nivel2(Juego j) {
		super(j);
		horda = new Horda2(juego.getMapa());
		siguiente = new Nivel3(juego);
		horda1 = true;
		horda2 = true;
		horda3 = true;
		obstaculos1 = true;
		obstaculos2 = true;
		obstaculos3 = true;
	}

	@Override
	protected LinkedList<Entidad> crearHorda1() {
		LinkedList<Entidad> ret = new LinkedList<Entidad>();
		for (Entidad e : horda.crearAtacantes1())
			ret.add(e);
		horda1 = false;
		return ret;

	}

	@Override
	protected LinkedList<Entidad> crearHorda2() {
		LinkedList<Entidad> ret = new LinkedList<Entidad>();
		for (Entidad e : horda.crearAtacantes2())
			ret.add(e);
		horda2 = false;
		return ret;
	}

	@Override
	protected LinkedList<Entidad> crearHorda3() {
		LinkedList<Entidad> ret = new LinkedList<Entidad>();
		for (Entidad e : horda.crearAtacantes3())
			ret.add(e);
		horda3 = false;
		return ret;
	}

	@Override
	public LinkedList<Entidad> getSigHorda() {
		LinkedList<Entidad> toret = new LinkedList<Entidad>();
		if (horda1) {
			for (Entidad e : this.crearHorda1())
				toret.add(e);
		} else if (horda2) {
			for (Entidad e : this.crearHorda2())
				toret.add(e);
		} else if (horda3) {
			for (Entidad e : this.crearHorda3())
				toret.add(e);
		}

		return toret;

	}

	@Override
	protected LinkedList<Obstaculo> crearObstaculos1() {
		LinkedList<Obstaculo> lista = new LinkedList<Obstaculo>();
		int cantObstaculos = 1;// 3;
		Random rand = new Random();
		for (int i = 0; i < cantObstaculos; i++) {
			int k = rand.nextInt(obstaculos.size());
			Obstaculo clone = obstaculos.get(k).clone();
			lista.add(clone);
		}
		obstaculos1 = false;
		return lista;
	}

	@Override
	protected LinkedList<Obstaculo> crearObstaculos2() {
		LinkedList<Obstaculo> lista = new LinkedList<Obstaculo>();
		int cantObstaculos = 1;// 5;
		Random rand = new Random();
		for (int i = 0; i < cantObstaculos; i++) {
			int k = rand.nextInt(obstaculos.size());
			Obstaculo clone = obstaculos.get(k).clone();
			lista.add(clone);
		}
		obstaculos2 = false;
		return lista;
	}

	@Override
	protected LinkedList<Obstaculo> crearObstaculos3() {
		LinkedList<Obstaculo> lista = new LinkedList<Obstaculo>();
		int cantObstaculos = 1;// 6;
		Random rand = new Random();
		for (int i = 0; i < cantObstaculos; i++) {
			int k = rand.nextInt(obstaculos.size());
			Obstaculo clone = obstaculos.get(k).clone();
			lista.add(clone);
		}
		obstaculos3 = false;
		return lista;
	}

	@Override
	public LinkedList<Obstaculo> getSigObstaculos() {
		LinkedList<Obstaculo> toret = new LinkedList<Obstaculo>();
		if (obstaculos1) {
			for (Obstaculo o : this.crearObstaculos1())
				toret.add(o);
		} else if (obstaculos2) {
			for (Obstaculo o : this.crearObstaculos2())
				toret.add(o);
		} else if (obstaculos3) {
			for (Obstaculo o : this.crearObstaculos3())
				toret.add(o);
		}

		return toret;
	}

	@Override
	public Nivel setSigNivel() {
		return siguiente;
	}

	@Override
	public boolean haySigNivel() {
		// TODO Auto-generated method stub
		return siguiente != null;
	}
}
