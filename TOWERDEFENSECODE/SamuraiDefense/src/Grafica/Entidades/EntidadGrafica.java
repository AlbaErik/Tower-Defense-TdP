package Grafica.Entidades;

import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;
import Logica.Mapa.Posicion;

public abstract class EntidadGrafica {
	
	protected PanelMapa mapaPanel;
	protected ImageIcon graficos[];
	protected JLabel graficoActual;
	protected Point pos;
	protected Entidad mientidad;
	protected int ancho = 120, alto = 120;

	public EntidadGrafica(int x, int y, PanelMapa m, Entidad e){
		mientidad = e;
		mapaPanel = m;
		pos = new Point(x, y);
		graficos = new ImageIcon[4];
		graficoActual = new JLabel();
	}

	public Entidad getEntidad() {
		return mientidad;
	}

	public JLabel getGraficoActual() {
		return graficoActual;
	}

	public void cambiarPos(double x, int y) {
		Posicion p = new Posicion(x, y);
		mientidad.setPos(p);

		pos.setLocation(x, y);
		graficoActual.setBounds((int) x, y, ancho, alto);
	}

}
