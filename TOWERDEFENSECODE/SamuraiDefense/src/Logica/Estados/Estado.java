package Logica.Estados;

import Logica.Entidades.Entidad;

public abstract class Estado {
	protected Entidad entidad;
	
	public Estado(Entidad e) {
		entidad = e;
	}
	
	public abstract void ejecutar();
}
