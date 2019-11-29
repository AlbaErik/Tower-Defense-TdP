package Logica.Entidades.Municiones.MunicionesDefensor;

import Grafica.Entidades.Municiones.MunicionesDefensor.ShurikenDefensorGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Mapa.Mapa;

public class ShurikenDefensor extends MunicionDefensor {

	public ShurikenDefensor(int x, int y, Mapa m) {
		super(x, y, m);
		velocidad = 3;
		
		grafico = new ShurikenDefensorGrafico(x, y, mapa.getPanelMapa(), this);
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
