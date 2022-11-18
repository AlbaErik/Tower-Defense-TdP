package Grafica.PowerUps;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.PowerUps.PowerUp;

public class PocionDeFuerzaGrafico extends PowerUpGrafico {
	private static final long serialVersionUID = 1L;

	public PocionDeFuerzaGrafico(PowerUp p) {
		super(p);
		this.setIcon(new ImageIcon("Sprites/Objetos/Drops/PocionFuerzaDrop.png"));
	}

	@Override
	public JLabel getGrafico() {
		return this;
	}

}
