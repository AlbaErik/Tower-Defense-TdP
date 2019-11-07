package Logica.Tienda;

import java.util.HashMap;
import java.util.Map;

import GUI.Paneles.PanelTienda;
import Logica.FabricaDefensores;
import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Premios.Premio;
import Logica.Juego.Juego;

public class Tienda {
	protected int oro;
	protected boolean eliminar;
	protected boolean premio;

	private PanelTienda tienda;
	private Juego juego;
	private Defensor personajeActual;
	protected Premio premioActual;
	private FabricaDefensores fabrica;
	private Map<Integer, Premio> powerUps = new HashMap<Integer, Premio>();

	public Tienda(Juego j) {
		juego = j;
		tienda = new PanelTienda(this);
		fabrica = new FabricaDefensores();
		personajeActual = null;
		premioActual=null;
		eliminar = false;
		premio=false;
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
		boolean toret=eliminar;
		eliminar=false;
		return toret;
	}
	
	public void setPremio(boolean p) {
		premio=p;
	}
	
	public boolean getPremio() {
		return premio;
	}

	public void setPremioActual(Premio p) {
		premioActual=p;
	}
	
	public Premio getPremioActual() {
		Premio toret=premioActual;
		premioActual=null;
		return toret;
	}
	public void setPersonajeActual(Defensor d) {
		if (d.getCost() <= oro)
			personajeActual = d;
	}

	public Defensor getPersonajeActual() {
		Defensor toret=personajeActual;
		personajeActual = null;
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
