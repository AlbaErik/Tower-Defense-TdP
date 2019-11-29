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
import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Premios.Premio;
import Logica.Mapa.Mapa;

public class PanelMapa extends JPanel {
	private static final long serialVersionUID = 1L;
	protected Image fondo = new ImageIcon("Sprites/Fondos/FondoMapa1.png").getImage();
	protected Entidad entidad;
	protected Mapa mapa;

	public PanelMapa(Mapa m) {
		mapa = m;
		this.setLayout(null);
		this.setBounds(200, 50, 1000, 650);
		this.addMouseListener(new OyenteMouse());
	}

	public Entidad getEntidadMapa() {
		return entidad;
	}

	public Mapa getMapa() {
		return mapa;
	}

	public void eliminarLabel(JLabel label) {
		remove(label);
		repaint();
	}

	public void agregarEntidad(JLabel e) {
		agregarLabel(e);
	}

	public void agregarLabel(JLabel nuevo) {
		add(nuevo);
		repaint();
	}

	public void insertarPremio(double X, double Y) {
		int x = (int) X;
		int y = (int) Y;
		Premio aColocar = mapa.getPremioActual();
		if (y != 0 && aColocar != null && aColocar.queHago(x, y)) {
			aColocar.cambiarPosLogica(x, y);
			mapa.setEntidad(aColocar);
			JLabel nuevo = aColocar.getGrafico().getGraficoActual();
			mapa.getTienda().eliminarPremio(aColocar.getClave());
			mapa.revisarStockPremios();
			add(nuevo);
			repaint();
		}
		System.out.println("PANELMAPA: SE SETEO PREMIO");
	}

	public void insertarDefensor(double X, double Y) {
		int x = (int) X;
		int y = (int) Y;
		Defensor aColocar = mapa.getPersonajeActual();
		if (y != 0 && aColocar != null && !mapa.hayEnPos(x, y)) {
			aColocar.cambiarPosLogica(x, y);
			mapa.setEntidad(aColocar);
			JLabel nuevo = aColocar.getGrafico().getGraficoActual();
			mapa.getTienda().actualizarOro(-aColocar.getCost());
			mapa.getTienda().getPanelTienda().revisarBotonesDefensores();
			add(nuevo);
			repaint();
		}
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
				y = ((e.getY() / 66) - 3) * 66 + 183;// Lo posiciona en el eje y
			}
			if (mapa.hayPremioActual()) { // PARA PREMIOS
				insertarPremio(x, y);

			} else {// PARA DEFENSORES
				insertarDefensor(x, y);
			}
		}
		
		@Override
		public void mouseReleased(MouseEvent arg0) {

		}

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), this);
	}

	public void repaintComponent(String s) {// Para ponerle otro fondo al mapa
		Graphics g = this.getGraphics();
		super.paintComponent(g);
		fondo = new ImageIcon(s).getImage();
		g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), this);
		repaint();
		System.out.println("PANELMAPA: Se seteo el fondo del siguiente nivel");
	}
}
