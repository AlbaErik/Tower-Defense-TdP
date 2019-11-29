package Grafica.Entidades.Defensores;

import Grafica.Entidades.JLabelDefensor;
import Grafica.Entidades.PersonajeGrafico;
import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public class DefensorGrafico extends PersonajeGrafico {

	protected DefensorGrafico(int x, int y, PanelMapa m, Entidad e) {
		super(x, y, m, e);
		graficoActual=new JLabelDefensor(this.getEntidad());
	}

	public void standing() {
		this.getGraficoActual().setIcon(graficos[0]);
	}
	
	public void standingFuerza() {
		this.getGraficoActual().setIcon(graficos[3]);
		
	}
	
	public void running() {
	}
	
	public void attack() {
		this.getGraficoActual().setIcon(graficos[1]);
	}
	
	public void attackFuerza() {
		this.getGraficoActual().setIcon(graficos[4]);	
	}

	public void death() {
		this.getGraficoActual().setIcon(graficos[2]);
	}

	

	
	
}