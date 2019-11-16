package Logica.Estados.Personajes.Defensor;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Contador;
import Logica.Entidades.Personaje;
import Logica.Estados.Personajes.EstadoPersonaje;

public class SuperAtaqueDefensor extends EstadoPersonaje {

	Contador cont;
	public SuperAtaqueDefensor(Personaje p, Contador c) {
		super(p);
		cont = c;
	}

	@Override
	public void ejecutar() {
		controlarTiempo();
		if (personaje.getLife() <= 0)
			matarPersonaje();
		else if (personaje.getContador() % 50 == 0) {

			PersonajeGrafico p = (PersonajeGrafico) personaje.getGrafico();
			p.attackFuerza();

			personaje.superAtaque(aDestruir);
			personaje.resetContador();

			if (tengoCaminoLibre())
				personaje.cambiarEstado(new SuperReposoDefensor(personaje, cont));
		}
		personaje.incrementarContador();
	}

	private void controlarTiempo() {
		if(cont.getContador() >= 500) {
			personaje.cambiarEstado(new AtaqueDefensor(personaje));
			cont.resetContador();
		}else
			cont.incrementarContador();
	}

}
