package Logica;

import Logica.Colisionadores.Adistancia.VisitorDistancia;

public abstract class LargaVista {
	
	protected LargaVista() {}
	
	public abstract VisitorDistancia getVisitorDistancia();
	public abstract boolean getCaminoLibre();
	public abstract void setCaminoLibre(boolean c);

}
