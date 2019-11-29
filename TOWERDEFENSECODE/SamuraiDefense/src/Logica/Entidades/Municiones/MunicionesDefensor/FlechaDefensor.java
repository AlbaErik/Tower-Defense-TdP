package Logica.Entidades.Municiones.MunicionesDefensor;

import Grafica.Entidades.Municiones.MunicionesDefensor.FlechaDefensorGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Mapa.Mapa;

public class FlechaDefensor extends MunicionDefensor {

	public FlechaDefensor(int x, int y, Mapa m) {
		super(x, y, m);
		velocidad = 12.5;
		
		grafico = new FlechaDefensorGrafico(x, y, mapa.getPanelMapa(), this);
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
