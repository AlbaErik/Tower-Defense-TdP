package Grafica.Entidades.Atacantes;

import Grafica.Entidades.PersonajeGrafico;
import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public abstract class AtacanteGrafico extends PersonajeGrafico {

	public AtacanteGrafico(int x, int y, PanelMapa m,Entidad e) {
		super(x, y, m, e);
	}
	
	public void standing() {
		getGraficoActual().setIcon(graficos[0]);
	}
	
	public void running() {
		getGraficoActual().setIcon(graficos[1]);
	}
	
	public void attack() {
		getGraficoActual().setIcon(graficos[2]);
	}

	public void death() {
		getGraficoActual().setIcon(graficos[3]);
	}
		
}
