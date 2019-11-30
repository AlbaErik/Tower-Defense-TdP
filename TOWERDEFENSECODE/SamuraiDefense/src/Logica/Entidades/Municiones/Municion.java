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
	protected int daño;
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

	public void setDaño(int d) {
		daño = d;
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();
	}

	public int getDaño() {
		return daño;
	}

	public double getVel() {
		return velocidad;
	}

}
