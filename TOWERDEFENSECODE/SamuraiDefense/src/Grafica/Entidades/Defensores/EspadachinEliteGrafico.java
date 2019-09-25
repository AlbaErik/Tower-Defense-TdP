package Grafica.Entidades.Defensores;

import javax.swing.ImageIcon;

import Grafica.Mapa.PanelMapa;

public class EspadachinEliteGrafico extends DefensorGrafico{
	private String palabras[]= {"EspadachinStanding","EspadachinAttacking","EspadachinDying"};

	public EspadachinEliteGrafico(int x, int y,PanelMapa m) {
		super(x, y,m);
		graficos=new ImageIcon[3];
		
		for(int i=0;i<palabras.length;i++) {
			graficos[i]=new ImageIcon("Sprites/"+ palabras[i]+".gif");
		}
		setGraficoInicio();
	}
}
