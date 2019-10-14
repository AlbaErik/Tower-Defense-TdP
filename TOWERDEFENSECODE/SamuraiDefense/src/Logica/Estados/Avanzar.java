package Logica.Estados;

import Logica.Entidades.Entidad;

public class Avanzar extends Estado{

	public Avanzar(Entidad e) {
		super(e);
	}

	@Override
	public void ejecutar() {
		entidad.getInteligencia().mover();
	}

}
