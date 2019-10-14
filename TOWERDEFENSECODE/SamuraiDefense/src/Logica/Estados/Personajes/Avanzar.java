package Logica.Estados.Personajes;

import Logica.Entidades.Entidad;
import Logica.Estados.Estado;

public class Avanzar extends Estado{

	public Avanzar(Entidad e) {
		super(e);
	}

	@Override
	public void ejecutar() {
		entidad.getInteligencia().mover();
	}

}
