package Logica.Estados.Personajes.Defensor;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Contador;
import Logica.Entidades.Defensores.Defensor;

public class AtaqueDefensor extends EstadoDefensor {

	public AtaqueDefensor(Defensor e) {
		super(e);
	}

	@Override
	public void ejecutar() {
		if (defensor.getLife() <= 0)
			matarPersonaje(defensor);
		else if (defensor.getContador() % 50 == 0) {

			PersonajeGrafico p = (PersonajeGrafico) defensor.getGrafico();
			p.attack();

			defensor.atacar(aDestruir);
			defensor.resetContador();

			if (tengoCaminoLibre(defensor))
				defensor.cambiarEstado(new ReposoDefensor(defensor));
		}
		defensor.incrementarContador();
	}
	
	public void cambiarAPoderoso() {
		defensor.cambiarEstado(new SuperAtaqueDefensor(defensor, new Contador()));
	}

	@Override
	public void cambiarEstadoAtaque() {	}
}
