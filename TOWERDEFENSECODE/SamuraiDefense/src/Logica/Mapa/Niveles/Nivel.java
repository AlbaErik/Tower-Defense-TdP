package Logica.Mapa.Niveles;

import Logica.Juego.Juego;
import Logica.Mapa.Hordas.Horda;

import java.util.LinkedList;

import Logica.Entidades.*;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Entidades.Obstaculos.VidaFinita.Piedra;

public abstract class Nivel {

	// AGREGAR FONDO

	private int presupuesto;
	protected Horda horda;
	private Nivel siguiente;
	protected Juego juego;
	protected LinkedList<Obstaculo> obstaculos;

	public Nivel(Juego j) {
		juego = j;
		juego.getPanelJuego().getVentanaInicial().add(juego.getMapa().getPanelMapa());
		obstaculos = new LinkedList<Obstaculo>();
		crearListaObstaculos();
	}

	private void crearListaObstaculos() {
		obstaculos.add(new Piedra(0, 0, juego.getMapa()));
		obstaculos.add(new Piedra(0, 0, juego.getMapa()));
	}

	public abstract LinkedList<Entidad> crearHorda();

	public abstract void getSigNivel();

	public Juego getJuego() {
		return juego;
	}

	public abstract LinkedList<Obstaculo> crearObstaculos();
}
