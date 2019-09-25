package Grafica.Entidades.Atacantes;

import Grafica.Entidades.PersonajeGrafico;
import Grafica.Mapa.PanelMapa;

public class AtacanteGrafico extends PersonajeGrafico {

	public AtacanteGrafico(int x, int y, PanelMapa m) {
		super(x, y, m);
	}
	
	public void avanzar() {
		this.getGraficoActual().setIcon(graficos[0]);
	}

}
