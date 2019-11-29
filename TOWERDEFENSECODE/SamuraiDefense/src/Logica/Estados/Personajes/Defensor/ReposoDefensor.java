package Logica.Estados.Personajes.Defensor;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Colisionadores.VisitorsDeEstados.VisitorDeEstados;
import Logica.Entidades.Defensores.Defensor;

public class ReposoDefensor extends EstadoDefensor {

	public ReposoDefensor(Defensor e) {
		super(e);
	}

	@Override
	public void ejecutar() {
		if (defensor.getLife() <= 0) {
			matarPersonaje(defensor);
		} else {
			PersonajeGrafico p = (PersonajeGrafico) defensor.getGrafico();
			p.standing();
		}
		if (defensor.getContador() % 50 == 0) {

			if (defensor.getRange() > 0 && !tengoCaminoLibre(defensor)) {
				defensor.cambiarEstado(new AtaqueDefensor(defensor));
			}

			defensor.resetContador();
		}
		defensor.incrementarContador();
	}
	
	public void cambiarAPoderoso() {
		defensor.cambiarEstado(new SuperReposoDefensor(defensor));
	}

	@Override
	public void cambiarEstadoAtaque() {
		defensor.cambiarEstado(new AtaqueDefensor(defensor));

	}

	@Override
	public void aceptarVisitorEstados(VisitorDeEstados vis) {
		vis.cambiarEstado(this);
	}
}
