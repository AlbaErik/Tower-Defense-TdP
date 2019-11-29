package Logica.Estados.Objetos;

import Logica.Colisionadores.VisitorsDeEstados.VisitorDeEstados;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Estados.Estado;

public abstract class EstadoObjeto extends Estado{
	protected Obstaculo obs;
	
	public EstadoObjeto(Obstaculo o) {
		obs = o;
	}

	@Override
	public abstract void ejecutar();
	
	public void aceptarVisitorEstados(VisitorDeEstados vis) {
		vis.cambiarEstado(this);
	}

}
