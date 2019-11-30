package Logica.Estados.Personajes.Atacante;

import Logica.Entidades.Atacantes.Atacante;
import Logica.Estados.Personajes.Atacante.AtaqueEnemigo;

public class Avanzar extends EstadoAtacante {

	public Avanzar(Atacante e) {
		super(e);
		dejoPasar = true;
	}

	@Override
	public void ejecutar() {

		if (atacante.getLife() <= 0) {
			atacante.getGrafico().death();
			matarPersonaje(atacante);
		} else {

			atacante.getGrafico().running();;
			atacante.getInteligencia().mover();

			if (atacante.getPos().getX() == 0)
				atacante.perdioElJugador();

			if (atacante.getRange() > 0 && !tengoCaminoLibre(atacante))
				atacante.cambiarEstado(new AtaqueEnemigo(atacante));
		}
	}
}
