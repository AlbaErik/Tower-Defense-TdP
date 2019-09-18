package Grafica.Entidades.Defensores;

import javax.swing.ImageIcon;

public class EspadachinEliteGrafico extends DefensorGrafico{

	protected EspadachinEliteGrafico(int x, int y) {
		super(x, y);
		this.img[0]=new ImageIcon(this.getClass().getResource("/Sprites/EspadachinWalking.gif"));
		this.img[1]=new ImageIcon(this.getClass().getResource("/Sprites/EspadachinStanding.gif"));
	}

}
