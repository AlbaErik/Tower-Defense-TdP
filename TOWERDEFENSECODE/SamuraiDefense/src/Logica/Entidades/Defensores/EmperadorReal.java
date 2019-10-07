package Logica.Entidades.Defensores;

import Grafica.Entidades.Defensores.EmperadorRealGrafico;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Entidades.Entidad;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaDefensor;
import Logica.Mapa.Mapa;

public class EmperadorReal extends Defensor {

	public EmperadorReal(int x, int y, Mapa m) {
		super(x, y, m);
		super.col = new ColisionadorDefensor(this);
		this.grafico = new EmperadorRealGrafico(x, y, m.getPanelMapa(), this);
		intel = new InteligenciaDefensor(this);
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	@Override
	public Inteligencia getInteligencia() {
		// TODO Auto-generated method stub
		return intel;
	}

}
