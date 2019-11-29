package Logica.Estados.Municion;

import Logica.Colisionadores.VisitorsDeEstados.VisitorDeEstados;
import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Estados.Estado;

public class EstadoMunicion extends Estado{
	private Municion mun;
	
	public EstadoMunicion(Municion m) {
		mun = m;
	}

	@Override
	public void ejecutar() {
		mun.getInteligencia().mover();
	}

	@Override
	public void entidadADestruir(Entidad e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aceptarVisitorEstados(VisitorDeEstados vis) {
		vis.cambiarEstado(this);
	}

}
