package Logica.Estados.Personajes;

import Logica.Colisionadores.ColisionadorADistancia;
import Logica.Entidades.Entidad;
import Logica.Entidades.Personaje;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Estados.Estado;
import Logica.Hilos.Control;

public abstract class EstadoPersonaje extends Estado{
	
	protected Personaje personaje;
	protected Control control;
	
	public EstadoPersonaje(Personaje p) {
		personaje = p;
		control = new Control(p.getMapa());
	}
	
	protected boolean sePuedeAvanzar(Atacante a) {
		int x = (int) personaje.getPos().getX();
		int y = (int) personaje.getPos().getY();
		Entidad ent = control.hayEntidadEnRango(x, y, personaje.getPos().getAncho(), personaje.getDireccion(), personaje);
		boolean toret = false;
		if(ent != null) {
			toret = true; //a.getCol2().serChocado(ent.getClass()); FALTA DEFINIR ESTA PARTE, QUÉ HACER CON LA ENTIDAD ENCONTRADA
		}
		
		return toret;
	}
	
	/*
	 * Revisa si hay entidades a distancia para decidir si atacar, o avanzar segun el caso¿
	 */
	protected boolean chequearADistancia(int rango) {
		int x = (int) personaje.getPos().getX() + personaje.getDireccion();
		int y = (int) personaje.getPos().getY();
		boolean toRet = false;
		if(control.hayEntidadEnRango(x, y, rango, personaje.getDireccion(), personaje) != null)
			toRet = true;
		return toRet;
	}

}
