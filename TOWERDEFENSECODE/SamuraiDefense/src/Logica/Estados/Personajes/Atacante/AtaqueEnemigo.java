package Logica.Estados.Personajes.Atacante;

import Logica.Entidades.Atacantes.Atacante;

public class AtaqueEnemigo extends EstadoAtacante {

	public AtaqueEnemigo(Atacante e) {
		super(e);
		dejoPasar = false;
	}

	@Override
	public void ejecutar() {
		if (atacante.getLife() <= 0) {
			atacante.getGrafico().death();
			matarPersonaje(atacante);
		} else {

			atacante.getGrafico().attack();

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
