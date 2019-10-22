package Logica.Estados.Personajes;

import Logica.Entidades.Personaje;
import Logica.Estados.Estado;
import Logica.Hilos.Control;

public abstract class EstadoPersonaje extends Estado{
	
	protected Personaje personaje;
	protected Control control;
	
	public EstadoPersonaje(Personaje p) {
		personaje = p;
		control = new Control(p.getMapa());
	}
	
	protected boolean sePuedeAvanzar() {
		int x = (int) personaje.getPos().getX();
		int y = (int) personaje.getPos().getY();
		return control.hayEntidadEnRango(x, y, personaje.getPos().getAncho(), personaje.getDireccion());
	}
	
	protected boolean chequearADistancia(int rango) {
		int x = (int) personaje.getPos().getX() + personaje.getDireccion();
		int y = (int) personaje.getPos().getY();
		return control.hayEntidadEnRango(x, y, rango, personaje.getDireccion());
	}

}
