package Grafica.Entidades.Defensores;

import Grafica.Entidades.PersonajeGrafico;
import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public class DefensorGrafico extends PersonajeGrafico {

	protected DefensorGrafico(int x, int y, PanelMapa m, Entidad e) {
		super(x, y, m, e);
	}

	public void standing() {
		this.getGraficoActual().setIcon(this.graficos[0]);
	}
	
	public void running() {
	}
	
	public void atack() {
		this.getGraficoActual().setIcon(this.graficos[1]);
	}

	public void death() {
		this.getGraficoActual().setIcon(this.graficos[2]);
	}
	
}