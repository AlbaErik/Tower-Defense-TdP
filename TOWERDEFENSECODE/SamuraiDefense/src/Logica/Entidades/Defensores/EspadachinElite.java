package Logica.Entidades.Defensores;

import Grafica.Entidades.Defensores.EspadachinEliteGrafico;
import Logica.Mapa.Mapa;

public class EspadachinElite extends Defensor {
	
	
	public EspadachinElite(int x,int y,Mapa m) {
		super(x,y,m);
		this.life=300;
		this.damage=50;
		this.attackSpeed=2;
		this.range=1;
		this.cost=30;
		this.grafico=new EspadachinEliteGrafico(x,y,m.getPanelMapa(),this);
	}


}
