package Grafica.Entidades.Defensores;

import Grafica.Entidades.JLabelDefensor;
import Grafica.Entidades.PersonajeGrafico;
import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Defensores.Defensor;
import Logica.Mapa.Posicion;

public class DefensorGrafico extends PersonajeGrafico {
	
	protected Defensor miEntidad;

	protected DefensorGrafico(int x, int y, PanelMapa m, Defensor e) {
		super(x, y, m);
		miEntidad = e;
		graficoActual=new JLabelDefensor(this.getEntidad());
	}
	
	public Defensor getEntidad() {
		return miEntidad;
	}
	
	public void cambiarPos(double x, int y) {
		Posicion p = new Posicion(x, y);
		miEntidad.setPos(p);

		pos.setLocation(x, y);
		graficoActual.setBounds((int) x, y, ancho, alto);
	}

	public void standing() {
		this.getGraficoActual().setIcon(graficos[0]);
	}
	
	public void standingFuerza() {
		this.getGraficoActual().setIcon(graficos[3]);		
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