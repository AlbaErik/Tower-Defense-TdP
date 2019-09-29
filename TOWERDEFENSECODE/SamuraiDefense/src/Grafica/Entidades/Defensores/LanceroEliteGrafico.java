package Grafica.Entidades.Defensores;

import javax.swing.ImageIcon;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public class LanceroEliteGrafico extends DefensorGrafico{
	private String palabras[]= {"LanceroEliteStanding","LanceroEliteAttacking","LanceroEliteDying"};

	public LanceroEliteGrafico(int x, int y,PanelMapa m,Entidad e) {
		super(x,y,m,e);
		graficos=new ImageIcon[3];
		
		for(int i=0;i<palabras.length;i++) {
			graficos[i]=new ImageIcon("Sprites/Personajes/Defensores/"+ palabras[i]+".gif");
		}
		setGraficoInicio(x,y);
	}
	public void setGraficoInicio(int x,int y) {//Tiene que estar si o si en cada clase
		graficoActual.setIcon(graficos[0]);
		graficoActual.setBounds(x, y, 120, 80);//80
	}
	
	public void cambiarPos(int x,int y) {//Tiene que estar si o si en cada clase
		pos.setLocation(x,y);
		graficoActual.setBounds(x,y, 120, 80);//80	
	}
	
	public void posicionInicial() {
		this.getGraficoActual().setIcon(graficos[0]);
		graficoActual.setBounds(pos.x,pos.y, 120, 80);//120,80
	}
	public void atacar() {
		this.getGraficoActual().setIcon(graficos[1]);
		graficoActual.setBounds(pos.x,pos.y, 120, 80);//120,80
	}
	public void morir() {//QUIERO QUE ME MUESTRE LA ANIMACION Y QUE DESPUES MUERA
		this.getGraficoActual().setIcon(graficos[2]);
		graficoActual.setBounds(pos.x,pos.y, 120, 80);//120,80
		mapaPanel.getMapa().eliminarEntidad(mientidad.getLugarEnMapa());
		mapaPanel.eliminarDefensorG(this.graficoActual);
	}
	

}
