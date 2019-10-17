package Logica.Estados.Personajes;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Personaje;

public class Morir extends EstadoPersonaje{

	public Morir(Personaje p) {
		super(p);
	}

	@Override
	public void ejecutar() {
		PersonajeGrafico p = (PersonajeGrafico)personaje.getGrafico();
		p.death();
	}

}
