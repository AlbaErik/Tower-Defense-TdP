package Logica.Colisionadores.VisitorsDeEstados;

import Logica.Estados.Municion.EstadoMunicion;
import Logica.Estados.Objetos.EstadoObjeto;
import Logica.Estados.Personajes.Morir;
import Logica.Estados.Personajes.Atacante.EstadoAtacante;
import Logica.Estados.Personajes.Defensor.EstadoDefensor;

public class VisitorEstadoFuerza extends VisitorDeEstados{

	@Override
	public void cambiarEstado(EstadoDefensor est) {
		est.cambiarAPoderoso();
	}

	@Override
	public void cambiarEstado(EstadoAtacante est) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cambiarEstado(Morir est) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cambiarEstado(EstadoMunicion est) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cambiarEstado(EstadoObjeto est) {
		// TODO Auto-generated method stub
		
	}

}
