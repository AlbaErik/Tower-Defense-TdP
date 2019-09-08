package Grafica;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import GUI.PanelConFondo;

public class MapaGrafico {
	
	private PanelConFondo panel;
	
	public MapaGrafico() {
		crearFondo();
		
	}
	
	private void crearFondo() {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("Acantilado.jpg"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		panel = new PanelConFondo(img);
	}
}
