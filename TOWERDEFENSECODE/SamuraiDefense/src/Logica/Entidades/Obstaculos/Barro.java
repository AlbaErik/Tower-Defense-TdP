package Logica.Entidades.Obstaculos;
import Grafica.Entidades.EntidadGrafica;
import Logica.Entidades.Entidad;
import Logica.Inteligencia.Inteligencia;
import Logica.Mapa.Mapa;

public class Barro extends Entidad{

	public Barro(int x,int y,Mapa m) {
		super(x,y,m);
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inteligencia getInteligencia() {
		// TODO Auto-generated method stub
		return null;
	}


}
