package Logica.Estados.Personajes.Defensor;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Contador;
import Logica.Entidades.Defensores.Defensor;

public class SuperAtaqueDefensor extends EstadoDefensor {

	private Contador cont;
	
	public SuperAtaqueDefensor(Defensor p, Contador c) {
		super(p);
		cont = c;
	}

	@Override
	public void ejecutar() {
		controlarTiempo();
		if (defensor.getLife() <= 0)
			matarPersonaje(defensor);
		else if (defensor.getContador() % 50 == 0) {

			PersonajeGrafico p = (PersonajeGrafico) defensor.getGrafico();
			p.attackFuerza();

			defensor.superAtaque(aDestruir);
			defensor.resetContador();

			if (tengoCaminoLibre(defensor))
				defensor.cambiarEstado(new SuperReposoDefensor(defensor, cont));
		}
		defensor.incrementarContador();
	}

	private void controlarTiempo() {
		if(cont.getContador() >= 500) {
			defensor.cambiarEstado(new AtaqueDefensor(defensor));
			cont.resetContador();
		}else
			cont.incrementarContador();
	}

	@Override
	public void cambiarEstadoAtaque() {
		
	}

}
