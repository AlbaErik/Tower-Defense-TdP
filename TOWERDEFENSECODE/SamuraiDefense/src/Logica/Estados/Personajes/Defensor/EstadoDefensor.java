package Logica.Estados.Personajes.Defensor;

import Logica.Entidades.Defensores.Defensor;
import Logica.Estados.Personajes.EstadoPersonaje;

public abstract class EstadoDefensor extends EstadoPersonaje {

	protected Defensor defensor;

	protected EstadoDefensor(Defensor p) {
		super(p.getMapa());
		defensor = p;
	}

	public abstract void cambiarEstadoAtaque();
	
	public void cambiarAPoderoso() {}

}
