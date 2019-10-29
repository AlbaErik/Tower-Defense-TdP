package Logica.Estados.Personajes.Atacante;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;
import Logica.Estados.Personajes.Avanzar;
import Logica.Estados.Personajes.EstadoPersonaje;

public class AtaqueEnemigo extends EstadoPersonaje {

	public AtaqueEnemigo(Personaje e) {
		super(e);
		dejoPasar = false;
	}

	@Override
	public void ejecutar() {
		if (personaje.getLife() <= 0) {

			matarPersonaje();

		} else {
			PersonajeGrafico p = (PersonajeGrafico) personaje.getGrafico();
			p.attack();

			if (personaje.getContador() % 50 == 0) {
				actualizarentidadesEnRango();

				personaje.atacar(aDestruir);
				personaje.resetContador();

				if (sePuedeAvanzar()) {
					personaje.cambiarEstado(new Avanzar(personaje));
					personaje.resetContador();
				}

			}
			personaje.incrementarContador();
		}
	}

}
