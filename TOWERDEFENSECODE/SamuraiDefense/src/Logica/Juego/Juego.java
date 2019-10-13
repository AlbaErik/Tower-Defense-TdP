package Logica.Juego;

import java.util.LinkedList;

import GUI.Paneles.PanelJuego;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;
import Logica.Mapa.Niveles.Nivel;
import Logica.Mapa.Niveles.Nivel1;
import Logica.Tienda.Tienda;

public class Juego {
	private PanelJuego Gui;
	// private int tiempo;
	private Tienda tienda;
	private Nivel nivel;
	private Mapa mapa;
	private LinkedList<Entidad> misAtacantes;
	private LinkedList<Entidad> miHorda;

	/**
	 * Se inicializa el juego en el Nivel 1
	 * 
	 * @param g
	 */
	public Juego(PanelJuego g) {
		Gui = g;
		tienda = new Tienda(this);
		mapa = new Mapa(this);
		misAtacantes = new LinkedList<Entidad>();
	}

	public void crearNivel() {
		nivel = new Nivel1(this);
	}

	/**
	 * public void aumentarTiempo() { tiempo++;
	 * Gui.getPanelStats().actualizarTiempo(); }
	 **/

	public void iniciar() {

	}

	public void inicializarHorda() {
		miHorda = nivel.crearHorda();
	}

	public void agregarAtacante() { // cambiar, que agregue de a uno y que lo mueva
		if (!miHorda.isEmpty()) {
			Entidad atacante = miHorda.getFirst();
			mapa.agregarEntidadAlCampo(atacante);
			misAtacantes.add(atacante);
			miHorda.remove(miHorda.getFirst());
		}
	}

	public void moverAtacantes() {
		for (Entidad e : mapa.getColeccion()) {
			e.getInteligencia().mover();
			mapa.getPanelMapa().repaint();
		}
	}
	
	public void atacarAtacantes() {
		for (Entidad e : mapa.getColeccion()) {
			e.getInteligencia().atacarIA();
			mapa.getPanelMapa().repaint();
		}
	}
	

	public void reanudar() {
		// TODO Auto-generated method stub

	}

	public Tienda getTienda() {
		return tienda;
	}

	public PanelJuego getPanelJuego() {
		return Gui;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public Mapa getMapa() {
		return mapa;
	}

}
