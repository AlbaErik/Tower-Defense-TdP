package Logica.Entidades.Defensores;

import Armas.ArmaSimple;
import Grafica.Entidades.Defensores.EspadachinEliteGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Entidades.Entidad;
import Logica.Estados.Personajes.Defensor.ReposoDefensor;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaDefensor;
import Logica.Mapa.Mapa;

public class EspadachinElite extends Defensor {

	public EspadachinElite(int x, int y, Mapa m) {
		super(x, y, m);
		life = 250;
		attackSpeed = 1; //Es 1 seg
		damage = 40;
		range = 100;
		cost = 200;
		
		grafico = new EspadachinEliteGrafico(x, y, m.getPanelMapa(), this);
		intel = new InteligenciaDefensor(this);
		arma = new ArmaSimple(this, m);
		estado = new ReposoDefensor(this);
		col = new ColisionadorDefensor(this);
	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);
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
	public void atacar(Entidad aDestruir) {
		if(aDestruir != null) {
			aDestruir.setLife(damage);
		}
	}

}
