package Grafica.PowerUps;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.PowerUps.PowerUp;

public class BombaGrafico extends PowerUpGrafico{
	
	private static final long serialVersionUID = 1L;
	
	public BombaGrafico(PowerUp p) {
		super(p);
		this.setIcon(new ImageIcon("Sprites/Objetos/Drops/BombaDrop.png"));
		
	}

	@Override
	public JLabel getGrafico() {
		return this;
	}
	

}
