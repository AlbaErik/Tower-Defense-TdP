package Logica.PowerUps;

import javax.swing.JLabel;

import Grafica.PowerUps.PowerUpGrafico;
import Logica.Mapa.Mapa;

public abstract class PowerUp {
	protected Mapa map;
	protected int clave;
	protected PowerUpGrafico grafica;
	
	protected PowerUp(Mapa m) {
		map = m;
	}
	
	public JLabel getGrafico() {
		return grafica.getGrafico();
	}
	
	public abstract void morir();
	
	public abstract void click();
	
}
