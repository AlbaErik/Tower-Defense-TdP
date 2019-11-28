package Logica.Estados.Personajes.Atacante;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Estados.Personajes.EstadoPersonaje;

public class ReposoEnemigo extends EstadoAtacante {

	public ReposoEnemigo(Atacante e) {
		super(e);
		dejoPasar = false;
	}

	@Override
	public void ejecutar() {
		if (atacante.getLife() <= 0) {
			matarPersonaje(atacante);

		} else {
			PersonajeGrafico p = (PersonajeGrafico) atacante.getGrafico();
			p.standing();

			if (atacante.getContador() % 50 == 0) {
				if (tengoCaminoLibre(atacante)) {
					atacante.cambiarEstado(new Avanzar(atacante));
				} 
				atacante.resetContador();
			}
			atacante.incrementarContador();
		}

	}
}
