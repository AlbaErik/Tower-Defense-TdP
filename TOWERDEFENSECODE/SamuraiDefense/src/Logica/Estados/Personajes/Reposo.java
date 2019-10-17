package Logica.Estados.Personajes;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;

public class Reposo extends EstadoPersonaje {

	public Reposo(Personaje e) {
		super(e);

	}

	@Override
	public void ejecutar() {
		if(personaje.getLife() <= 0) {
			System.out.println("Vida del personaje: " + personaje.getClass() + personaje.getLife());
			personaje.cambiarEstado(new Morir(personaje));
			personaje.morir();
		}else {
			PersonajeGrafico p = (PersonajeGrafico)personaje.getGrafico();
			p.standing();
		}
		

	}

}
