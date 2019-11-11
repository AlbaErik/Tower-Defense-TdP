package Logica.Estados.Personajes.Atacante;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;
import Logica.Estados.Personajes.EstadoPersonaje;

public class ReposoEnemigo extends EstadoPersonaje {

	public ReposoEnemigo(Personaje e) {
		super(e);
		dejoPasar = false;
	}

	@Override
	public void ejecutar() {
		if (personaje.getLife() <= 0) {
			matarPersonaje();

		} else {
			PersonajeGrafico p = (PersonajeGrafico) personaje.getGrafico();
			p.standing();

			if (personaje.getContador() % 50 == 0) {
				if (tengoCaminoLibre()) {
					personaje.cambiarEstado(new Avanzar(personaje));
				} 
				personaje.resetContador();
			}
			personaje.incrementarContador();
		}

	}
}
