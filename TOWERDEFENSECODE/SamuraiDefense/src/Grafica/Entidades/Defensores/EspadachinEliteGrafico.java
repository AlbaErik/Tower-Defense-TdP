package Grafica.Entidades.Defensores;

import javax.swing.ImageIcon;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public class EspadachinEliteGrafico extends DefensorGrafico{
	private String palabras[]= {"EspadachinStanding","EspadachinAttacking","EspadachinDying"};

	public EspadachinEliteGrafico(int x, int y,PanelMapa m,Entidad e) {
		super(x, y,m,e);
		graficos=new ImageIcon[3];
		
		for(int i=0;i<palabras.length;i++) {
			graficos[i]=new ImageIcon("Sprites/"+ palabras[i]+".gif");
		}
		setGraficoInicio();
	}
}
