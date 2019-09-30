package Grafica.Entidades;

import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.text.Position;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;
import Logica.Mapa.Posicion;

public class EntidadGrafica {
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

	public void cambiarPos(int x, int y) {
		Posicion p = new Posicion(x,y);
		mientidad.setPos(p);
		
		pos.setLocation(x, y);
		graficoActual.setBounds(x, y, ancho, alto);
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

	public void posicionInicial() {
		this.getGraficoActual().setIcon(graficos[0]);
	}

	public void atacar() {
		this.getGraficoActual().setIcon(graficos[1]);
	}

	public void morir() {
		this.getGraficoActual().setIcon(graficos[2]);
	}

}
