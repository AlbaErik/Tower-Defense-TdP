package Logica.Entidades.Defensores;

import Armas.ArmaSimple;
import Grafica.Entidades.Defensores.EspadachinEliteGrafico;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Entidades.Entidad;
import Logica.Estados.Personajes.Reposo;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaDefensor;
import Logica.Mapa.Mapa;

public class EspadachinElite extends Defensor {

	public EspadachinElite(int x, int y, Mapa m) {
		super(x, y, m);
		this.life = 300;
		this.damage = 50;
		this.attackSpeed = 2;
		this.range = 1;
		this.cost = 30;
		this.grafico = new EspadachinEliteGrafico(x, y, m.getPanelMapa(), this);
		super.col = new ColisionadorDefensor(this);
		intel = new InteligenciaDefensor(this);
		arma = new ArmaSimple(this, m);
		estado = new Reposo(this);
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

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();		
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

}
