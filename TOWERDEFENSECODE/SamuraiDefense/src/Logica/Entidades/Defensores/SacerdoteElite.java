package Logica.Entidades.Defensores;

import Grafica.Entidades.Defensores.SacerdoteEliteGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Entidades.Entidad;
import Logica.Estados.Personajes.Defensor.ReposoDefensor;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaDefensor;
import Logica.Mapa.Mapa;

public class SacerdoteElite extends Defensor {

	public SacerdoteElite(int x, int y, Mapa m) {
		super(x, y, m);
		life = 350;
		attackSpeed = 3; //Es 1 seg
		damage = 70;
		range = 100;//300 px
		cost = 300;
			
		grafico = new SacerdoteEliteGrafico(x, y, m.getPanelMapa(), this);
		intel = new InteligenciaDefensor(this);
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
