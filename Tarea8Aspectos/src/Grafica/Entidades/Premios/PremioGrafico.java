package Grafica.Entidades.Premios;

import Grafica.Entidades.EntidadGrafica;
import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Premios.Premio;
import Logica.Mapa.Posicion;

public abstract class PremioGrafico extends EntidadGrafica{

	protected Premio miEntidad;

	public PremioGrafico(int x, int y, PanelMapa m, Premio e) {
		super(x, y, m);
		miEntidad = e;
	}
	
	public Premio getEntidad() {
		return miEntidad;
	}
	
	public void cambiarPos(double x, int y) {
		Posicion p = new Posicion(x, y);
		miEntidad.setPos(p);

		pos.setLocation(x, y);
		graficoActual.setBounds((int) x, y, ancho, alto);
	}

}
