package Logica.Estados.Personajes;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;

public class Reposo extends EstadoPersonaje {

	public Reposo(Personaje e) {
		super(e);

	}

	@Override
	public void ejecutar() {
		PersonajeGrafico p = (PersonajeGrafico)personaje.getGrafico();
		p.standing();

	}

}
