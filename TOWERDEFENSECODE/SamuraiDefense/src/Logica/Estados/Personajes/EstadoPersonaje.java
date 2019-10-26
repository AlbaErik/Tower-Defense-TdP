package Logica.Estados.Personajes;

import Logica.Entidades.Entidad;
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
	
	/*
	 * Se encarga de cambiar el estado del personaje a avanzar cuando haga falta
	 */
	protected void controlarAvanzar() {
		int x = (int) personaje.getPos().getX();
		int y = (int) personaje.getPos().getY();
		Entidad ent = control.hayEntidadEnRango(x, y, personaje.getPos().getAncho(), personaje.getDireccion(), personaje);
		//personaje.chocarDistancia(col);
	}
	
	/*
	 * Revisa si hay entidades a distancia para decidir si atacar, o avanzar segun el caso¿
	 */
	protected boolean controlarAtaque() {
		int x = (int) personaje.getPos().getX() + personaje.getDireccion();
		int y = (int) personaje.getPos().getY();
		boolean toRet = false;
		if(control.hayEntidadEnRango(x, y, personaje.getRange(), personaje.getDireccion(), personaje) != null)
			toRet = true;
		return toRet;
	}

}
