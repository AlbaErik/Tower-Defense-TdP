package Logica.Estados.Personajes;

import java.util.LinkedList;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Entidades.Personaje;
import Logica.Estados.Estado;
import Logica.Hilos.Control;
import Logica.Mapa.Mapa;

public abstract class EstadoPersonaje extends Estado {

	protected Control control;
	protected LinkedList<Entidad> entidadesEnRango;
	protected VisitorDistancia visitorRangoVacio;

	protected EstadoPersonaje(Mapa m) {
		control = new Control(m);
		entidadesEnRango = new LinkedList<Entidad>();
	}

	protected void matarPersonaje(Personaje personaje) {

		personaje.cambiarEstado(new Morir(personaje));
		personaje.prohibidoCambiarEstado();
	}

	/*
	 * Se encarga de cambiar el contenido de la lista "entidadesEnRango" con las
	 * entidades encontradas.
	 */
	protected void actualizarentidadesEnRango(Personaje personaje) {
		int x = (int) personaje.getPos().getX() + personaje.getDireccion();
		int y = (int) personaje.getPos().getY();
		entidadesEnRango = control.getEntidadesEnRango(x, y, personaje.getRange(), personaje.getDireccion(), personaje);
	}

	protected boolean tengoCaminoLibre(Personaje personaje) {
		boolean caminoLibre = true;
		actualizarentidadesEnRango(personaje);
		for (Entidad e : entidadesEnRango) {
			e.chocaraDistancia(personaje.getVisitorDistancia());
			caminoLibre = caminoLibre && personaje.getCaminoLibre();
		}

		personaje.setCaminoLibre(true);
		return caminoLibre;
	}

}
