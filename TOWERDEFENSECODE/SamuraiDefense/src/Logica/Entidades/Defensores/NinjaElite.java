package Logica.Entidades.Defensores;

import Armas.LanzadorShurikens;
import Grafica.Entidades.Defensores.NinjaEliteGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Mapa.Mapa;

public class NinjaElite extends Defensor {

	public NinjaElite(int x, int y, Mapa m) {
		super(x, y, m);
		life = 200;
		vida = 200;
		attackSpeed = 0.5;
		damage = 25;
		range = 200;
		cost = 150;

		grafico = new NinjaEliteGrafico(x, y, m.getPanelMapa(), this);
		arma = new LanzadorShurikens(this, m);
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
