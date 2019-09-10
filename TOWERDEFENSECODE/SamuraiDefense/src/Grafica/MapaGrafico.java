package Grafica;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.border.EmptyBorder;

import GUI.PanelConFondo;

public class MapaGrafico {
	
	private PanelConFondo panel;
	
	public MapaGrafico() {
		crearFondo();
		establecerPropiedadesDelPanel();
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
	
	private void establecerPropiedadesDelPanel() {
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
	}
	
	public PanelConFondo getGrafica() {
		return panel;
	}
}
