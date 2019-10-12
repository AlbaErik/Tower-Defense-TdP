package Logica.Entidades.Atacantes;

import Grafica.Entidades.Atacantes.EspadachinGrafico;
import Logica.Colisionadores.ColisionadorAtacante;
import Logica.Entidades.Entidad;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;

public class Espadachin extends Atacante {

	public Espadachin(int x, int y, Mapa m) {
		super(x, y, m);
		this.grafico = new EspadachinGrafico(x, y, m.getPanelMapa(), this);
		this.movementSpeed = 2;
		this.col = new ColisionadorAtacante(this);
		intel = new InteligenciaAtacante(this);
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	
	@Override
	public Atacante copyEntidad() {
		return new Espadachin(0,0,super.mapa);
	}

	@Override
	public Inteligencia getInteligencia() {
		// TODO Auto-generated method stub
		return intel;
	}

}
