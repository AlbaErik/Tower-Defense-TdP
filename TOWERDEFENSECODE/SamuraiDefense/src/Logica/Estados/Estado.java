package Logica.Estados;

import Logica.Entidades.Entidad;

public abstract class Estado {
	
	protected Entidad aDestruir = null;
	
	public abstract void ejecutar();
	public void entidadADestruir(Entidad e) {
		aDestruir = e;
	}
}
