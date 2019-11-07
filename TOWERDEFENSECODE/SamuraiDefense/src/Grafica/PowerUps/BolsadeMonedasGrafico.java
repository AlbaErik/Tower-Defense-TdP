package Grafica.PowerUps;

import javax.swing.ImageIcon;

import Logica.PowerUps.PowerUp;

public class BolsadeMonedasGrafico extends PowerUpGrafico{
	private static final long serialVersionUID = 1L;
	
	public BolsadeMonedasGrafico(PowerUp p) {
		super(p);
		grafico=new ImageIcon("Sprites/Objetos/BolsaMonedas.png");
	}
	
	

}
