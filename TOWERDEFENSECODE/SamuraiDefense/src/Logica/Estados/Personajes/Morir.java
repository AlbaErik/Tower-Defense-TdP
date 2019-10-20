package Logica.Estados.Personajes;

import Logica.Entidades.Personaje;

public class Morir extends EstadoPersonaje{

	public Morir(Personaje p) {
		super(p);
	}

	@Override
	public void ejecutar() {
		
		personaje.restarTiempoMuerte(); //Da tiempo a que se vea la animacion de la muerte del personaje
		
		if(personaje.getTiempoMuerte() <= 0)
			personaje.morir();
	}

}
