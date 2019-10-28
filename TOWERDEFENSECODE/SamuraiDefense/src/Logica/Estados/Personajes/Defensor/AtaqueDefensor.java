package Logica.Estados.Personajes.Defensor;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;
import Logica.Estados.Personajes.EstadoPersonaje;

public class AtaqueDefensor extends EstadoPersonaje {

	public AtaqueDefensor(Personaje e) {
		super(e);
	}

	@Override
	public void ejecutar() {
		if (personaje.getLife() <= 0) {

			matarPersonaje();

		} else {
			if (personaje.getContador() % 50 == 0) {

				personaje.atacar(aDestruir);
				personaje.resetContador();
				
				rangoVacioDef(); //Controla que no encuentre enemigos al frente para parar
				
			}
			personaje.incrementarContador();
			
			PersonajeGrafico p = (PersonajeGrafico) personaje.getGrafico();
			p.attack();
		}
	}
}
