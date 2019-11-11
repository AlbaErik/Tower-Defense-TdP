package Logica.Entidades.Defensores;

import Armas.TiraLanzas;
import Grafica.Entidades.Defensores.LanceroEliteGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Mapa.Mapa;

public class LanceroElite extends Defensor {

	public LanceroElite(int x, int y, Mapa m) {
		super(x, y, m);
		life = 300;
		vida = 300;
		attackSpeed = 2;
		damage = 50;
		range = 300;
		cost = 250;

		grafico = new LanceroEliteGrafico(x, y, m.getPanelMapa(), this);
		arma = new TiraLanzas(this, m);
	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	@Override
	public void atacar(Entidad aDestruir) {
		Municion mun = arma.crearMunicionDefensor();
		mapa.agregarEntidadAlCampoEnPosActual(mun);
	}

	@Override
	public boolean chocaraDistancia(VisitorDistancia v) {
		return v.serChocado(this);
	}

}
