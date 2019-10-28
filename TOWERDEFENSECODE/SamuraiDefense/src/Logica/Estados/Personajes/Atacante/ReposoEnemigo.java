package Logica.Estados.Personajes.Atacante;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;
import Logica.Estados.Personajes.Avanzar;
import Logica.Estados.Personajes.EstadoPersonaje;

public class ReposoEnemigo extends EstadoPersonaje {

	public ReposoEnemigo(Personaje e) {
		super(e);
	}

	@Override
	public void ejecutar() {
		if (personaje.getLife() <= 0) {
			matarPersonaje();

		} else {
			PersonajeGrafico p = (PersonajeGrafico) personaje.getGrafico();
			p.standing();

			if (personaje.getContador() % 20 == 0) {

				if (sePuedeAvanzar()) {
					System.out.println("REPOSOENEMIGO----Entidad: " + personaje.getClass() + " puede avanzar");
					personaje.cambiarEstado(new Avanzar(personaje));
					personaje.resetContador();

				} else {
					actualizarentidadesEnRango();
					controlarAtaqueDistancia();
				}
				personaje.resetContador();
			}

			personaje.incrementarContador();
		}

	}
}
