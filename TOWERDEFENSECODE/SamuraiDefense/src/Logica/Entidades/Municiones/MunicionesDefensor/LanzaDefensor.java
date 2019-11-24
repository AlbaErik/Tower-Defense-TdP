package Logica.Entidades.Municiones.MunicionesDefensor;

import Grafica.Entidades.Municiones.MunicionesDefensor.LanzaDefensorGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Mapa.Mapa;

public class LanzaDefensor extends MunicionDefensor {

	public LanzaDefensor(int x, int y, Mapa m) {
		super(x, y, m);
		velocidad = 2;
		da�o =50;
		
		grafico = new LanzaDefensorGrafico(x, y, mapa.getPanelMapa(), this);
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
