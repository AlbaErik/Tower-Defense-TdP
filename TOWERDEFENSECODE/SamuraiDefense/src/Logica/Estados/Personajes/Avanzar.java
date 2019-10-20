package Logica.Estados.Personajes;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;

public class Avanzar extends EstadoPersonaje {

	public Avanzar(Personaje e) {
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
			p.running();
			personaje.getInteligencia().mover();
		}
		
	}

}