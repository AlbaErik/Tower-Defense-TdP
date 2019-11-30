package Grafica.Entidades;

import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Grafica.Mapa.PanelMapa;

public abstract class EntidadGrafica {
	
	protected PanelMapa mapaPanel;
	protected ImageIcon graficos[];
	protected JLabel graficoActual;
	protected Point pos;
	protected int ancho = 120, alto = 120;

	public EntidadGrafica(int x, int y, PanelMapa m){
		mapaPanel = m;
		pos = new Point(x, y);
		graficos = new ImageIcon[4];
		graficoActual = new JLabel();
	}

	public JLabel getGraficoActual() {
		return graficoActual;
	}

}
