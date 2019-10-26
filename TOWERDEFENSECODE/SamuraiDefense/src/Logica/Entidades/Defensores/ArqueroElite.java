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
		super.col = new ColisionadorDefensor(this);
		this.grafico = new ArqueroEliteGrafico(x, y, m.getPanelMapa(), this);
		intel = new InteligenciaDefensor(this);
		arma = new Arco(this, m);
		life = 800;
		estado = new ReposoDefensor(this);
		life = 140;
		damage = 0;
		colDistancia = new ColADistanciaDef(this);
		range = 400;
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
