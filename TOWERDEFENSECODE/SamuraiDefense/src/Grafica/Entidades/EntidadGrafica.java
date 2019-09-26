package Grafica.Entidades;


import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;
import Logica.Mapa.Posicion;


public class EntidadGrafica{
	protected PanelMapa mapa;
	protected ImageIcon graficos[];
	protected JLabel graficoActual;
	protected Point pos;
	protected Entidad mientidad;
	protected int ancho=100,alto=65;
	
	public EntidadGrafica(int x,int y,PanelMapa m,Entidad e) {
		mientidad=e;
		mapa=m;
		pos=new Point(x,y);
		graficos=new ImageIcon[3];
		graficoActual=new JLabel();
	}
	
	public Entidad getEntidad() {
		return mientidad;
	}
	public JLabel getGraficoActual() {
		return graficoActual;
	}
	
	public void setGraficoInicio() {
		graficoActual.setIcon(graficos[0]);
	}
	
	public void cambiarPos(int x,int y) {
		pos.setLocation(x,y);
		graficoActual.setBounds(x,y, ancho, alto);
	}
	public Point getPosGrafica() {
		return pos;
	}

}
