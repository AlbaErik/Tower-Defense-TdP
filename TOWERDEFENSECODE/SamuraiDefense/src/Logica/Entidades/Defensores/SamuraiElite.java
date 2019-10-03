package Logica.Entidades.Defensores;

import Grafica.Entidades.Defensores.SamuraiEliteGrafico;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.Ninja;
import Logica.Mapa.Mapa;

public class SamuraiElite extends Defensor {

	public SamuraiElite(int x,int y,Mapa m) {
		super(x,y,m);
		super.col = new ColisionadorDefensor(this);
		this.grafico=new SamuraiEliteGrafico(x,y,m.getPanelMapa(),this);
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	@Override
	public Entidad copyEntidad() {
		SamuraiElite ret = new SamuraiElite(cost, cost, mapa);
		try {
			ret = (SamuraiElite)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}

}
