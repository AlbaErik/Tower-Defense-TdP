package Logica.Estados.Personajes.Atacante;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Colisionadores.ColisionadorADistancia;
import Logica.Entidades.Personaje;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Estados.Personajes.Avanzar;
import Logica.Estados.Personajes.EstadoPersonaje;
import Logica.Estados.Personajes.Morir;
import Logica.Estados.Personajes.Defensor.AtaqueDefensor;

public class ReposoEnemigo extends EstadoPersonaje {

	public ReposoEnemigo(Personaje e) {
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
			
			if(sePuedeAvanzar((Atacante) personaje)) {
				personaje.cambiarEstado(new Avanzar(personaje));
			}else {
				if(chequearADistancia(personaje.getRange())) {
					personaje.cambiarEstado(new AtaqueDefensor(personaje));
				}
			}
			
			personaje.resetContador();				

		}
		personaje.incrementarContador();		
	}
}
