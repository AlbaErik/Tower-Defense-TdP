package Logica.Entidades.Atacantes;

import Armas.LanzadorShurikens;
import Grafica.Entidades.Atacantes.NinjaGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Mapa.Mapa;

public class Ninja extends Atacante {

	public Ninja(int x, int y, Mapa m) {
		super(x, y, m);
		life = 210;
		attackSpeed = 0.5;
		damage = 20;
		range = 200;
		movementSpeed = 2;

		grafico = new NinjaGrafico(x, y, m.getPanelMapa(), this);
		arma = new LanzadorShurikens(this, m);
	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();
	}

	@Override
	public void atacar(Entidad aDestruir) {
		Municion mun = arma.crearMunicionAtacante();
		mapa.agregarEntidadAlCampoEnPosActual(mun);
	}

	@Override
	public void chocaraDistancia(VisitorDistancia v) {
		v.serChocado(this);
	}

}
