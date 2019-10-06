package Logica.Entidades.Atacantes;

import Grafica.Entidades.Atacantes.EspadachinGrafico;
import Logica.Colisionadores.ColisionadorAtacante;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public class Espadachin extends Atacante {

	public Espadachin(int x, int y, Mapa m) {
		super(x, y, m);
		
		this.grafico=new EspadachinGrafico(x,y,m.getPanelMapa(),this);
		this.col=new ColisionadorAtacante(this);

	}
	
	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	@Override
	public Entidad copyEntidad() {
		Espadachin ret = new Espadachin(0,0, mapa);
		try {
			ret = (Espadachin) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return ret;
	}

}
