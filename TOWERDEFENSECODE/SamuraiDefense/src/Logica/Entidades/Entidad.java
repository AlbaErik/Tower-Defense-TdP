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
	protected Posicion miCelda;
	protected Mapa mapa;
	protected EntidadGrafica grafico;
	protected int lugarEnMapa;
	protected Colisionador col;
	protected Inteligencia intel;
	protected Estado estado;
	protected boolean permisoCambiarEstado;
	protected int contador = 0;
	//El contador se usa para medir tiempo de ataque

	public Entidad(int x, int y, Mapa m) {
		mapa = m;
		miCelda = new Posicion(x, y);
		permisoCambiarEstado = true;
	}
	
	public Mapa getMapa() {
		return mapa;
	}
	
	public abstract boolean chocaraDistancia(VisitorDistancia v);
	
	/*
	 * Sirve para crear un delay a la hora de ejecutar una accion.
	 */
	public void incrementarContador() {
		contador ++;
	}
	
	public int getContador() {
		return contador;
	}
	
	public void resetContador() {
		contador = 0;
	}
	
	public boolean puedoPasar() {
		return estado.getPermisoParaPasar();
	}
	
	public void setEntidadADestruir(Entidad e) {
		estado.entidadADestruir(e);
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

	public abstract void chocar(Colisionador e);

	public abstract void ejecutarEstado();

	public void prohibidoCambiarEstado() {
		permisoCambiarEstado = false;
	}
	
	public void cambiarEstado(Estado e) {
		if(permisoCambiarEstado) {
			estado = e;
		}
		
	}
	
	public void eliminarPorBoton() {
		
	}
}
