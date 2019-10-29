package Logica.Estados.Personajes;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;
import Logica.Estados.Personajes.Atacante.AtaqueEnemigo;

public class Avanzar extends EstadoPersonaje {

	public Avanzar(Personaje e) {
		super(e);
		dejoPasar = true;
	}
	
	@Override
	public void ejecutar() {
		
		if(personaje.getLife() <= 0) {
			matarPersonaje();
		}else {
			PersonajeGrafico p = (PersonajeGrafico)personaje.getGrafico();
			p.running();
			personaje.getInteligencia().mover();
			
			if(controlarAtaqueDistancia()) {
				personaje.cambiarEstado(new AtaqueEnemigo(personaje));
			}
		}
	}
}
