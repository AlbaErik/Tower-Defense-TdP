package Logica.Tienda;

import java.util.HashMap;
import java.util.LinkedList;
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
	protected boolean premioParaEntidad;

	private PanelTienda tienda;
	private Juego juego;
	private Defensor personajeActual;
	protected Premio premioActual;
	private FabricaDefensores fabrica;
	private Map<Integer, LinkedList<Premio>> powerUps;
	private int cantPremios = 4;

	public Tienda(Juego j) {
		juego = j;
		tienda = new PanelTienda(this);
		fabrica = new FabricaDefensores();
		personajeActual = null;
		premioActual = null;
		eliminar = false;
		premio = false;
		premioParaEntidad = false;
		oro = 5000;
		juego.actualizarOro(oro);
		inicializarMap();
	}

	private void inicializarMap() {
		powerUps = new HashMap<Integer, LinkedList<Premio>>();
		for (int i = 0; i <= cantPremios; i++)
			powerUps.put(i + 1, new LinkedList<Premio>());
	}

	/*
	 * Asume que el cliente sabe como usar las claves
	 */
	public void agregarPremio(int clave, Premio premio) {
		LinkedList<Premio> lista = powerUps.get(clave);
		lista.add(premio);
		powerUps.put(clave, lista);
	}

	public void setPremio(int clave) {
		LinkedList<Premio> lista = powerUps.get(clave); // PUEDE GENERAR UN NULL POINTER POR BOTONDEF Y BOTONELIM
		if (!lista.isEmpty()) {
			premioActual = lista.getFirst();
		} else {
			premioActual = null;
		}
	}

	public Premio getPremioActual() {
		Premio toret = premioActual;
		premioActual = null;
		return toret;
	}

	public void eliminarPremio(int clave) {
		LinkedList<Premio> lista = powerUps.get(clave);
		if (!lista.isEmpty()) {
			lista.remove(lista.getFirst());
		}
	}

	public boolean hayPremioActual() {
		return premioActual != null;
	}

	public boolean premioParaEntidad() {
		return premioParaEntidad;
	}

	public boolean hayPremio(int clave) {
		LinkedList<Premio> lista = powerUps.get(clave);
		return !lista.isEmpty();
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
		boolean toret = eliminar;
		eliminar = false;
		return toret;
	}

	public void setPersonajeActual(Defensor d) {
		if (d == null) {
			personajeActual = null;
		} else {
			if (d.getCost() <= oro)
				personajeActual = d;
		}
	}

	public Defensor getPersonajeActual() {
		Defensor toret = personajeActual;
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
