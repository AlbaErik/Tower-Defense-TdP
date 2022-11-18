package Logica.Estados.Personajes.Atacante;

import Logica.Entidades.Atacantes.Atacante;

public class ReposoEnemigo extends EstadoAtacante {

	public ReposoEnemigo(Atacante e) {
		super(e);
		dejoPasar = false;
	}

	@Override
	public void ejecutar() {
		if (atacante.getLife() <= 0) {
			atacante.getGrafico().death();
			matarPersonaje(atacante);

		} else {
			atacante.getGrafico().standing();

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
