package Grafica.Mapa;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Atacantes.Ninja;
import Logica.Entidades.Defensores.Defensor;
import Logica.Mapa.Mapa;
//import Logica.Mapa.Posicion;

public class PanelMapa extends JPanel {
	private static final long serialVersionUID = 1L;
	protected Image fondo = new ImageIcon("Sprites/Fondos/FondoMapa2.png").getImage();
	// private Image fondocongrilla;
	// private JLabel fondomapa;
	// private Posicion pos;
	protected JLabel ninja;
	protected Entidad entidad;
	protected Mapa mapa;

	public PanelMapa(Mapa m) {
		mapa = m;
		this.setLayout(null);
		this.setBounds(200, 50, 1000, 650);
		this.addMouseListener(new OyenteMouse());

		// entidad = new Ninja(1000, 200, mapa);
		// ninja = entidad.getGrafico().getGraficoActual();
		// this.add(ninja);
		System.out.println("Se creo el panelMapa");

	}

	public void eliminar() {
		ninja.setVisible(false);
		this.remove(ninja);
	}

	public void ninja(JLabel n) {
		ninja = n;
	}

	public Entidad getEntidadMapa() {
		return entidad;
	}

	public Mapa getMapa() {
		return mapa;
	}

	public void eliminarDefensorG(Entidad e) {
		JLabel d = e.getGrafico().getGraficoActual();
		this.remove(d);
		repaint();
	}

	public void agregarEntidad(Entidad e) {
		System.out.println("Se agregan Entidades al mapa graficamente");
		Random rand = new Random();
		int fila = rand.nextInt(5);
		fila = fila * 66 + 200;// Lo posiciona en el eje y
		int x = 900;
		e.cambiarPosLogica(x, fila);
		// e.getGrafico().cambiarPos(x, fila);
		mapa.setEntidad(e);
		System.out.println("El grafico es: " + e.getGrafico().getGraficoActual());
		JLabel novo = e.getGrafico().getGraficoActual();
		System.out.println("Hash code JLabel 'nuevo': " + novo);

		add(novo); // No lo puedo agregar
		repaint();

		System.out.println("En la pos " + x + " e " + fila + " hay: " + getComponentAt(x, fila));
	}

	private class OyenteMouse implements MouseListener {

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
			int x = 0;
			int y = 0;
			if (e.getY() > 200 && e.getY() < 590 && e.getX() < 600) {
				x = (e.getX() / 100) * 100; // Lo posiciona en el eje x
				y = ((e.getY() / 66) - 3) * 66 + 200;// Lo posiciona en el eje y
			}
			Defensor aColocar = mapa.getTienda().getPersonajeActual();
			if (y != 0 && aColocar != null && !mapa.hayEnPos(x, y)) {
				aColocar.cambiarPosLogica(x, y);
				mapa.setEntidad(aColocar);
				JLabel nuevo = aColocar.getGrafico().getGraficoActual();
				add(nuevo);
				//System.out.println("En la pos " + x + " e " + y + " hay: " + getComponentAt(x, y));
				repaint();
			}

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {

		}

	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), this);
	}

	protected void repaintComponent(Image i) {// Para ponerle otro fondo al mapa
		Graphics g = this.getGraphics();
		g.drawImage(i, 0, 0, this.getWidth(), this.getHeight(), this);
	}

}
