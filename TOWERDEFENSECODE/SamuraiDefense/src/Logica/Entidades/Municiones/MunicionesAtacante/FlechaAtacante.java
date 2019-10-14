package Logica.Entidades.Municiones.MunicionesAtacante;

import Grafica.Entidades.Municiones.MunicionesAtacante.FlechaAtacanteGrafico;
import Logica.Colisionadores.ColisionadorMunicion;
import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Estados.Avanzar;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaMunicionAtaq;
import Logica.Mapa.Mapa;

public class FlechaAtacante extends Municion {

	public FlechaAtacante(int x, int y, Mapa m) {
		super(x, y, m);
		intel = new InteligenciaMunicionAtaq(this);
		velocidad = 12.5;
		grafico = new FlechaAtacanteGrafico(x, y, mapa.getPanelMapa(), this);
		estado = new Avanzar(this);
		col = new ColisionadorMunicion();
	}
	
	public double getVel() {
		return velocidad;
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}
	
	public Inteligencia getInteligencia() {
		return intel;
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();		
	}

}
