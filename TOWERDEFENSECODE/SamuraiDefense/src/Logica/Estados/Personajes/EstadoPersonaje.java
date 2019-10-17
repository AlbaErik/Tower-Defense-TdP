package Logica.Estados.Personajes;

import Logica.Entidades.Personaje;
import Logica.Estados.Estado;

public abstract class EstadoPersonaje extends Estado{
	
	protected Personaje personaje;
	
	public EstadoPersonaje(Personaje p) {
		personaje = p;
	}

}
