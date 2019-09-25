package Logica.Mapa;

import java.awt.Point;
import java.awt.Rectangle;

public class Posicion {
	
	private int ancho = 100, alto = 65;
	private Point punto;
	private Rectangle rectangulo;
	
	public Posicion(int x, int y) {
		
		punto = new Point(x,y);
		rectangulo = new Rectangle(punto);
		rectangulo.setSize(ancho, alto);
	}
	
	public void setPos(int x, int y) {
		punto.setLocation(x, y);
	}
	public Point getPunto() {
		return punto;
	}
	
	public int getAncho() {
		return ancho;
	}
	public int getAlto() {
		return alto;
	}

}
