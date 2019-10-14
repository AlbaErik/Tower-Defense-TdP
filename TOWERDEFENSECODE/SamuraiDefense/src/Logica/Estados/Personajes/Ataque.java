package Logica.Estados.Personajes;

import Logica.Entidades.Personaje;
import Logica.Estados.Estado;

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
