package Grafica.Mapa;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Logica.Entidades.Atacantes.Ninja;
import Logica.Mapa.Mapa;
import Logica.Mapa.Posicion;

public class PanelMapa extends JPanel {
	private static final long serialVersionUID = 1L;
	private Image fondo=new ImageIcon("Sprites/Fondos/FondoMapa2.png").getImage();
	private Image fondocongrilla;
	private JLabel fondomapa;
	private Posicion pos;
	private JLabel ninja;
	private Mapa mapa;
	
	public PanelMapa(Mapa m) {
		mapa=m;	
		this.setLayout(null);
		this.setBounds(200,50,1000,650);
		this.addMouseListener(new OyenteMouse());
		
		ninja=new Ninja(800,200,mapa).getGrafico().getGraficoActual();
		this.add(ninja);
	
	}
	
	public void eliminar() {
		ninja.setVisible(false);
		this.remove(ninja);
	}
	
	
	
	private class OyenteMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("X: "+ e.getX());
			System.out.println("Y: "+ e.getY());
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			
		}
		
	}
	 protected void paintComponent(Graphics g) {
        super.paintComponent(g);
		        g.drawImage(fondo, 0, 0, this.getWidth(),this.getHeight(),this);
	}
	 
	protected void repaintComponent(Image i) {//Para ponerle otro fondo al mapa
		Graphics g=this.getGraphics();
		g.drawImage(i, 0, 0, this.getWidth(),this.getHeight(),this);
	}

	

}
