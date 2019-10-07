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
				double distY = Math.abs(e1.getY() - e2.getY());

				boolean colisionX = distX < e1.getRectangle().getWidth();
				boolean colisionY = distY < e1.getRectangle().getHeight();

				if (ent1 != ent2 && colisionX && colisionY) {
					System.out.print(" COLISION ");
					ent1.chocar(ent2);
					ent2.chocar(ent1);
				}

			}
		}

	}

}
