package Grafica.Entidades.Atacantes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Grafica.Mapa.PanelMapa;

public class NinjaGrafico extends AtacanteGrafico{
private String palabras[]= {"NinjaRunning","NinjaAttacking","NinjaDying"};

	public NinjaGrafico(int x, int y, PanelMapa m) {
		super(x, y, m);
		graficos=new ImageIcon[3];
		
		for(int i=0;i<palabras.length;i++) {
			graficos[i]=new ImageIcon("Sprites/Personajes/Atacantes/"+ palabras[i]+".gif");
		}
		setGraficoInicio(x,y);
	}
	
	public JLabel getGraficoActual() {
		return graficoActual;
	}
	
	public void setGraficoInicio(int x,int y) {
		graficoActual.setIcon(graficos[0]);
		graficoActual.setBounds(x, y, ancho, alto);
	}

}