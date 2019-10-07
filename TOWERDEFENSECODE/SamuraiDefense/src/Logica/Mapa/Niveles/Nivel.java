package Logica.Mapa.Niveles;

import Logica.Juego.Juego;
import Logica.Mapa.Mapa;
import Logica.Mapa.Hordas.Horda;

import java.util.LinkedList;

import Logica.Entidades.*;

public abstract class Nivel {
	
	//AGREGAR FONDO
	
	private int presupuesto;
	protected Horda horda;
	private Nivel siguiente;
	protected Juego juego;

	public Nivel(Juego j) {
		juego = j;
		juego.getPanelJuego().getVentanaInicial().add(juego.getMapa().getPanelMapa());
	}

	public abstract LinkedList<Entidad> crearHorda();

	public abstract void getSigNivel();

	public Juego getJuego() {
		return juego;
	}
}
