package Logica.Estados.Personajes;

import Logica.Colisionadores.VisitorsDeEstados.VisitorDeEstados;
import Logica.Entidades.Personaje;

public class Morir extends EstadoPersonaje {

	protected Personaje personaje;
	
	public Morir(Personaje p) {
		super(p.getMapa());
		personaje = p;
	}

	@Override
	public void ejecutar() {
		personaje.restarTiempoMuerte(); // Da tiempo a que se vea la animacion de la muerte del personaje

		if (personaje.getTiempoMuerte() <= 0)
			personaje.morir();
	}

	@Override
	public void aceptarVisitorEstados(VisitorDeEstados vis) {
		vis.cambiarEstado(this);
	}

}
