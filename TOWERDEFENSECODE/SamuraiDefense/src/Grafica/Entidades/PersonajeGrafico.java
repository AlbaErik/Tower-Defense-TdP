package Grafica.Entidades;

import java.awt.Image;

public class PersonajeGrafico extends EntidadGrafica{	
	protected Image ImagenTienda;	
	protected PersonajeGrafico(int x,int y) {
		super(x,y);
	}
	
	public Image getImagenTienda() {
		return ImagenTienda;
	}

}

