package Logica.Entidades;

import Grafica.Entidades.EntidadGrafica;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Estados.Estado;
import Logica.Inteligencia.Inteligencia;
import Logica.Mapa.Mapa;
import Logica.Mapa.Posicion;

public abstract class Entidad {
	protected int life;
	protected int lugarEnMapa;
	protected boolean permisoCambiarEstado;

	protected Posicion miCelda;
	protected Mapa mapa;
	protected EntidadGrafica grafico;
	protected Colisionador col;
	protected Inteligencia intel;
	protected Estado estado;
	protected Contador cont;
	
	protected Entidad(int x, int y, Mapa m) {
		mapa = m;
		permisoCambiarEstado = true;

		miCelda = new Posicion(x, y);
		cont = new Contador();
	}

	public abstract void chocar(Colisionador e);

	public abstract void ejecutarEstado();

	public abstract void chocaraDistancia(VisitorDistancia v);

	public void incrementarContador() {
		cont.incrementarContador();
	}

	public void resetContador() {
		cont.resetContador();
	}

	public boolean puedoPasar() {
		return estado.getPermisoParaPasar();
	}

	public void morir() {
		mapa.eliminarEntidad(this);
	}

	public void cambiarPosLogica(double x, int y) {
		miCelda.setPos(x, y);
		grafico.cambiarPos(x, y);
		mapa.getPanelMapa().repaint();
	}

	public void prohibidoCambiarEstado() {
		permisoCambiarEstado = false;
	}

	public void cambiarEstado(Estado e) {
		if (permisoCambiarEstado) {
			estado = e;
		}
	}

	public void eliminarPorBoton() {}

	/*
	 * getters y setters
	 */
	public int getContador() {
		return cont.getContador();
	}

	public EntidadGrafica getGrafico() {
		return grafico;
	}

	public Mapa getMapa() {
		return mapa;
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

	public Posicion getPos() {
		return miCelda;
	}

	public void setPos(Posicion c) {
		miCelda = c;
	}

	public void setEntidadADestruir(Entidad e) {
		estado.entidadADestruir(e);
	}

	public void recibirDaño(int lp) {
		life = life - lp;
	}

}
