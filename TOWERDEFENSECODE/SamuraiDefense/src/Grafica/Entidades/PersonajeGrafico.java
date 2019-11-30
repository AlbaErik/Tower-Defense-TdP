package Grafica.Entidades;

import Grafica.Mapa.PanelMapa;

public abstract class PersonajeGrafico extends EntidadGrafica{	
	
	protected PersonajeGrafico(int x,int y, PanelMapa m) {
		super(x,y,m);
	}

	public abstract void standing();

	public abstract void attack();
	
	public abstract void death();
	
	
	
	

}

