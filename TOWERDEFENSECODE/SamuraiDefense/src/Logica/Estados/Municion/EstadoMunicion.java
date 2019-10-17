package Logica.Estados.Municion;

import Logica.Entidades.Municiones.Municion;
import Logica.Estados.Estado;

public class EstadoMunicion extends Estado{
	private Municion mun;
	
	public EstadoMunicion(Municion m) {
		mun = m;
	}

	@Override
	public void ejecutar() {
		mun.getIntel().mover();
	}

}
