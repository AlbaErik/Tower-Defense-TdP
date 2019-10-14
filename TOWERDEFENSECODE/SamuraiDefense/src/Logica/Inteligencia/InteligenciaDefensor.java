package Logica.Inteligencia;

import Logica.Entidades.Defensores.Defensor;

public class InteligenciaDefensor extends Inteligencia {

	public InteligenciaDefensor(Defensor def) {
		entidad = def;

	}

	@Override
	public void mover() {

	}

	@Override
	public void atacarIA() {
		if (entidad.puedoAtacar()) {
			entidad.getGrafico().atacar();
		}
	}

}
