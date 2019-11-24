package Logica.Entidades.Municiones.MunicionesAtacante;

import Grafica.Entidades.Municiones.MunicionesAtacante.FlechaAtacanteGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Mapa.Mapa;

public class FlechaAtacante extends MunicionAtacante {

	public FlechaAtacante(int x, int y, Mapa m) {
		super(x, y, m);
		velocidad = 12.5;
		daño = 30;

		grafico = new FlechaAtacanteGrafico(x, y, mapa.getPanelMapa(), this);
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
