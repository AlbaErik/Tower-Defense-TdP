package Logica.Entidades.Municiones.MunicionesAtacante;

import Grafica.Entidades.Municiones.MunicionesAtacante.FlechaAtacanteGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.ColisionadoresMunicion.ColisionadorMunicionAtaq;
import Logica.Entidades.Municiones.Municion;
import Logica.Inteligencia.InteligenciaMunicionAtaq;
import Logica.Mapa.Mapa;

public class FlechaAtacante extends Municion {

	public FlechaAtacante(int x, int y, Mapa m) {
		super(x, y, m);
		velocidad = 12.5;
		daño = 30;

		grafico = new FlechaAtacanteGrafico(x, y, mapa.getPanelMapa(), this);
		intel = new InteligenciaMunicionAtaq(this);
		col = new ColisionadorMunicionAtaq(this);
	}
	
	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	@Override
	public boolean chocaraDistancia(VisitorDistancia v) {
		return v.serChocado(this);
	}


}
