package Logica.Mapa;

import java.util.LinkedList;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.*;
import Logica.Entidades.Defensores.Defensor;
import Logica.Juego.Juego;
import Logica.Mapa.Niveles.Nivel;
import Logica.Tienda.Tienda;

public class Mapa {

	private static final int filas = 6;
	private static final int columnas = 10;
	private LinkedList<Entidad> misEntidades;
	private LinkedList<Defensor> misDefensores;
	private PanelMapa mapagrafico;
	private Nivel nivel;
	private Juego juego;
	private Tienda tienda;

	public Mapa(Juego j) {
		juego = j;
		nivel = j.getNivel();
		misEntidades = new LinkedList<Entidad>();
		misDefensores = new LinkedList<Defensor>();
		mapagrafico = new PanelMapa(this);
		tienda = j.getTienda();
	}

	/**
	 * Devuelve el ancho del mapa
	 * 
	 * @return cantidad de filas del mapa
	 */
	public int getFilas() {
		return filas;
	}

	/**
	 * Devuelve el largo del mapa
	 * 
	 * @return cantidad de columnas del mapa
	 */
	public int getColumnas() {
		return columnas;
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

	public Tienda getTienda() {
		return tienda;
	}

	public void setEntidad(Entidad d) {
		misEntidades.addFirst(d);
		d.setLugarEnMapa(misEntidades.lastIndexOf(misEntidades.getFirst()));
		System.out.println("Tamaño de Lista: " + misEntidades.size());
		System.out.println("Ultima entidad agregada: "+ misEntidades.getFirst().getClass());
	}

	public Entidad getEntidad() {
		return misEntidades.getFirst();
	}

	public void eliminarEntidad(int i) {// Elimina al defensor de la lista de defensores
		misEntidades.remove(i);
	}

	public LinkedList<Entidad> getCol() {
		return misEntidades;
	}

	public LinkedList<Entidad> getColeccion() {
		LinkedList<Entidad> nueva = new LinkedList<Entidad>();
		for (Entidad e : misEntidades) {
			nueva.addFirst(e);
		}
		return nueva;
	}

	public boolean hayEntidades() {
		return !misEntidades.isEmpty();
	}

	public boolean hayEnPos(int x, int y) {
		boolean toret = false;
		
		for (int i = 0; i < misEntidades.size(); i++) {
			double X = misEntidades.get(i).getPos().getX();
			double Y = misEntidades.get(i).getPos().getY();

			if ((X == (double) x) && (Y == (double) y))
				toret = true;
		}

		return toret;
	}

}
