package Logica.Entidades.Municiones;

import javax.swing.JLabel;

import Grafica.Entidades.EntidadGrafica;
import Grafica.Entidades.Municiones.MunicionGrafica;
import Logica.Entidades.Entidad;
import Logica.Estados.Municion.EstadoMunicion;
import Logica.Mapa.Mapa;

public abstract class Municion extends Entidad {

	protected Mapa mapa;
	protected double velocidad;
	protected int da�o;
	protected MunicionGrafica grafico;

	protected Municion(int x, int y, Mapa m) {
		super(x, y, m);
		mapa = m;
		velocidad = 5;
		estado = new EstadoMunicion(this);
	}

	public EntidadGrafica getGrafico() {
		return grafico;
	}

	public void cambiarPosLogica(double x, int y) {
		miCelda.setPos(x, y);
		grafico.cambiarPos(x, y);
		mapa.getPanelMapa().repaint();
	}

	public JLabel getJLabel() {
		return grafico.getGraficoActual();
	}

	public void setDa�o(int d) {
		da�o = d;
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();
	}

	public int getDa�o() {
		return da�o;
	}

	public double getVel() {
		return velocidad;
	}

}
