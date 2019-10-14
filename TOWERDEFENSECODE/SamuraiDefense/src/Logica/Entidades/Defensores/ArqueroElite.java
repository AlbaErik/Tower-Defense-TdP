package Logica.Entidades.Defensores;

import Armas.Arco;
import Grafica.Entidades.Defensores.ArqueroEliteGrafico;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
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
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
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
	public void atacar() {
		if (contadorDisparos % 50 == 0) {
			Municion mun = arma.crearMunicionDefensor();
			mapa.agregarEntidadAlCampoEnPosActual(mun);
			contadorDisparos = 0;
		}
		contadorDisparos++;		
	}

}
