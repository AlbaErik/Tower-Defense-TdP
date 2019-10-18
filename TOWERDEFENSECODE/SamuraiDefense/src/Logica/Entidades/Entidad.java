package Logica.Entidades;

import Grafica.Entidades.EntidadGrafica;
import Logica.Colisionadores.Colisionador;
import Logica.Estados.Estado;
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
	protected Estado estado;
	protected boolean permisoCambiarEstado;

	public Entidad(int x, int y, Mapa m) {
		mapa = m;
		miCelda = new Posicion(x, y);
		permisoCambiarEstado = true;
	}

	public void morir() {
		mapa.eliminarEntidad(this);
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

	public void cambiarPosLogica(double x, int y) {
		miCelda.setPos(x, y);
		grafico.cambiarPos(x, y);
		mapa.getPanelMapa().repaint();
	}

	public EntidadGrafica getGrafico() {
		return grafico;
	}

	public abstract void chocar(Entidad e);

	public abstract void ejecutarEstado();

	public void prohibidoCambiarEstado() {
		permisoCambiarEstado = false;
	}
	
	public void cambiarEstado(Estado e) {
		System.out.println("assdfasd");
		if(permisoCambiarEstado) {
			System.out.println("Se cambia el estado por: " + e.getClass());
			estado = e;
		}
		
	}
}
