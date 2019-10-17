package Logica.Estados.Personajes;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;

public class Ataque extends EstadoPersonaje{

	public Ataque(Personaje e) {
		super(e);
	}

	@Override
	public void ejecutar() {
		PersonajeGrafico p = (PersonajeGrafico)personaje.getGrafico();
		p.atack();

		personaje.atacar();
	}

}
