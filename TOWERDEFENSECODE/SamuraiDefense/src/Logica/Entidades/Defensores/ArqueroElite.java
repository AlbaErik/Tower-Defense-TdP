package Logica.Entidades.Defensores;

import Armas.Arco;
import Grafica.Entidades.Defensores.ArqueroEliteGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Mapa.Mapa;

public class ArqueroElite extends Defensor {

	public ArqueroElite(int x, int y, Mapa m) {
		super(x, y, m);
		life = 150;
		vida = 150;
		attackSpeed = 1;
		damage = 35;
		range = 400;
		cost = 100;

		grafico = new ArqueroEliteGrafico(x, y, m.getPanelMapa(), this);
		arma = new Arco(this, m);
	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	@Override
	public void atacar(Entidad e) {
		Municion mun = arma.crearMunicionDefensor();
		mun.setDaño(damage);
		mapa.agregarEntidadAlCampoEnPosActual(mun);
	}

	@Override
	public void chocaraDistancia(VisitorDistancia v) {
		v.serChocado(this);
	}

	@Override
	public void superAtaque(Entidad e) {
		Municion mun = arma.crearMunicionDefensor();
		mun.setDaño(damage * 4);
		mapa.agregarEntidadAlCampoEnPosActual(mun);
	}

}
