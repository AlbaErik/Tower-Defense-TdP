package Logica.Entidades.Obstaculos.VidaFinita;

import Grafica.Entidades.EntidadGrafica;
import Grafica.Entidades.Obstaculos.VidaFinita.PiedraGrafica;
import Logica.Entidades.Entidad;
import Logica.Inteligencia.Inteligencia;
import Logica.Mapa.Mapa;

public class Piedra extends Entidad{

	public Piedra(int x,int y,Mapa m) {
		super(x,y,m);
		
		grafico=new PiedraGrafica(x,y,m.getPanelMapa(),this);
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

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();		
	}

}
