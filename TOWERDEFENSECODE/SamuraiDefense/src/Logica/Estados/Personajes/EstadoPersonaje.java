package Logica.Estados.Personajes;

import java.util.LinkedList;

import Grafica.Entidades.PersonajeGrafico;
import Logica.Colisionadores.Adistancia.ColCaminoLibreDef;
import Logica.Colisionadores.Adistancia.ColCaminoLibreEnem;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Entidades.Personaje;
import Logica.Estados.Estado;
import Logica.Estados.Personajes.Defensor.ReposoDefensor;
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
	 * Se encarga de cambiar el contenido de la lista "entidadesEnRango" con las
	 * entidades encontradas.
	 */
	protected void actualizarentidadesEnRango() {
		int x = (int) personaje.getPos().getX() + personaje.getDireccion();
		int y = (int) personaje.getPos().getY();
		entidadesEnRango = control.getEntidadesEnRango(x, y, personaje.getRange(), personaje.getDireccion(), personaje);
	}

	// --------------------------------------------------------------------------------------------------------------------------

	protected boolean tengoCaminoLibre() {
		boolean caminoLibre = true;
		actualizarentidadesEnRango();
		for(Entidad e : entidadesEnRango) {
			caminoLibre = caminoLibre && e.chocaraDistancia(personaje.getVisitorDistancia());
		}
		return caminoLibre;
	}
	
	/*
	 * Revisa si hay entidades a distancia para decidir si atacar, o avanzar segun
	 * el caso
	 */
	protected boolean controlarAtaqueDistancia() {
		boolean puedoAtacar = false;

		actualizarentidadesEnRango();
		for (Entidad e : entidadesEnRango) {
			puedoAtacar = puedoAtacar || !e.chocaraDistancia(personaje.getVisitorDistancia());
		}
		return puedoAtacar;
	}

	protected void rangoVacioDef() {
		boolean puedoAtacar = false;

		actualizarentidadesEnRango();
		for (Entidad e : entidadesEnRango) {
			puedoAtacar = puedoAtacar || !e.chocaraDistancia(new ColCaminoLibreDef());
		}

		if (!puedoAtacar) {
			personaje.cambiarEstado(new ReposoDefensor(personaje));
		}
	}

	protected boolean sePuedeAvanzar() {
		boolean avanzar = true;
		for (Entidad e : entidadesEnRango) {
			avanzar = avanzar && e.chocaraDistancia(new ColCaminoLibreEnem());
		}
		return avanzar;
	}

}
