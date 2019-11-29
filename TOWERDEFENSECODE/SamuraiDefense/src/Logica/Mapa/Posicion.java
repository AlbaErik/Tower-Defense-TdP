package Logica.Mapa;

import java.awt.Point;
import java.awt.Rectangle;

public class Posicion {

	private int ancho;
	private int alto;
	private Point punto;
	private Rectangle rectangulo;

	public Posicion(double x, int y) {
		alto = 66;
		ancho = 100;
		punto = new Point((int) x, y);
		rectangulo = new Rectangle(punto);
		rectangulo.setSize(ancho, alto);
	}

	public void setAlto(int i) {
		alto = i;
		//rectangulo.setSize(ancho, alto);
	}

	public void setPos(double x, int y) {
		punto.setLocation(x, y);
	}

	public Rectangle getRectangle() {
		return rectangulo;
	}

	public double getX() {
		return punto.getX();
	}

	public double getY() {
		return punto.getY();
	}

	public int getAncho() {
		return ancho;
	}

	public int getAlto() {
		return alto;
	}

}
