package Logica.Estados.Personajes.Defensor;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Contador;
import Logica.Entidades.Personaje;
import Logica.Estados.Personajes.EstadoPersonaje;

public class SuperReposoDefensor extends EstadoPersonaje {

	Contador cont;

	public SuperReposoDefensor(Personaje p, Contador c) {
		super(p);
		cont = c;
	}

	@Override
	public void ejecutar() {
		controlarTiempo();
		if (personaje.getLife() <= 0)
			matarPersonaje();
		else {
			PersonajeGrafico p = (PersonajeGrafico) personaje.getGrafico();
			p.standingFuerza();
		}
		if (personaje.getContador() % 50 == 0) {

			if (personaje.getRange() > 0 && !tengoCaminoLibre())
				personaje.cambiarEstado(new SuperAtaqueDefensor(personaje, cont));

			personaje.resetContador();
		}
		personaje.incrementarContador();
	}

	private void controlarTiempo() {
		if (cont.getContador() >= 500) {
			personaje.cambiarEstado(new ReposoDefensor(personaje));
			cont.resetContador();
		} else
			cont.incrementarContador();
	}
}
