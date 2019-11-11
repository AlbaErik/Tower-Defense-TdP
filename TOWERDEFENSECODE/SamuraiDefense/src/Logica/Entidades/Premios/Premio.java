package Logica.Entidades.Premios;

import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public abstract class Premio extends Entidad{
    protected int clave;
    
	protected Premio(int x, int y, Mapa m) {
		super(x, y, m);
	}
	
	public int getClave() {
		return clave;
	}
	
	public abstract boolean queHago(int x,int y);
}
