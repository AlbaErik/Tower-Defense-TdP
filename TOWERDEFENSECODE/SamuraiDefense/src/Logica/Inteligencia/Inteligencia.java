package Logica.Inteligencia;

import Logica.Entidades.Entidad;

public abstract class Inteligencia {
	
	protected Inteligencia() {}
	
	protected Entidad entidad;
	public abstract void mover();
}
