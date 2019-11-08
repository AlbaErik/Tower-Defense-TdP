package Logica.Entidades.Municiones.MunicionesDefensor;

import Grafica.Entidades.Municiones.MunicionesDefensor.ShurikenDefensorGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.ColisionadoresMunicion.ColisionadorMunicionDef;
import Logica.Entidades.Municiones.Municion;
import Logica.Estados.Municion.EstadoMunicion;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaMunicionDef;
import Logica.Mapa.Mapa;

public class ShurikenDefensor extends Municion {

	public ShurikenDefensor(int x, int y, Mapa m) {
		super(x, y, m);
		intel = new InteligenciaMunicionDef(this);
		velocidad = 2;
		daño = 25;
		
		grafico = new ShurikenDefensorGrafico(x, y, mapa.getPanelMapa(), this);
		estado = new EstadoMunicion(this);
		col = new ColisionadorMunicionDef(this);
	}
	
	public double getVel() {
		return velocidad;
	}

	@Override
	public void chocar(Colisionador e) {

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

	@Override
	public boolean chocaraDistancia(VisitorDistancia v) {
		return v.serChocado(this);
	}

}
