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
		damage = 30;
		range = 200;
		movementSpeed = 1.5;

		grafico = new ArqueroGrafico(x, y, m.getPanelMapa(), this);
		arma = new Arco(this, m);
	}

	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	@Override
	public void atacar(Entidad e) {
		Municion mun = arma.crearMunicionAtacante();
		mun.setDaño(damage);
		mapa.agregarEntidadAlCampoEnPosActual(mun);
	}

	@Override
	public void chocaraDistancia(VisitorDistancia v) {
		v.serChocado(this);
	}	

}
