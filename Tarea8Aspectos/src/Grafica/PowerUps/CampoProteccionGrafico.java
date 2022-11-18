package Grafica.PowerUps;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.PowerUps.PowerUp;

public class CampoProteccionGrafico extends PowerUpGrafico{
	private static final long serialVersionUID = 1L;
	
	public CampoProteccionGrafico(PowerUp p) {
		super(p);
		this.setIcon(new ImageIcon("Sprites/Objetos/Drops/CampoDeFuerzaDrop.png"));
		
	}

	@Override
	public JLabel getGrafico() {
		return this;
	}
}
	