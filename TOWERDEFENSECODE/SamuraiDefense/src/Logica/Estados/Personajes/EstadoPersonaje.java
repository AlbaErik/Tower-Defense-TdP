package Logica.Estados.Personajes;

import java.util.LinkedList;
import Grafica.Entidades.PersonajeGrafico;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Entidades.Personaje;
import Logica.Estados.Estado;
import Logica.Hilos.Control;

public abstract class EstadoPersonaje extends Estado {

	protected Personaje personaje;
	protected Control control;
	protected LinkedList<Entidad> entidadesEnRango;
	protected VisitorDistancia visitorRangoVacio;

	protected EstadoPersonaje(Personaje p) {
		personaje = p;
		control = new Control(p.getMapa());
		entidadesEnRango = new LinkedList<Entidad>();
	}
	
	protected void matarPersonaje() {
		PersonajeGrafico p = (PersonajeGrafico) personaje.getGrafico();
		p.death();
		personaje.cambiarEstado(new Morir(personaje));
		personaje.prohibidoCambiarEstado();
	}

	/*
	 * Se encarga de cambiar el contenido de la lista "entidadesEnRango" con las entidades encontradas.
	 */
	protected void actualizarentidadesEnRango() {
		int x = (int) personaje.getPos().getX() + personaje.getDireccion();
		int y = (int) personaje.getPos().getY();
		entidadesEnRango = control.getEntidadesEnRango(x, y, personaje.getRange(), personaje.getDireccion(), personaje);
	}
	
	protected boolean tengoCaminoLibre() {
		boolean caminoLibre = true;
		actualizarentidadesEnRango();
		for(Entidad e : entidadesEnRango) {
			e.chocaraDistancia(personaje.getVisitorDistancia());
		}
		return caminoLibre && personaje.getCaminoLibre();
	}
}
