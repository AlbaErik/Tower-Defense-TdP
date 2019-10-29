package Logica.Estados.Personajes.Atacante;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;
import Logica.Estados.Personajes.Avanzar;
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

				actualizarentidadesEnRango();

				if (sePuedeAvanzar()) {
					System.out.println("REPOSOENEMIGO----Entidad: " + personaje.getClass() + " puede avanzar");
					personaje.cambiarEstado(new Avanzar(personaje));
					

				} else {
					controlarAtaqueDistancia();
				}
				personaje.resetContador();
			}

			personaje.incrementarContador();
		}

	}
}
