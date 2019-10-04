package Logica.Entidades.Atacantes;

import Grafica.Entidades.EntidadGrafica;
import Grafica.Entidades.Atacantes.NinjaGrafico;
import Logica.Colisionadores.ColisionadorAtacante;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public class Ninja extends Atacante {

	public Ninja(int x, int y, Mapa m) {
		super(x, y, m);
		this.life = 200;
		this.damage = 30;
		this.attackSpeed = 5;
		this.movementSpeed = 2;
		this.range = 3;
		this.grafico = new NinjaGrafico(x, y, m.getPanelMapa(), this);
		super.col = new ColisionadorAtacante(this);
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	@Override
	public Entidad copyEntidad() {
		Ninja ret = new Ninja(0,0, mapa);
		try {
			ret = (Ninja) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return ret;
	}

}
