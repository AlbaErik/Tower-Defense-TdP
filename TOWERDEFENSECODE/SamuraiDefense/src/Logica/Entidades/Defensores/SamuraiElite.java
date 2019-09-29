package Logica.Entidades.Defensores;

import Grafica.Entidades.Defensores.SamuraiEliteGrafico;
import Logica.Mapa.Mapa;

public class SamuraiElite extends Defensor {
	
	public SamuraiElite(int x,int y,Mapa m) {
		super(x,y,m);
		
		this.grafico=new SamuraiEliteGrafico(x,y,m.getPanelMapa(),this);
	}

}
