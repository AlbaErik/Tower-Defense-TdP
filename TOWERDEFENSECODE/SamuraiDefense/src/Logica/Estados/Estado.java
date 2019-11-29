package Logica.Estados;

import Logica.Colisionadores.VisitorsDeEstados.VisitorDeEstados;
import Logica.Entidades.Entidad;

public abstract class Estado {
	
	protected Entidad aDestruir = null;
	protected boolean dejoPasar = false;

	protected Estado() {}
	
	public abstract void ejecutar();
	public void entidadADestruir(Entidad e) {
		aDestruir = e;
	}
	
	public boolean getPermisoParaPasar() {
		return dejoPasar;
	}
	
	public abstract void aceptarVisitorEstados(VisitorDeEstados vis);
	
}
