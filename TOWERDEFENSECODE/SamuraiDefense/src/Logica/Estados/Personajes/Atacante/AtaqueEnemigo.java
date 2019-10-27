package Logica.Estados.Personajes.Atacante;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Estados.Personajes.Avanzar;
import Logica.Estados.Personajes.EstadoPersonaje;
import Logica.Estados.Personajes.Morir;

public class AtaqueEnemigo extends EstadoPersonaje {

	public AtaqueEnemigo(Personaje e) {
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
			PersonajeGrafico p = (PersonajeGrafico) personaje.getGrafico();
			p.attack();
			
			if (personaje.getContador() == personaje.getAttackSpeed()*1000) {

				personaje.atacar(aDestruir);
				personaje.resetContador();
				
				controlarAvanzar();
				
				/*

				if (!sePuedeAvanzar((Atacante) personaje)) {
					System.out.println("Personaje de tipo: " + personaje.getClass() + " puede avanzar");
					personaje.cambiarEstado(new Avanzar(personaje));
				}
				*/
			}
			personaje.incrementarContador();

			
		}
	}

}
