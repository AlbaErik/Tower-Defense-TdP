package Logica.Entidades.Obstaculos;

import Grafica.Entidades.EntidadGrafica;
import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.Ninja;
import Logica.Inteligencia.Inteligencia;
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

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	@Override
	public Inteligencia getInteligencia() {
		// TODO Auto-generated method stub
		return null;
	}

}
