package Grafica.Entidades.Atacantes;

import Grafica.Entidades.PersonajeGrafico;
import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public abstract class AtacanteGrafico extends PersonajeGrafico {

	public AtacanteGrafico(int x, int y, PanelMapa m,Entidad e) {
		super(x, y, m, e);
	}
		
}
