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
	protected int ancho = 100, alto = 65;

	public EntidadGrafica(int x, int y, PanelMapa m, Entidad e) {
		mientidad = e;
		mapaPanel = m;
		pos = new Point(x, y);
		graficos = new ImageIcon[3];
		graficoActual = new JLabel();
	}

	public Entidad getEntidad() {
		return mientidad;
	}

	public JLabel getGraficoActual() {
		return graficoActual;
	}

	public void setGraficoInicio(int x, int y) {
		graficoActual.setIcon(graficos[0]);
		graficoActual.setBounds(x, y, ancho, alto);
	}

	public void cambiarPos(double x, int y) {
		Posicion p = new Posicion(x, y);
		mientidad.setPos(p);

		pos.setLocation(x, y);
		graficoActual.setBounds((int) x, y, ancho, alto);
	}

	public Point getPosGrafica() {
		return pos;
	}

	public void setX(int x) {
		pos.x = x;
	}

	public void setY(int y) {
		pos.y = y;
	}

}
