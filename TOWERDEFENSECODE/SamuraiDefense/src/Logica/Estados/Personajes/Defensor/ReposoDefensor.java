package Logica.Estados.Personajes.Defensor;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;
import Logica.Estados.Personajes.EstadoPersonaje;

public class ReposoDefensor extends EstadoPersonaje {

	public ReposoDefensor(Personaje e) {
		super(e);
	}

	@Override
	public void ejecutar() {
		if (personaje.getLife() <= 0) {
			matarPersonaje();
		} else {
			PersonajeGrafico p = (PersonajeGrafico) personaje.getGrafico();
			p.standing();
		}

		if (personaje.getContador() % 50 == 0) {

			if (personaje.getRange() > 0 && !tengoCaminoLibre()) {
				personaje.cambiarEstado(new AtaqueDefensor(personaje));
			}

			personaje.resetContador();
		}
		personaje.incrementarContador();
	}
}
