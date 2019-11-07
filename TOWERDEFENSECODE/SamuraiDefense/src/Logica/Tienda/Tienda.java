package Logica.Tienda;

import GUI.Paneles.PanelTienda;
import Logica.FabricaDefensores;
import Logica.Entidades.Defensores.Defensor;
import Logica.Juego.Juego;

public class Tienda {
	protected int oro;
	private boolean eliminar;

	private PanelTienda tienda;
	private Juego juego;
	private Defensor personajeActual;
	private FabricaDefensores fabrica;

	public Tienda(Juego j) {
		juego = j;
		tienda = new PanelTienda(this);
		fabrica = new FabricaDefensores();
		personajeActual = null;
		eliminar = false;
		oro = 10000;
		juego.getPanelJuego().getPanelStats().actualizarOro(oro);
	}

	public PanelTienda getPanelTienda() {
		return tienda;
	}

	public Juego getJuego() {
		return juego;
	}

	public void setEliminar(boolean c) { // Lo utiliza el boton eliminar
		eliminar = c;
	}

	public boolean getEliminar() {
		return eliminar;
	}

	public void setPersonajeActual(Defensor d) {
		if (d.getCost() <= oro)
			personajeActual = d;
	}

	public Defensor getPersonajeActual() {
		Defensor toret = null;
		if (personajeActual != null) {
			toret = personajeActual;
			oro = oro - personajeActual.getCost();
			juego.getPanelJuego().getPanelStats().actualizarOro(oro);
			personajeActual = null;
		}
		return toret;
	}

	public FabricaDefensores getFabrica() {
		return fabrica;
	}

	public void actualizarOro(int o) {
		oro = oro + o;
		juego.getPanelJuego().getPanelStats().actualizarOro(oro);
	}

}
