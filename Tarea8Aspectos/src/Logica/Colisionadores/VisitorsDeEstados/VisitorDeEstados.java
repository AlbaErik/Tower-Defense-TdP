package Logica.Colisionadores.VisitorsDeEstados;

import Logica.Estados.Municion.EstadoMunicion;
import Logica.Estados.Objetos.EstadoObjeto;
import Logica.Estados.Personajes.Morir;
import Logica.Estados.Personajes.Atacante.EstadoAtacante;
import Logica.Estados.Personajes.Defensor.EstadoDefensor;

public abstract class VisitorDeEstados {

	protected VisitorDeEstados() {}
	
	public abstract void cambiarEstado(EstadoDefensor est);

	public abstract void cambiarEstado(EstadoAtacante est);
	
	public abstract void cambiarEstado(Morir est);
	
	public abstract void cambiarEstado(EstadoMunicion est);
	
	public abstract void cambiarEstado(EstadoObjeto est);

}
