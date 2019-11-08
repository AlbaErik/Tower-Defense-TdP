package Grafica.PowerUps;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.PowerUps.PowerUp;

public class BarricadaGrafico extends PowerUpGrafico {
private static final long serialVersionUID = 1L;
	
	public BarricadaGrafico(PowerUp p) {
		super(p);
		this.setIcon(new ImageIcon("Sprites/Objetos/Drops/BarricadaDrop.png"));
		
	}

	@Override
	public JLabel getGrafico() {
		return this;
	}
	

}
