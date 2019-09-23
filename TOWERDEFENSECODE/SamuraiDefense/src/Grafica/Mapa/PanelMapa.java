package Grafica.Mapa;


import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Logica.Mapa.Mapa;
import Logica.Mapa.Posicion;

public class PanelMapa extends JPanel {
	private static final long serialVersionUID = 1L;
	private Image fondo,fondocongrilla;
	private JLabel fondomapa;
	private Posicion pos;
	private Mapa mapa;
	
	public PanelMapa(Mapa m) {
		mapa=m;	
		this.setLayout(null);
		this.setBounds(200,50,1000,650);
		
		
		//fondo=new ImageIcon("Sprites/FondoMapa2.jpg").getImage();
		fondomapa=new JLabel();
		fondomapa.setIcon(new ImageIcon("Sprites/FondoMapa2.png"));
		fondomapa.setBounds(0, 0, 1000, 650);
		this.add(fondomapa);
	}
	
	
/**	public void paint(Graphics g) {
		g.drawImage(fondo, 0, 0, this.getWidth(),this.getHeight(),this);
		this.setOpaque(false);
		super.paint(g);
	}**/
	

}
