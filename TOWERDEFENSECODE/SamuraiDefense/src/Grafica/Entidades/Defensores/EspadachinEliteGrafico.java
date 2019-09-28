package Grafica.Entidades.Defensores;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public class EspadachinEliteGrafico extends DefensorGrafico{
	private String palabras[]= {"EspadachinStanding","EspadachinAttacking","EspadachinDying"};

	public EspadachinEliteGrafico(int x, int y,PanelMapa m,Entidad e) {
		super(x,y,m,e);
		graficos=new ImageIcon[3];
		
		for(int i=0;i<palabras.length;i++) {
			graficos[i]=new ImageIcon("Sprites/Personajes/Defensores/"+ palabras[i]+".gif");
		}
		setGraficoInicio(x,y);
	}
	
	public JLabel getGraficoActual() {
		return graficoActual;
	}
	
	public void setGraficoInicio(int x,int y) {
		graficoActual.setIcon(graficos[0]);
		graficoActual.setBounds(x, y, ancho, 80);//80
	}
	
	public void cambiarPos(int x,int y) {
		pos.setLocation(x,y);
		graficoActual.setBounds(x,y, ancho, 80);//80	
	}
}
