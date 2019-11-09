package Logica.Entidades.Municiones.MunicionesDefensor;

import Grafica.Entidades.Municiones.MunicionesDefensor.LanzaDefensorGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.ColisionadoresMunicion.ColisionadorMunicionDef;
import Logica.Entidades.Municiones.Municion;
import Logica.Estados.Municion.EstadoMunicion;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaMunicionDef;
import Logica.Mapa.Mapa;

public class LanzaDefensor extends Municion {

	public LanzaDefensor(int x, int y, Mapa m) {
		super(x, y, m);
		velocidad = 2;
		daño =50;
		
		intel = new InteligenciaMunicionDef(this);
		grafico = new LanzaDefensorGrafico(x, y, mapa.getPanelMapa(), this);
		estado = new EstadoMunicion(this);
		col = new ColisionadorMunicionDef(this);
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
