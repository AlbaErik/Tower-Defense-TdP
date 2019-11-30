package Logica.Estados.Personajes.Defensor;

import Logica.Colisionadores.VisitorsDeEstados.VisitorDeEstados;
import Logica.Entidades.Defensores.Defensor;

public class AtaqueDefensor extends EstadoDefensor {

	public AtaqueDefensor(Defensor e) {
		super(e);
	}

	@Override
	public void ejecutar() {
		if (defensor.getLife() <= 0) {
			defensor.getGrafico().death();
			matarPersonaje(defensor);
		} else if (defensor.getContador() % 50 == 0) {

			defensor.getGrafico().attack();

			defensor.atacar(aDestruir);
			defensor.resetContador();

			if (tengoCaminoLibre(defensor))
				defensor.cambiarEstado(new ReposoDefensor(defensor));
		}
		defensor.incrementarContador();
	}

	public void cambiarAPoderoso() {
		defensor.cambiarEstado(new SuperAtaqueDefensor(defensor));
	}

	@Override
	public void cambiarEstadoAtaque() {
	}

	@Override
	public void aceptarVisitorEstados(VisitorDeEstados vis) {
		vis.cambiarEstado(this);
	}
}
