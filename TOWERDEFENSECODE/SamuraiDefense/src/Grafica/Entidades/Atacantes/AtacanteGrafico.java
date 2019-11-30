package Grafica.Entidades.Atacantes;

import Grafica.Entidades.PersonajeGrafico;
import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Mapa.Posicion;

public abstract class AtacanteGrafico extends PersonajeGrafico {

	protected Atacante miEntidad;
	
	public AtacanteGrafico(int x, int y, PanelMapa m, Atacante e) {
		super(x, y, m);
		miEntidad = e;
	}
	
	public Atacante getEntidad() {
		return miEntidad;
	}
	
	public void cambiarPos(double x, int y) {
		Posicion p = new Posicion(x, y);
		miEntidad.setPos(p);

		pos.setLocation(x, y);
		graficoActual.setBounds((int) x, y, ancho, alto);
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
