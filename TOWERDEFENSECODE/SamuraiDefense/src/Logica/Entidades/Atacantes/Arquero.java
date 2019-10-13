package Logica.Entidades.Atacantes;

import Armas.Arco;
import Grafica.Entidades.Atacantes.ArqueroGrafico;
import Logica.Colisionadores.ColisionadorAtacante;
import Logica.Entidades.Entidad;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;

public class Arquero extends Atacante {

	public Arquero(int x, int y, Mapa m) {
		super(x, y, m);
		this.grafico = new ArqueroGrafico(x, y, m.getPanelMapa(), this);
		this.movementSpeed = 1;
		this.col = new ColisionadorAtacante(this);
		intel = new InteligenciaAtacante(this);
		arma = new Arco(this, m);
	}

	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	public Atacante copyEntidad() {
		return new Arquero(0, 0, super.mapa);
	}

	@Override
	public Inteligencia getInteligencia() {
		return intel;
	}

}
