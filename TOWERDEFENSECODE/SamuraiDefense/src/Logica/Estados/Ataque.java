package Logica.Estados;

import Logica.Entidades.Personaje;

public class Ataque extends Estado{

	public Ataque(Personaje e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejecutar() {
		entidad.getInteligencia().atacarIA();
		((Personaje)entidad).atacar();
	}

}
