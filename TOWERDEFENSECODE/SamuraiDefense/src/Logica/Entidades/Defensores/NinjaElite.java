package Logica.Entidades.Defensores;

import Grafica.Entidades.Defensores.NinjaEliteGrafico;
import Logica.Mapa.Mapa;

public class NinjaElite extends Defensor {

	public NinjaElite(int x, int y, Mapa m) {//Agregar valores a los atributos
		super(x, y, m);
		this.grafico=new NinjaEliteGrafico(x,y,m.getPanelMapa(),this);
		
	}

}
