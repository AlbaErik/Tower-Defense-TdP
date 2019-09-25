package Logica.Mapa.Obstaculos;

import Grafica.Entidades.EntidadGrafica;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public class Piedra extends Entidad{

	public Piedra(int x,int y,Mapa m) {
		super(x,y,m);
	}

	@Override
	public void setLife(int lp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntidadGrafica getGrafico() {
		return grafico;
	}

}
