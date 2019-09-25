package Grafica.Entidades;


import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Grafica.Mapa.PanelMapa;
import Logica.Mapa.Posicion;


public class EntidadGrafica{
	protected PanelMapa mapa;
	protected ImageIcon graficos[];
	protected JLabel graficoActual;
	protected Point pos;
	protected int ancho=100,alto=65;
	
	public EntidadGrafica(int x,int y,PanelMapa m) {
		mapa=m;
		pos=new Point(x,y);
		graficos=new ImageIcon[3];
		graficoActual=new JLabel();
	}
	
	
	public JLabel getGraficoActual() {
		return graficoActual;
	}
	
	public void setGraficoInicio() {
		graficoActual.setIcon(graficos[0]);
	}
	
	public void cambiarPos(int x,int y) {
		pos.setLocation(x,y);
		graficoActual.setBounds(pos.x,pos.y, ancho, alto);
	}
	public Point getPosGrafica() {
		return pos;
	}

}
