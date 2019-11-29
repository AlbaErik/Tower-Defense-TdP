package Logica.Entidades.Municiones.MunicionesAtacante;

import Grafica.Entidades.Municiones.MunicionesAtacante.ShurikenAtacanteGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Mapa.Mapa;

public class ShurikenAtacante extends MunicionAtacante {

	public ShurikenAtacante(int x, int y, Mapa m) {
		super(x, y, m);
		velocidad = 3;
		
		grafico = new ShurikenAtacanteGrafico(x, y, mapa.getPanelMapa(), this);
	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);
	}
	
	@Override
	public void chocaraDistancia(VisitorDistancia v) {
		v.serChocado(this);
	}
	
}
