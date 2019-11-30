package Logica.Estados.Personajes.Defensor;

import Logica.Colisionadores.VisitorsDeEstados.VisitorDeEstados;
import Logica.Entidades.Contador;
import Logica.Entidades.Defensores.Defensor;

public class SuperReposoDefensor extends EstadoDefensor {

	Contador cont;

	public SuperReposoDefensor(Defensor p) {
		super(p);
		cont = new Contador();
	}

	@Override
	public void ejecutar() {
		controlarTiempo();
		if (defensor.getLife() <= 0) {
			defensor.getGrafico().death();
			matarPersonaje(defensor);
		}
		else {
			defensor.getGrafico().standingFuerza();;
		}
		if (defensor.getContador() % 50 == 0) {

			if (defensor.getRange() > 0 && !tengoCaminoLibre(defensor)) {
				SuperAtaqueDefensor at  = new SuperAtaqueDefensor(defensor);
				at.setConteo(cont.getContador());
				defensor.cambiarEstado(new SuperAtaqueDefensor(defensor));
			}

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
		SuperAtaqueDefensor at  = new SuperAtaqueDefensor(defensor);
		at.setConteo(cont.getContador());
		
		defensor.cambiarEstado(at);
	}

	public void setConteo(int c) {
		cont.setContador(c);
	}

	@Override
	public void aceptarVisitorEstados(VisitorDeEstados vis) {
		vis.cambiarEstado(this);
	}
}
