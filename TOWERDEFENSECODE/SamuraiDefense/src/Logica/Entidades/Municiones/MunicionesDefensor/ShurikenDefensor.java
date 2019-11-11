package Logica.Entidades.Municiones.MunicionesDefensor;

import Grafica.Entidades.Municiones.MunicionesDefensor.ShurikenDefensorGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.ColisionadoresMunicion.ColisionadorMunicionDef;
import Logica.Entidades.Municiones.Municion;
import Logica.Inteligencia.InteligenciaMunicionDef;
import Logica.Mapa.Mapa;

public class ShurikenDefensor extends Municion {

	public ShurikenDefensor(int x, int y, Mapa m) {
		super(x, y, m);
		velocidad = 2;
		da�o = 25;
		
		intel = new InteligenciaMunicionDef(this);
		grafico = new ShurikenDefensorGrafico(x, y, mapa.getPanelMapa(), this);
		col = new ColisionadorMunicionDef(this);
	}
	
	@Override
	public void chocar(Colisionador e) {
		
	}
	
	@Override
	public void ejecutarEstado() {
		estado.ejecutar();		
	}

	@Override
	public boolean chocaraDistancia(VisitorDistancia v) {
		return v.serChocado(this);
	}

}
