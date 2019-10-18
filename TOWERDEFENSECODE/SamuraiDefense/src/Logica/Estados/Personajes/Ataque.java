package Logica.Estados.Personajes;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;

public class Ataque extends EstadoPersonaje {

	public Ataque(Personaje e) {
		super(e);
	}

	@Override
	public void ejecutar() {
		if (personaje.getLife() <= 0) {
			
			PersonajeGrafico p = (PersonajeGrafico)personaje.getGrafico();
			p.death();
			personaje.cambiarEstado(new Morir(personaje));
			personaje.prohibidoCambiarEstado();

		} else {
			personaje.atacar();

			PersonajeGrafico p = (PersonajeGrafico) personaje.getGrafico();
			p.atack();

		}

	}

}
