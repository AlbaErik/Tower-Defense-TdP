package Logica.Entidades.Defensores;

import Grafica.Entidades.Defensores.LanceroEliteGrafico;
import Logica.Mapa.Mapa;

public class LanceroElite extends Defensor {

	public LanceroElite(int x, int y, Mapa m) {
		super(x, y, m);
		
		this.grafico=new LanceroEliteGrafico(x,y,m.getPanelMapa(),this);
	}
}
