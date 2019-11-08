package Logica.Entidades.Defensores;

import Armas.TiraLanzas;
import Grafica.Entidades.Defensores.LanceroEliteGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Estados.Personajes.Defensor.ReposoDefensor;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaDefensor;
import Logica.Mapa.Mapa;

public class LanceroElite extends Defensor {

	public LanceroElite(int x, int y, Mapa m) {
		super(x, y, m);
		life = 300;
		vida = 300;
		attackSpeed = 2; // Es 1 seg
		damage = 50;
		range = 300;// 300 px
		cost = 250;

		grafico = new LanceroEliteGrafico(x, y, m.getPanelMapa(), this);
		intel = new InteligenciaDefensor(this);
		arma = new TiraLanzas(this, m);
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
		Municion mun = arma.crearMunicionDefensor();
		mapa.agregarEntidadAlCampoEnPosActual(mun);
		/*
		 * if(aDestruir != null) { aDestruir.setLife(damage); }
		 */
	}

	@Override
	public boolean chocaraDistancia(VisitorDistancia v) {
		return v.serChocado(this);
	}

}
