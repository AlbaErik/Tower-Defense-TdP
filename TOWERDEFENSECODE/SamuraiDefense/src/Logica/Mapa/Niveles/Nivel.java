package Logica.Mapa.Niveles;

import Logica.Juego.Juego;
import Logica.Mapa.HordaObstaculos.CreadorObstaculo;
import Logica.Mapa.Hordas.Horda;

import java.util.LinkedList;

import Logica.Entidades.*;
import Logica.Entidades.Obstaculos.Obstaculo;

public abstract class Nivel {

	// protected Horda horda;
	protected CreadorObstaculo creadorObs;
	protected Juego juego;
	protected Nivel siguiente;
	protected LinkedList<Horda> misHordas;
	protected LinkedList<Obstaculo> obstaculos;

	protected Nivel(Juego j) {
		juego = j;
		juego.getPanelJuego().getVentanaInicial().add(juego.getMapa().getPanelMapa());
		// crearHordas();
		obstaculos = new LinkedList<Obstaculo>();
		misHordas = new LinkedList<Horda>();
		creadorObs = new CreadorObstaculo(juego.getMapa());
	}

	public int getCantEnemigos() {
		int cont = 0;
		for (Horda h : misHordas) {
			cont += h.getCantEnemigos();
		}
		if(haySigNivel())
			cont += getSigNivel().getCantEnemigos();
		return cont;
	}

	protected abstract void crearHordas();

	// protected abstract LinkedList<Entidad> crearHorda1();

	// protected abstract LinkedList<Entidad> crearHorda2();

	// protected abstract LinkedList<Entidad> crearHorda3();

	protected Horda getHorda() {
		Horda toret = null;
		if (!misHordas.isEmpty()) {
			toret = misHordas.getFirst();
			misHordas.removeFirst();
		}
		return toret;
	}
	
	public abstract LinkedList<Entidad> getSigHorda();

	public boolean haySigHorda() {
		return !misHordas.isEmpty();
	}

	// protected abstract LinkedList<Obstaculo> crearObstaculos1();

	// protected abstract LinkedList<Obstaculo> crearObstaculos2();

	// protected abstract LinkedList<Obstaculo> crearObstaculos3();

	public abstract LinkedList<Obstaculo> getObstaculos();

	/*
	 * public boolean haySigObstaculos() { boolean toret = false; if (obstaculos1 ||
	 * obstaculos2 || obstaculos3) toret = true; return toret; }
	 */

	public abstract Nivel getSigNivel();

	public abstract boolean haySigNivel();

}
