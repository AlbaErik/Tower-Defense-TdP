package Grafica.Entidades.Atacantes;

import Grafica.Entidades.PersonajeGrafico;
import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public abstract class AtacanteGrafico extends PersonajeGrafico {

	public AtacanteGrafico(int x, int y, PanelMapa m,Entidad e) {
		super(x, y, m, e);
	}
	
	public void standing() {
		this.getGraficoActual().setIcon(graficos[0]);
	}
	
	public void running() {
		this.getGraficoActual().setIcon(graficos[1]);
	}
	
	public void atack() {
		this.getGraficoActual().setIcon(graficos[2]);
	}

	public void death() {
		this.getGraficoActual().setIcon(graficos[3]);
	}
	
}
