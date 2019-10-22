package Logica.Estados.Personajes.Defensor;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;
import Logica.Estados.Personajes.EstadoPersonaje;
import Logica.Estados.Personajes.Morir;

public class AtaqueDefensor extends EstadoPersonaje {

	public AtaqueDefensor(Personaje e) {
		super(e);
	}

	@Override
	public void ejecutar() {
		if (personaje.getLife() <= 0) {

			PersonajeGrafico p = (PersonajeGrafico) personaje.getGrafico();
			p.death();
			personaje.cambiarEstado(new Morir(personaje));
			personaje.prohibidoCambiarEstado();

		} else {
			if (personaje.getContador() % 50 == 0) {

				personaje.atacar(aDestruir);
				personaje.resetContador();
				
				if(chequearADistancia(personaje.getRange())) {
					personaje.cambiarEstado(new ReposoDefensor(personaje));
				}
				
			}
			personaje.incrementarContador();
			
			PersonajeGrafico p = (PersonajeGrafico) personaje.getGrafico();
			p.attack();
		}
		
		

	}

}
