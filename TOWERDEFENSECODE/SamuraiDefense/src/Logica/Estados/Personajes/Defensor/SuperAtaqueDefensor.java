package Logica.Estados.Personajes.Defensor;

import Logica.Colisionadores.VisitorsDeEstados.VisitorDeEstados;
import Logica.Entidades.Contador;
import Logica.Entidades.Defensores.Defensor;

public class SuperAtaqueDefensor extends EstadoDefensor {

	private Contador cont;

	public SuperAtaqueDefensor(Defensor p) {
		super(p);
		cont = new Contador();
	}

	@Override
	public void ejecutar() {
		controlarTiempo();
		if (defensor.getLife() <= 0) {
			defensor.getGrafico().death();
			matarPersonaje(defensor);
		} else if (defensor.getContador() % 50 == 0) {

			defensor.getGrafico().attackFuerza();

			defensor.superAtaque(aDestruir);
			defensor.resetContador();

			if (tengoCaminoLibre(defensor)) {
				SuperReposoDefensor sup = new SuperReposoDefensor(defensor);
				sup.setConteo(cont.getContador());
				defensor.cambiarEstado(sup);

			}
		}
		defensor.incrementarContador();
	}

	private void controlarTiempo() {
		if (cont.getContador() >= 500) {
			defensor.cambiarEstado(new AtaqueDefensor(defensor));
			cont.resetContador();
		} else
			cont.incrementarContador();
	}

	public void setConteo(int c) {
		cont.setContador(c);
	}

	@Override
	public void cambiarEstadoAtaque() {

	}

	@Override
	public void aceptarVisitorEstados(VisitorDeEstados vis) {
		vis.cambiarEstado(this);
	}

}
