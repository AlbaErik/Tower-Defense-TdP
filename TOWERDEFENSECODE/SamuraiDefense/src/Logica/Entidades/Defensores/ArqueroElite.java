package Logica.Entidades.Defensores;

import Grafica.Entidades.Defensores.ArqueroEliteGrafico;
import Logica.Mapa.Mapa;

public class ArqueroElite extends Defensor {

	public ArqueroElite(int x, int y, Mapa m) {
		super(x, y, m);
		
		this.grafico=new ArqueroEliteGrafico(x,y,m.getPanelMapa(),this);
	}

}
