package Grafica.Entidades.Obstaculos.VidaFinita;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public abstract class ObstaculoGraficoFinito extends ObstaculoGrafico{

	public ObstaculoGraficoFinito(int x, int y, PanelMapa m, Entidad e) {
		super(x, y, m, e);
		// TODO Auto-generated constructor stub
	}
	
	public abstract void vidaAlta();

	public abstract void vidaMedia();

	public abstract void vidaBaja();

}
