package Logica.Entidades.Obstaculos;

import Grafica.Entidades.EntidadGrafica;
import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.Ninja;
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
	public Entidad copyEntidad() {
		Piedra ret = new Piedra( life, life, mapa);
		try {
			ret = (Piedra)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}

}
