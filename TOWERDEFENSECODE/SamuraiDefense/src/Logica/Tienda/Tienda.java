package Logica.Tienda;

import GUI.Paneles.PanelTienda;
import Logica.FabricaDefensores;
import Logica.Entidades.Defensores.Defensor;
import Logica.Juego.Juego;

public class Tienda {
	private PanelTienda tienda;
	private Juego juego;
	private Defensor personajeActual;
	private FabricaDefensores fabrica;

	public Tienda(Juego j) {
		juego = j;
		tienda = new PanelTienda(this);
		fabrica = new FabricaDefensores();
		personajeActual = null;
	}

	public PanelTienda getPanelTienda() {
		return tienda;
	}

	public Juego getJuego() {
		return juego;
	}

	public void setPersonajeActual(Defensor d) {
		personajeActual = d;
	}

	public Defensor getPersonajeActual() {
		Defensor toret = personajeActual;
		personajeActual = null;
		return toret;
	}

	public FabricaDefensores getFabrica() {
		return fabrica;
	}

}
