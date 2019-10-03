package Logica.Entidades.Defensores;

import Grafica.Entidades.Defensores.ArqueroEliteGrafico;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.Ninja;
import Logica.Mapa.Mapa;

public class ArqueroElite extends Defensor {

	public ArqueroElite(int x, int y, Mapa m) {
		super(x, y, m);
		super.col = new ColisionadorDefensor(this);
		this.grafico = new ArqueroEliteGrafico(x, y, m.getPanelMapa(), this);
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	@Override
	public Entidad copyEntidad() {
		ArqueroElite ret = new ArqueroElite( cost, cost, mapa);
		try {
			ret = (ArqueroElite)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return ret;
	}

}
