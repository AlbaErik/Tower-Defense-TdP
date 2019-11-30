package Logica.Entidades.Obstaculos.Temporales;

import javax.swing.JLabel;

import Grafica.Entidades.Obstaculos.VidaFinita.ObstaculoGraficoTemporal;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Mapa.Mapa;

public abstract class ObstaculoTemporal extends Obstaculo{
	
	protected ObstaculoGraficoTemporal grafico;

	protected ObstaculoTemporal(int x, int y, Mapa m) {
		super(x, y, m);
		// TODO Auto-generated constructor stub
	}
	
	public void cambiarPosLogica(double x, int y){
		miCelda.setPos(x, y);
		grafico.cambiarPos(x, y);
		mapa.getPanelMapa().repaint();
	}
	
	public ObstaculoGraficoTemporal getGrafico() {
		return grafico;
	}
	
	public JLabel getJLabel() {
		return grafico.getGraficoActual();
	}

}
