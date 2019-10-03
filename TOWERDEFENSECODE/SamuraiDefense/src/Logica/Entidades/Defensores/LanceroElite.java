package Logica.Entidades.Defensores;

import Grafica.Entidades.Defensores.LanceroEliteGrafico;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.Ninja;
import Logica.Mapa.Mapa;

public class LanceroElite extends Defensor {

	public LanceroElite(int x, int y, Mapa m) {
		super(x, y, m);
		super.col = new ColisionadorDefensor(this);
		this.grafico = new LanceroEliteGrafico(x, y, m.getPanelMapa(), this);
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	@Override
	public Entidad copyEntidad() {
		LanceroElite ret = new LanceroElite( cost, cost, mapa);
		try {
			ret = (LanceroElite)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
}
