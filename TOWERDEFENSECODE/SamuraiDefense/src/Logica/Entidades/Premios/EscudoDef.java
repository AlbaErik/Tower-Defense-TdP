package Logica.Entidades.Premios;

import Grafica.Entidades.Premios.EscudoGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.Premios.VisitorEscudoDef;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public class EscudoDef extends Premio {

	private Entidad entidad = null;

	public EscudoDef(int x, int y, Mapa m) {
		super(x, y, m);
		clave = 1;
		grafico = new EscudoGrafico(y, y, mapa.getPanelMapa(), this);
		col = new VisitorEscudoDef(this);
	}

	private void ubicarEscudo() {
		if (entidad != null) {
			this.setPos(entidad.getPos());
			int y = (int) this.getPos().getY();
			int x = (int) this.getPos().getX() + 10;
			this.getPos().setPos(x, y);
		}
	}

	@Override
	public boolean chocaraDistancia(VisitorDistancia v) {
		return v.serChocado(this);
	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	@Override
	public void ejecutarEstado() {

	}

	@Override
	public boolean queHago(int x, int y) {
		Entidad ent = mapa.getEntidadEnPos(x, y);
		boolean toret = false;
		if (ent != null) {
			setEntidad(ent);
			toret = true;
		}
		return toret;
	}

	private void setEntidad(Entidad ent) {
		entidad = ent;
		ubicarEscudo();
	}

}
