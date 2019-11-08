package Logica.Entidades.Municiones.MunicionesAtacante;

import Grafica.Entidades.Municiones.MunicionesAtacante.ShurikenGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.ColisionadoresMunicion.ColisionadorMunicionAtaq;
import Logica.Colisionadores.ColisionadoresMunicion.ColisionadorMunicionDef;
import Logica.Entidades.Municiones.Municion;
import Logica.Estados.Municion.EstadoMunicion;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaMunicionAtaq;
import Logica.Mapa.Mapa;

public class ShurikenAtacante extends Municion {

	public ShurikenAtacante(int x, int y, Mapa m) {
		super(x, y, m);
		intel = new InteligenciaMunicionAtaq(this);
		velocidad = 2;
		daño = 15;
		
		grafico = new ShurikenGrafico(x, y, mapa.getPanelMapa(), this);
		estado = new EstadoMunicion(this);
		col = new ColisionadorMunicionAtaq(this);
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
