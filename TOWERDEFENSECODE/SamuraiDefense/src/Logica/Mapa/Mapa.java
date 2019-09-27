package Logica.Mapa;
import java.util.LinkedList;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.*;
import Logica.Mapa.Niveles.Nivel;
import Logica.Tienda.Tienda;
public class Mapa{
	
	private static final int filas=6;
	private static final int columnas=10;
	private LinkedList<Entidad> misEntidades;
	private LinkedList<Personaje> misDefensores;
	private PanelMapa mapagrafico;
	private Nivel nivel;
	private Tienda tienda;
	
	public Mapa(Nivel n) {
		nivel=n;
		misEntidades = new LinkedList<Entidad>();
		misDefensores= new LinkedList<Personaje>();
		mapagrafico=new PanelMapa(this);
	}
	/**
	 * Devuelve el ancho del mapa
	 * @return cantidad de filas del mapa
	 */
	public int getFilas() {
		return filas;
	}
	/**
	 * Devuelve el largo del mapa
	 * @return cantidad de columnas del mapa
	 */
	public int getColumnas() {
		return columnas;
	}
	
	public PanelMapa getPanelMapa() {
		return mapagrafico;
	}
	
	public Tienda getTienda() {
		return tienda;
	}
	
	public void setDefensor(Personaje p) {
		misDefensores.addFirst(p);
	}
	public Personaje getDefensor() {
		return misDefensores.getFirst();
	}

}
