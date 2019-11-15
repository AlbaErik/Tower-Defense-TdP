package Logica.Mapa.Niveles;

import Logica.Juego.Juego;
import Logica.Mapa.Hordas.Horda;

import java.util.LinkedList;

import Logica.Entidades.*;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Entidades.Obstaculos.ConVida.Piedra;
import Logica.Entidades.Obstaculos.Temporales.Barro;

public abstract class Nivel {

	// AGREGAR FONDO

	protected Horda horda;
	protected boolean horda1, horda2, horda3, obstaculos1, obstaculos2, obstaculos3;
	protected Juego juego;
	protected Nivel siguiente;
	protected LinkedList<Obstaculo> obstaculos;

	protected Nivel(Juego j) {
		juego = j;
		juego.getPanelJuego().getVentanaInicial().add(juego.getMapa().getPanelMapa());
		obstaculos = new LinkedList<Obstaculo>();
		crearListaObstaculos();

	}

	private void crearListaObstaculos() {
		//obstaculos.add(new Piedra(0, 0, juego.getMapa()));
		obstaculos.add(new Barro(0, 0, juego.getMapa()));
	}

	protected abstract LinkedList<Entidad> crearHorda1();

	protected abstract LinkedList<Entidad> crearHorda2();

	protected abstract LinkedList<Entidad> crearHorda3();

	public abstract LinkedList<Entidad> getSigHorda();

	public boolean haySigHorda() {
		boolean toret = false;
		if (horda1 || horda2 || horda3)
			toret = true;
		return toret;
	}

	protected abstract LinkedList<Obstaculo> crearObstaculos1();

	protected abstract LinkedList<Obstaculo> crearObstaculos2();

	protected abstract LinkedList<Obstaculo> crearObstaculos3();

	public abstract LinkedList<Obstaculo> getSigObstaculos();

	public boolean haySigObstaculos() {
		boolean toret = false;
		if (obstaculos1 || obstaculos2 || obstaculos3)
			toret = true;
		return toret;
	}

	public abstract Nivel setSigNivel();

	public abstract boolean haySigNivel();

	public Juego getJuego() {
		return juego;
	}

}
