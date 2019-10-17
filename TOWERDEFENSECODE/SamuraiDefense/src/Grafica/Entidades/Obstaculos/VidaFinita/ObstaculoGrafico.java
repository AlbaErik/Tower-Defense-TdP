package Grafica.Entidades.Obstaculos.VidaFinita;

import Grafica.Entidades.EntidadGrafica;
import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public abstract class ObstaculoGrafico extends EntidadGrafica{

	public ObstaculoGrafico(int x, int y, PanelMapa m, Entidad e) {
		super(x, y, m, e);
		// TODO Auto-generated constructor stub
	}
	
	public abstract void vidaAlta();

	public abstract void vidaMedia();

	public abstract void vidaBaja();

}
