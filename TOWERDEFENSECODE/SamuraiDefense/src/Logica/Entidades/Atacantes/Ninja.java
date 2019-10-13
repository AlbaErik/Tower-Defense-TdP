package Logica.Entidades.Atacantes;

import Armas.LanzadorShurikens;
import Grafica.Entidades.Atacantes.NinjaGrafico;
import Logica.Colisionadores.ColisionadorAtacante;
import Logica.Entidades.Entidad;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;

public class Ninja extends Atacante {

	public Ninja(int x, int y, Mapa m) {
		super(x, y, m);
		intel = new InteligenciaAtacante(this);
		this.life = 200;
		this.damage = 30;
		this.attackSpeed = 5;
		this.movementSpeed = 1.5;
		this.range = 3;
		this.grafico = new NinjaGrafico(x, y, m.getPanelMapa(), this);
		this.col = new ColisionadorAtacante(this);
		arma = new LanzadorShurikens(this, m);
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	@Override
	public Atacante copyEntidad() {
		return new Ninja(0, 0, super.mapa);
	}

}
