package Logica.Estados.Personajes.Defensor;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Colisionadores.VisitorsDeEstados.VisitorDeEstados;
import Logica.Entidades.Contador;
import Logica.Entidades.Defensores.Defensor;

public class SuperReposoDefensor extends EstadoDefensor {

	Contador cont;

	public SuperReposoDefensor(Defensor p, Contador c) {
		super(p);
		cont = c;
	}

	@Override
	public void ejecutar() {
		controlarTiempo();
		if (defensor.getLife() <= 0)
			matarPersonaje(defensor);
		else {
			PersonajeGrafico p = (PersonajeGrafico) defensor.getGrafico();
			p.standingFuerza();
		}
		if (defensor.getContador() % 50 == 0) {

			if (defensor.getRange() > 0 && !tengoCaminoLibre(defensor))
				defensor.cambiarEstado(new SuperAtaqueDefensor(defensor, cont));

			defensor.resetContador();
		}
		defensor.incrementarContador();
	}

	private void controlarTiempo() {
		if (cont.getContador() >= 500) {
			defensor.cambiarEstado(new ReposoDefensor(defensor));
			cont.resetContador();
		} else
			cont.incrementarContador();
	}

	@Override
	public void cambiarEstadoAtaque() {
		defensor.cambiarEstado(new SuperAtaqueDefensor(defensor, cont));
	}

	@Override
	public void aceptarVisitorEstados(VisitorDeEstados vis) {
		vis.cambiarEstado(this);
	}
}
