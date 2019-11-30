package Logica.Entidades.Premios;

import javax.swing.JLabel;

import Grafica.Entidades.EntidadGrafica;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public abstract class Premio extends Entidad{
    protected int clave;
    protected EntidadGrafica grafico;
    
	protected Premio(int x, int y, Mapa m) {
		super(x, y, m);
	}
	
	public void cambiarPosLogica(double x, int y){
		miCelda.setPos(x, y);
		grafico.cambiarPos(x, y);
		mapa.getPanelMapa().repaint();
	}

	public JLabel getJLabel() {
		return grafico.getGraficoActual();
	}
	
	public int getClave() {
		return clave;
	}
	
	public abstract boolean queHago(int x,int y);
}
