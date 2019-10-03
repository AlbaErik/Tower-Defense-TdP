package Logica.Mapa.Niveles;

import Logica.Juego.Juego;
import Logica.Mapa.Mapa;

public abstract class Nivel {
	
	//AGREGAR FONDO
	
	private int presupuesto;
	protected Horda horda;
	private Nivel siguiente;
	protected Juego juego;

	public Nivel(Juego j) {
		juego = j;
		horda = new Horda(juego.getMapa());
		juego.getPanelJuego().getVentanaInicial().add(juego.getMapa().getPanelMapa());
	}

	public abstract void crearHorda();

	public abstract void getSigNivel();

	public Juego getJuego() {
		return juego;
	}
}
