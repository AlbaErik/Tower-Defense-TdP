package Logica.Estados.Personajes.Atacante;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;
import Logica.Estados.Personajes.EstadoPersonaje;
import Logica.Estados.Personajes.Atacante.AtaqueEnemigo;

public class Avanzar extends EstadoPersonaje {

	public Avanzar(Personaje e) {
		super(e);
		dejoPasar = true;
	}

	@Override
	public void ejecutar() {

		if (personaje.getLife() <= 0) {
			matarPersonaje();
		} else {

			PersonajeGrafico p = (PersonajeGrafico) personaje.getGrafico();
			p.running();
			personaje.getInteligencia().mover();

			if (personaje.getPos().getX() == 0)
				personaje.perdioElJugador();

			if (personaje.getRange() > 0 && !tengoCaminoLibre())
				personaje.cambiarEstado(new AtaqueEnemigo(personaje));
		}
	}
}
