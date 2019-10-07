package Logica.Entidades;

import Grafica.Entidades.EntidadGrafica;
import Logica.Colisionadores.Colisionador;
import Logica.Inteligencia.Inteligencia;
import Logica.Mapa.Mapa;
import Logica.Mapa.Posicion;

public abstract class Entidad {
	protected int life;
	protected Posicion miCelda;
	protected Mapa mapa;
	protected EntidadGrafica grafico;
	protected int lugarEnMapa;
	protected Colisionador col;
	protected Inteligencia intel;
	protected boolean mover;

	public Entidad(int x, int y, Mapa m) {
		mapa = m;
		miCelda = new Posicion(x, y);
		grafico = new EntidadGrafica(x, y, m.getPanelMapa(), this);
		mover = true;
	}
	
	public boolean mePuedoMover() {
		return mover;
	}
	
	public void mover(boolean mov) {
		mover = mov;
	}

	public Inteligencia getInteligencia() {
		return intel;
	}
	
	public Colisionador getColisionador() {
		return col;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int lp) {
		life = life - lp;
	}

	public Posicion getPos() {
		return miCelda;
	}

	public void setPos(Posicion c) {
		miCelda = c;
	}

	public void cambiarPosLogica(int x, int y) {
		miCelda.setPos(x, y);
		grafico.cambiarPos(x, y);
		mapa.getPanelMapa().repaint();
	}

	public EntidadGrafica getGrafico() {
		return grafico;
	}

	public void setLugarEnMapa(int i) {
		lugarEnMapa = i;
	}

	public int getLugarEnMapa() {
		return lugarEnMapa;
	}

	public abstract void chocar(Entidad e);
}
