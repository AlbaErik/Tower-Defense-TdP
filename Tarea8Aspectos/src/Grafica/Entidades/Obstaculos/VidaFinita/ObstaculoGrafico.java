package Grafica.Entidades.Obstaculos.VidaFinita;

import Grafica.Entidades.EntidadGrafica;
import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Mapa.Posicion;

public abstract class ObstaculoGrafico extends EntidadGrafica {

	protected Obstaculo miEntidad;

	public ObstaculoGrafico(int x, int y, PanelMapa m, Obstaculo e) {
		super(x, y, m);
		miEntidad = e;
	}

	public Obstaculo getEntidad() {
		return miEntidad;
	}

	public void cambiarPos(double x, int y) {
		Posicion p = new Posicion(x, y);
		miEntidad.setPos(p);

		pos.setLocation(x, y);
		graficoActual.setBounds((int) x, y, ancho, alto);
	}

}
