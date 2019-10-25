package Logica.Estados.Personajes.Defensor;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;
import Logica.Estados.Personajes.EstadoPersonaje;
import Logica.Estados.Personajes.Morir;

public class ReposoDefensor extends EstadoPersonaje {

	public ReposoDefensor(Personaje e) {
		super(e);
	}

	@Override
	public void ejecutar() {
		if(personaje.getLife() <= 0) {			
			PersonajeGrafico p = (PersonajeGrafico)personaje.getGrafico();
			p.death();
			personaje.cambiarEstado(new Morir(personaje));
			personaje.prohibidoCambiarEstado();

		}else {
			PersonajeGrafico p = (PersonajeGrafico)personaje.getGrafico();
			p.standing();
		}
			
		if (personaje.getContador() % 50 == 0) {
			
			if(personaje.getRange() > 0 && chequearADistancia(personaje.getRange())) {
				personaje.cambiarEstado(new AtaqueDefensor(personaje));
			}
			
			personaje.resetContador();				
		}
		personaje.incrementarContador();		
	}
}
