package Logica.Entidades.Premios;

import Grafica.Entidades.Premios.BarricadaGrafica;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.Premios.VisitorMuro;
import Logica.Mapa.Mapa;

public class Muro extends Premio {

	public Muro(int x, int y, Mapa m) {
		super(x, y, m);
		clave = 4;
		miCelda.setAlto(132);
		life = 1000;
		col = new VisitorMuro(this);
		grafico = new BarricadaGrafica(x, y, m.getPanelMapa(), this);
	}

	@Override
	public void chocaraDistancia(VisitorDistancia v) {
		v.serChocado(this);
	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	@Override
	public void ejecutarEstado() {
		miCelda.setAlto(132);
	}

	@Override
	public boolean queHago(int x, int y) {
		boolean puedoPonerlo = true;
		puedoPonerlo = puedoPonerlo && revisarAbajo(x, y);
		return puedoPonerlo;
	}

	private boolean revisarAbajo(int x, int y) {
		boolean toret = true;
	
		for (int i = 0; i < miCelda.getAlto(); i++) {
			if (mapa.hayEnPos(x, y)) {
				toret = false;
			}
			y++;
		}
		return toret;
	}


}
