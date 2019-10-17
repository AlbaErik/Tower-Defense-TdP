package Logica.Estados.Personajes;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;

public class Avanzar extends EstadoPersonaje {

	public Avanzar(Personaje e) {
		super(e);
	}

	@Override
	public void ejecutar() {
		PersonajeGrafico p = (PersonajeGrafico)personaje.getGrafico();

		p.running();

		personaje.getInteligencia().mover();
	}

}
