package Grafica.PowerUps;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.PowerUps.PowerUp;

public class BolsadeMonedasGrafico extends PowerUpGrafico{
	private static final long serialVersionUID = 1L;
	
	public BolsadeMonedasGrafico(PowerUp p) {
		super(p);
		this.setIcon(new ImageIcon("Sprites/Objetos/BolsaMonedas.png"));
		
	}

	@Override
	public JLabel getGrafico() {
		return this;
	}
	
	

}
