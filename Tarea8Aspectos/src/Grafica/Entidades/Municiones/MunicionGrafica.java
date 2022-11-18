package Grafica.Entidades.Municiones;

import Grafica.Entidades.EntidadGrafica;
import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Municiones.Municion;
import Logica.Mapa.Posicion;

public abstract class MunicionGrafica extends EntidadGrafica {

	protected Municion miEntidad;

	public MunicionGrafica(int x, int y, PanelMapa m, Municion e) {
		super(x, y, m);
		miEntidad = e;
	}

	public Municion getEntidad() {
		return miEntidad;
	}

	public void cambiarPos(double x, int y) {
		Posicion p = new Posicion(x, y);
		miEntidad.setPos(p);

		pos.setLocation(x, y);
		graficoActual.setBounds((int) x, y, ancho, alto);
	}

}
