package Logica.Estados.Personajes;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;

public class Avanzar extends EstadoPersonaje {

	public Avanzar(Personaje e) {
		super(e);
		dejoPasar = true;
	}
	
	public boolean getPersmisoParaAvanzar() {
		return false;
	}

	@Override
	public void ejecutar() {
		
		if(personaje.getLife() <= 0) {
			
			matarPersonaje();

		}else {
			PersonajeGrafico p = (PersonajeGrafico)personaje.getGrafico();
			p.running();
			personaje.getInteligencia().mover();
			
			controlarAtaqueDistancia();
			
			/*
			if(controlarAtaque()) {
				personaje.cambiarEstado(new AtaqueEnemigo(personaje));
			}
			*/
		}
		
	}

}
