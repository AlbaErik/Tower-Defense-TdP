package Logica.Entidades.Municiones.MunicionesDefensor;

import Grafica.Entidades.Municiones.MunicionesDefensor.FlechaDefensorGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.ColisionadoresMunicion.ColisionadorMunicionDef;
import Logica.Entidades.Municiones.Municion;
import Logica.Inteligencia.InteligenciaMunicionDef;
import Logica.Mapa.Mapa;

public class FlechaDefensor extends Municion {

	public FlechaDefensor(int x, int y, Mapa m) {
		super(x, y, m);
		velocidad = 12.5;
		daño = 35;
		
		grafico = new FlechaDefensorGrafico(x, y, mapa.getPanelMapa(), this);
		intel = new InteligenciaMunicionDef(this);
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
