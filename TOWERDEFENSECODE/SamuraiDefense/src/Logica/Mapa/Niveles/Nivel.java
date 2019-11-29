package Logica.Mapa.Niveles;

import Logica.Juego.Juego;
import Logica.Mapa.HordaObstaculos.CreadorObstaculo;
import Logica.Mapa.Hordas.Horda;

import java.awt.Image;
import java.util.LinkedList;

import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Obstaculos.Obstaculo;

public abstract class Nivel {

	protected CreadorObstaculo creadorObs;
	protected Juego juego;
	protected Nivel siguiente;
	protected LinkedList<Horda> misHordas;
	protected LinkedList<Obstaculo> obstaculos;
	protected int cantidadEnems;
	protected int cantObs;

	protected Nivel(Juego j) {
		juego = j;
		//juego.getPanelJuego().getVentanaInicial().add(juego.getMapa().getPanelMapa());
		obstaculos = new LinkedList<Obstaculo>();
		misHordas = new LinkedList<Horda>();
		creadorObs = new CreadorObstaculo(juego.getMapa());
	}

	protected abstract void crearHordas();

	protected Horda getHorda() {
		Horda toret = null;
		if (!misHordas.isEmpty()) {
			toret = misHordas.getFirst();
			misHordas.removeFirst();
		}
		return toret;
	}
	
	public abstract LinkedList<Atacante> getSigHorda();

	public boolean haySigHorda() {
		return !misHordas.isEmpty();
	}
	
	public abstract LinkedList<Obstaculo> getObstaculos();

	public abstract Nivel getSigNivel();

	public abstract boolean haySigNivel();
	
	public abstract Image getFondo();

}
