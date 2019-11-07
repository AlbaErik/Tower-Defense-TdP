package Logica.Mapa;

import java.util.LinkedList;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.*;
import Logica.Entidades.Defensores.Defensor;
import Logica.Juego.Juego;
import Logica.Mapa.Niveles.Nivel;
import Logica.Tienda.Tienda;

public class Mapa {

	private LinkedList<Entidad> misEntidades;
	private PanelMapa mapagrafico;
	private Nivel nivel;
	private Juego juego;
	private Tienda tienda;

	public Mapa(Juego j) {
		juego = j;
		nivel = juego.getNivel();
		misEntidades = new LinkedList<Entidad>();
		mapagrafico = new PanelMapa(this);
		tienda = juego.getTienda();
	}
	
	public void agregarEntidadAlCampo(Entidad e) {
		mapagrafico.agregarEntidad(e);
	}

	public void agregarEntidadAlCampoEnPosActual(Entidad e) {
		mapagrafico.agregarEntidadEnPosActual(e);
	}
	
	public void actualizarOroTienda(int o) {
		tienda.actualizarOro(o);
	}
	
	public void eliminarEntidad(Entidad e) {// Elimina al defensor de la lista de defensores
		Entidad actual = misEntidades.getFirst();
		for (Entidad i : misEntidades) {
			if (i.hashCode() == e.hashCode())
				actual = i;
		}		
		misEntidades.remove(actual);
		mapagrafico.eliminarEntidad(actual);		
	}	

	public boolean hayEntidades() {
		return !misEntidades.isEmpty();
	}

	public boolean hayEnPos(int x, int y) {
		boolean ocupada = false;
		for (int i = 0; i < misEntidades.size() && !ocupada; i++) {
			double X = misEntidades.get(i).getPos().getX();
			double Y = misEntidades.get(i).getPos().getY();

			if ((X == (double) x) && (Y == (double) y))
				ocupada = true;
		}
		return ocupada;
	}
	
	public boolean tiendaGetEliminar() {
		return tienda.getEliminar();
	}
	
	public Entidad getEntidadEnPos(int x, int y) {
		Entidad toRet = null;
		for(Entidad e : misEntidades) {
			int X = (int)e.getPos().getX();
			int Y = (int)e.getPos().getY();
			if( X == x && y == Y) {
				toRet = e;
				break;
			}				
		}
		return toRet;
	}

	public PanelMapa getPanelMapa() {
		return mapagrafico;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public Juego getJuego() {
		return juego;
	}
		
	public Defensor getPersonajeActual() {
		return tienda.getPersonajeActual();
	}	
	
	public LinkedList<Entidad> getColeccion() {
		LinkedList<Entidad> nueva = new LinkedList<Entidad>();
		for (Entidad e : misEntidades) {
			nueva.addFirst(e);
		}
		return nueva;
	}
	
	public void setEntidad(Entidad d) {
		misEntidades.addFirst(d);
	}
}
