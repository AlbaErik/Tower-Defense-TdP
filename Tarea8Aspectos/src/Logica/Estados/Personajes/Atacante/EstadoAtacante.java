package Logica.Estados.Personajes.Atacante;

import Logica.Colisionadores.VisitorsDeEstados.VisitorDeEstados;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Estados.Personajes.EstadoPersonaje;

public abstract class EstadoAtacante extends EstadoPersonaje {
	
	protected Atacante atacante;

	protected EstadoAtacante(Atacante a) {
		super(a.getMapa());
		atacante = a;
		// TODO Auto-generated constructor stub
	}
	
	public void aceptarVisitorEstados(VisitorDeEstados vis) {
		vis.cambiarEstado(this);
	}


}
