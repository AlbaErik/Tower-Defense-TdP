package Logica.Entidades.Premios;

import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public abstract class Premio extends Entidad{
    protected int clave;
	public Premio(int x, int y, Mapa m) {
		super(x, y, m);
		// TODO Auto-generated constructor stub
	}
	
	public int getClave() {
		return clave;
	}
	
	public abstract boolean queHago(int x,int y);
}
