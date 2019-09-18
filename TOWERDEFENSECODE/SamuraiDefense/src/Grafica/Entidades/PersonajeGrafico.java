package Grafica.Entidades;

import java.awt.Point;


public class PersonajeGrafico{
	protected final int ancho=32;
	protected final int alto=32;
	
	protected Point pos;
	
	protected PersonajeGrafico(int x,int y) {
		pos=new Point(x*ancho,y*alto);
	}
	
	public Point getPos() {
		return pos;
	}

}

