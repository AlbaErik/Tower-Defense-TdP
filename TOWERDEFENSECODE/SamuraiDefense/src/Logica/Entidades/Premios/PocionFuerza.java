package Logica.Entidades.Premios;

import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Mapa.Mapa;

public class PocionFuerza extends Premio{

	public PocionFuerza(int x, int y, Mapa m) {
		super(x, y, m);
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
		if(mapa.hayEnPos(x, y))
			mapa.getEntidadEnPos(x, y).subirFuerza(8000);
		return mapa.hayEnPos(x, y);
	}
	
	public void cambiarPosLogica(double x, int y){
		
	}

}
