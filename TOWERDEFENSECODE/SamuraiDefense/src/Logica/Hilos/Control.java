package Logica.Hilos;

import java.util.LinkedList;

import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;
import Logica.Mapa.Posicion;

public class Control {
	private LinkedList<Entidad> lista;
	private Mapa map;

	public Control(Mapa m) {
		map = m;
		lista = m.getColeccion();
	}

	public void chequearColision() {

		lista = map.getColeccion();
		for (Entidad ent1 : lista) {
			Posicion e1 = ent1.getPos();
			for (Entidad ent2 : lista) {
				Posicion e2 = ent2.getPos();

				double distX = Math.abs(e1.getX() - e2.getX());

				boolean colisionX = distX < e1.getRectangle().getWidth()-40;
				boolean colisionY = e1.getY() == e2.getY();

				if (ent1 != ent2 && colisionX && colisionY)
					ent1.chocar(ent2.getColisionador());
			}
		}

	}

	/*
	 * Esta funcion determina si hay entidades en un rago y direccion del mapa. 
	 * La direccion a buscar depende del personaje que invoque la funcion.
	 */
	public Entidad hayEntidadEnRango(int x, int y, int rango, int direccion, Entidad miEntidad) {
		boolean avanzar = false;
		Entidad ent = null;
		while (rango > 0 && !avanzar) {
			avanzar = map.hayEnPos(x, y);
			if(avanzar) {
				//System.out.println("CONTROL: Se encontro la entidad: " + map.getEntidadEnPos(x, y).getClass());
				ent = map.getEntidadEnPos(x, y);
				ent.chocar(miEntidad.getColisionador());
			}
			rango--;
			x += direccion;
		}
		
		return ent;
	}

}
