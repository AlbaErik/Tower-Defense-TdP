package Logica.Entidades.Municiones.MunicionesDefensor;

import Grafica.Entidades.Municiones.MunicionesDefensor.FlechaDefensorGrafico;
import Logica.Colisionadores.ColisionadoresMunicion.ColisionadorMunicionDef;
import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Estados.Avanzar;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaMunicionDef;
import Logica.Mapa.Mapa;

public class FlechaDefensor extends Municion {

	public FlechaDefensor(int x, int y, Mapa m) {
		super(x, y, m);
		intel = new InteligenciaMunicionDef(this);
		velocidad = 12.5;
		daño = 5;
		grafico = new FlechaDefensorGrafico(x, y, mapa.getPanelMapa(), this);
		estado = new Avanzar(this);
		col = new ColisionadorMunicionDef(this);
	}

	public double getVel() {
		return velocidad;
	}
	
	@Override
	public void chocar(Entidad e) {
		// TODO Auto-generated method stub
	}
	
	public Inteligencia getInteligencia() {
		return intel;
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();		
	}

	@Override
	public int getDaño() {
		// TODO Auto-generated method stub
		return daño;
	}

}
