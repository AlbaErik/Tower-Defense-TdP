package Logica.Entidades.Premios;

import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.Premios.VisitorPocionFuerza;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public class PocionFuerza extends Premio{

	//private Colisionador col;
	
	public PocionFuerza(int x, int y, Mapa m) {
		super(x, y, m);
		col = new VisitorPocionFuerza();
		clave = 2;
	}

	@Override
	public void chocaraDistancia(VisitorDistancia v) {
		v.serChocado(this);
	}

	@Override
	public void chocar(Colisionador e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejecutarEstado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean queHago(int x,int y) {
		Entidad ent;
		if(mapa.hayEnPos(x, y)) {
			ent = mapa.getEntidadEnPos(x, y);
			ent.chocar(col);
		}
		mapa.getTienda().eliminarPremio(clave);

		return false;
	}
	
	public void cambiarPosLogica(double x, int y){
		
	}

}
