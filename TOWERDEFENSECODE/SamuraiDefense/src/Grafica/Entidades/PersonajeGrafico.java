package Grafica.Entidades;


import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public abstract class PersonajeGrafico extends EntidadGrafica{	
	
	protected PersonajeGrafico(int x,int y, PanelMapa m,Entidad e) {
		super(x,y,m,e);
	}

	public abstract void standing();
	
	public abstract void standingFuerza();
	
	public abstract void running();

	public abstract void attack();
	
	public abstract void attackFuerza();

	public abstract void death();
	
	
	
	

}

