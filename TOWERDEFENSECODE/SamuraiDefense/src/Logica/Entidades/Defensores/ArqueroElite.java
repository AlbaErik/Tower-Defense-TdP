package Logica.Entidades.Defensores;

import Armas.Arco;
import Grafica.Entidades.Defensores.ArqueroEliteGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Colisionadores.Adistancia.ColADistanciaDef;
import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Estados.Personajes.Defensor.ReposoDefensor;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaDefensor;
import Logica.Mapa.Mapa;

public class ArqueroElite extends Defensor {

	public ArqueroElite(int x, int y, Mapa m) {
		super(x, y, m);
		life = 150;
		attackSpeed=1;
		damage = 30;
		range = 400;
		cost=100;
		
		grafico = new ArqueroEliteGrafico(x, y, m.getPanelMapa(), this);
		intel = new InteligenciaDefensor(this);
		arma = new Arco(this, m);
		estado = new ReposoDefensor(this);
		col = new ColisionadorDefensor(this);
		colDistancia = new ColADistanciaDef(this);	
	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);
	}


	@Override
	public Inteligencia getInteligencia() {
		return intel;
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();
	}

	@Override
	public void atacar(Entidad e) {
		Municion mun = arma.crearMunicionDefensor();
		mapa.agregarEntidadAlCampoEnPosActual(mun);
	}

}
