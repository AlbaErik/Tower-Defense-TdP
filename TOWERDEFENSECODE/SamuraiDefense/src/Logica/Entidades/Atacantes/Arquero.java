package Logica.Entidades.Atacantes;

import Grafica.Entidades.Atacantes.ArqueroGrafico;
import Logica.Colisionadores.ColisionadorAtacante;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public class Arquero extends Atacante {

	public Arquero(int x, int y, Mapa m) {
		super(x, y, m);
		this.grafico=new ArqueroGrafico(x,y,m.getPanelMapa(),this);
		this.col=new ColisionadorAtacante(this);
	}
	
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public Entidad copyEntidad() {
		Arquero ret = new Arquero(0,0, mapa);
		try {
			ret = (Arquero) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return ret;
	}

}
