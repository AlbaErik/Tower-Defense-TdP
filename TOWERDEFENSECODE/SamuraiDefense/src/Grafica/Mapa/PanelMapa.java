package Grafica.Mapa;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Grafica.Entidades.EntidadGrafica;
import Grafica.Entidades.PersonajeGrafico;
import Logica.Entidades.Entidad;
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
	private Entidad entidad;
	private Mapa mapa;
	
	public PanelMapa(Mapa m) {
		mapa=m;	
		this.setLayout(null);
		this.setBounds(200,50,1000,650);
		this.addMouseListener(new OyenteMouse());
		
		entidad=new Ninja(800,200,mapa);
		ninja=entidad.getGrafico().getGraficoActual();
		this.add(ninja);
	
	}
	
	public void eliminar() {
		ninja.setVisible(false);
		this.remove(ninja);
	}
	
	public void ninja(JLabel n) {
		ninja=n;
	}
	
	public Entidad getEntidadMapa() {
		return entidad;
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
			System.out.println("X: "+ e.getX()+","+"Y: "+ e.getY());
			int x=(e.getX()/100)*100+50; //Lo posiciona en el eje x
			int y=0;
			if(e.getY()>250) {
				y=((e.getY()/66)-4)*66 + 33 +250;//Lo posiciona en el eje y
			}
			System.out.println("X: "+x+" , "+"Y: "+y);
			
			if(y!=0 && mapa.getTienda().getPersonajeActual()!=null) {
				mapa.getTienda().getPersonajeActual().setX(x);
				mapa.getTienda().getPersonajeActual().setY(y);
				mapa.setDefensor(mapa.getTienda().getPersonajeActual());
				JLabel nuevo=mapa.getDefensor().getGrafico().getGraficoActual();
				int ancho=mapa.getDefensor().getGrafico().getEntidad().getPos().getAncho();
				int alto=mapa.getDefensor().getGrafico().getEntidad().getPos().getAlto();
				nuevo.setBounds(x, y,ancho, alto);
				add(nuevo);
			}
			
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
