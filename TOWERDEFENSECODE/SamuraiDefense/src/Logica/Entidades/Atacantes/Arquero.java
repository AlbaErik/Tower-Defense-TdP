package Logica.Entidades.Atacantes;

import Armas.Arco;
import Grafica.Entidades.Atacantes.ArqueroGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Mapa.Mapa;

public class Arquero extends Atacante {

	public Arquero(int x, int y, Mapa m) {
		super(x, y, m);
		life = 160;
		attackSpeed = 1;
		damage = 30;
		range = 200;
		movementSpeed = 1.5;

		grafico = new ArqueroGrafico(x, y, m.getPanelMapa(), this);
		arma = new Arco(this, m);
	}

	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	public Atacante clone() {
		return new Arquero(0, 0, super.mapa);
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();
	}

	@Override
	public void atacar(Entidad e) {
		Municion mun = arma.crearMunicionAtacante();
		mapa.agregarEntidadAlCampoEnPosActual(mun);
	}

	@Override
	public boolean chocaraDistancia(VisitorDistancia v) {
		return v.serChocado(this);
	}	

}
