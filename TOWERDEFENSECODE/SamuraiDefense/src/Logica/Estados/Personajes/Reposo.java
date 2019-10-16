package Logica.Estados.Personajes;

import Logica.Entidades.Entidad;
import Logica.Estados.Estado;

public class Reposo extends Estado{

	public Reposo(Entidad e) {
		super(e);
	}

	@Override
	public void ejecutar() {
		entidad.getGrafico().posicionInicial();
	}

}
