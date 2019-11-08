package Logica.Entidades.Premios;

import Grafica.Entidades.Premios.BarricadaGrafica;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.Premios.VisitorMuro;
import Logica.Mapa.Mapa;

public class Muro extends Premio {

	public Muro(int x, int y, Mapa m) {
		super(x, y, m);
		this.getPos().setAlto(132);
		life = 100;
		col = new VisitorMuro(this);
		grafico = new BarricadaGrafica(x, y, m.getPanelMapa(), this);
	}

	@Override
	public boolean chocaraDistancia(VisitorDistancia v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	@Override
	public void ejecutarEstado() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean queHago(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

}
