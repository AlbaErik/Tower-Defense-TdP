package Logica.Estados.Objetos;

import Logica.Colisionadores.VisitorsDeEstados.VisitorDeEstados;
import Logica.Entidades.Obstaculos.ConVida.ObstaculoConVida;
import Logica.Estados.Estado;

public abstract class EstadoObjeto extends Estado{
	protected ObstaculoConVida obs;
	
	public EstadoObjeto(ObstaculoConVida o) {
		obs = o;
	}

	@Override
	public abstract void ejecutar();
	
	public void aceptarVisitorEstados(VisitorDeEstados vis) {
		vis.cambiarEstado(this);
	}

}
