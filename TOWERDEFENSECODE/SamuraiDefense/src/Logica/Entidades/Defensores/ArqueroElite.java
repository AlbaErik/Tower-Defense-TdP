package Logica.Entidades.Defensores;

import Grafica.Entidades.Defensores.ArqueroEliteGrafico;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Entidades.Entidad;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaDefensor;
import Logica.Mapa.Mapa;

public class ArqueroElite extends Defensor {

	public ArqueroElite(int x, int y, Mapa m) {
		super(x, y, m);
		super.col = new ColisionadorDefensor(this);
		this.grafico = new ArqueroEliteGrafico(x, y, m.getPanelMapa(), this);
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
