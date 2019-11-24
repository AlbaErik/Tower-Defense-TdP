package Logica.Entidades.Premios;

import Grafica.Entidades.Premios.BarricadaGrafica;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.Premios.VisitorMuro;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public class Muro extends Premio {

	public Muro(int x, int y, Mapa m) {
		super(x, y, m);
		clave = 4;
		this.getPos().setAlto(132);
		life = 40000;
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
		// TODO Auto-generated method stub

	}

	@Override
	public boolean queHago(int x, int y) {
		boolean puedoPonerlo = true;
		Entidad ent1 = revisarArriba();
		Entidad ent2 = revisarAbajo();

		if (ent1 != null) {
			puedoPonerlo = ((ent1.getPos().getY() + ent1.getPos().getAlto()) <= this.getPos().getY());
		}

		if (ent2 != null) {
			puedoPonerlo = puedoPonerlo && ((ent2.getPos().getY() - ent2.getPos().getAlto()) >= this.getPos().getY());
		}
		return puedoPonerlo;
	}

	private Entidad revisarAbajo() {
		Entidad toret = null;
		int x = (int) this.getPos().getX();
		int y = (int) this.getPos().getY() + 1;

		for (int i = 0; i < 140; i++) {
			if (mapa.hayEnPos(x, y) && mapa.getEntidadEnPos(x, y) != this) {
				toret = mapa.getEntidadEnPos(x, y);
				break;
			}
			y++;
		}
		return toret;
	}

	private Entidad revisarArriba() {
		Entidad toret = null;
		int x = (int) this.getPos().getX();
		int y = (int) this.getPos().getY() - 1;

		for (int i = 0; i < 140; i++) {
			if (mapa.hayEnPos(x, y) && mapa.getEntidadEnPos(x, y) != this) {
				toret = mapa.getEntidadEnPos(x, y);
				break;
			}
			y--;
		}
		return toret;
	}

}
