package Logica.Estados.Personajes.Atacante;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Estados.Personajes.EstadoPersonaje;

public class AtaqueEnemigo extends EstadoAtacante {

	public AtaqueEnemigo(Atacante e) {
		super(e);
		dejoPasar = false;
	}

	@Override
	public void ejecutar() {
		if (atacante.getLife() <= 0) {
			matarPersonaje(atacante);
		} else {
			
			PersonajeGrafico p = (PersonajeGrafico) atacante.getGrafico();
			p.attack();

			if (atacante.getContador() % 50 == 0) {

				atacante.atacar(aDestruir);

				if (tengoCaminoLibre(atacante)) {
					atacante.cambiarEstado(new Avanzar(atacante));
					atacante.resetContador();
				}
				atacante.resetContador();
			}
			atacante.incrementarContador();
		}
	}
}
