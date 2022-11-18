package Logica.Entidades.Obstaculos.ConVida;

import javax.swing.JLabel;

import Grafica.Entidades.Obstaculos.VidaFinita.ObstaculoGraficoFinito;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Mapa.Mapa;

public abstract class ObstaculoConVida extends Obstaculo{

	protected ObstaculoGraficoFinito grafico;
	
	protected ObstaculoConVida(int x, int y, Mapa m) {
		super(x, y, m);
	}
	
	public void cambiarPosLogica(double x, int y){
		miCelda.setPos(x, y);
		grafico.cambiarPos(x, y);
		mapa.getPanelMapa().repaint();
	}
	
	public ObstaculoGraficoFinito getGrafico() {
		return grafico;
	}
	
	public JLabel getJLabel() {
		return grafico.getGraficoActual();
	}

}
