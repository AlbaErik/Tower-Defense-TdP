package Logica;

import Logica.Colisionadores.Adistancia.ColCaminoLibreDef;
import Logica.Colisionadores.Adistancia.VisitorDistancia;

public class LargaVistaDefensor extends LargaVista{
	
	private boolean caminoLibre;
	private VisitorDistancia col;
	
	public LargaVistaDefensor() {
		caminoLibre = true;
		col = new ColCaminoLibreDef(this);
	}
	
	public VisitorDistancia getVisitorDistancia() {
		return col;
	}
	
	public boolean getCaminoLibre() {
		return caminoLibre;
	}

	public void setCaminoLibre(boolean c) {
		caminoLibre = c;
	}
}
