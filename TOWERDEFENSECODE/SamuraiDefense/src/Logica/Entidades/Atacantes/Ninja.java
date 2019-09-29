package Logica.Entidades.Atacantes;

import Logica.Colisionadores.*;
import Grafica.Entidades.EntidadGrafica;
import Grafica.Entidades.Atacantes.NinjaGrafico;
import Logica.Mapa.Mapa;

public class Ninja extends Atacante {

	public Ninja(int x, int y, Mapa m) {
		super(x, y, m);
		this.life=200;
		this.damage=30;
		this.attackSpeed=5;
		this.movementSpeed=2;
		this.range=3;
		this.grafico=new NinjaGrafico(x,y,m.getPanelMapa(),this);
		
		super.col = new ColisionadorAtacante(this);
	}

	@Override
	public void setLife(int lp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntidadGrafica getGrafico() {
		return grafico;
	}

}