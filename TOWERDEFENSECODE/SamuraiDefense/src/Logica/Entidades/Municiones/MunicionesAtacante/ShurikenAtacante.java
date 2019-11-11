package Logica.Entidades.Municiones.MunicionesAtacante;

import Grafica.Entidades.Municiones.MunicionesAtacante.ShurikenAtacanteGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.ColisionadoresMunicion.ColisionadorMunicionAtaq;
import Logica.Entidades.Municiones.Municion;
import Logica.Inteligencia.InteligenciaMunicionAtaq;
import Logica.Mapa.Mapa;

public class ShurikenAtacante extends Municion {

	public ShurikenAtacante(int x, int y, Mapa m) {
		super(x, y, m);
		velocidad = 2;
		daño = 20;
		
		intel = new InteligenciaMunicionAtaq(this);
		grafico = new ShurikenAtacanteGrafico(x, y, mapa.getPanelMapa(), this);
		col = new ColisionadorMunicionAtaq(this);
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
