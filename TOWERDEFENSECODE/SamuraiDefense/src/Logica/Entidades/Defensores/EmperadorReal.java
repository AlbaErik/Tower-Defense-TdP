package Logica.Entidades.Defensores;

import Grafica.Entidades.Defensores.EmperadorRealGrafico;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public class EmperadorReal extends Defensor {

	public EmperadorReal(int x, int y, Mapa m) {
		super(x, y, m);
		
		this.grafico=new EmperadorRealGrafico(x,y,m.getPanelMapa(),this);
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

}
