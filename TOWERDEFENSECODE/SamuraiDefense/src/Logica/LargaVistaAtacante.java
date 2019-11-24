package Logica;

import Logica.Colisionadores.Adistancia.ColCaminoLibreEnem;
import Logica.Colisionadores.Adistancia.VisitorDistancia;

public class LargaVistaAtacante extends LargaVista{

	private boolean caminoLibre;
	private VisitorDistancia col;
	
	public LargaVistaAtacante() {
		caminoLibre = true;
		col = new ColCaminoLibreEnem(this);
	}
	
	@Override
	public VisitorDistancia getVisitorDistancia() {
		return col;
	}

	@Override
	public boolean getCaminoLibre() {
		return caminoLibre;
	}

	@Override
	public void setCaminoLibre(boolean c) {
		caminoLibre = c;		
	}

}
