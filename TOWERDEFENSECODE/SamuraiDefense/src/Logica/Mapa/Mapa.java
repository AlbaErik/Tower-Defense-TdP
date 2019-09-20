package Logica.Mapa;
import java.util.LinkedList;

import Logica.Entidades.*;
public class Mapa{
	
	private static final int filas=6;
	private static final int columnas=10;
	private LinkedList<Entidad> misEntidades;
	
	public Mapa() {
		misEntidades = new LinkedList<Entidad>();
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

}
