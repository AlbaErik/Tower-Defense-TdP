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
import Logica.PowerUps.PowerUp;
//import Logica.Mapa.Posicion;

public class PanelMapa extends JPanel {
	private static final long serialVersionUID = 1L;
	protected Image fondo = new ImageIcon("Sprites/Fondos/FondoMapa2.png").getImage();
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

	public void eliminarEntidad(Entidad e) {
		JLabel d = e.getGrafico().getGraficoActual();
		this.remove(d);
		repaint();
	}

	public void eliminarPowerUp(PowerUp power) {
		JLabel p = power.getGrafico().getGrafico();
		this.remove(p);
		repaint();
	}

	public void agregarPowerUp(int x, int y, PowerUp power) {
		JLabel nuevo = power.getGrafico().getGrafico();
		nuevo.setBounds(x, y, 120, 120);
		add(nuevo);
		repaint();
		System.out.println("PANELMAPA: Se agrego powerUp al mapa");
	}

	public void agregarEntidad(Entidad e) {

		Random rand = new Random();
		int fila = rand.nextInt(5);
		fila = fila * 66 + 183;
		int x = 900;

		e.cambiarPosLogica(x, fila);
		mapa.setEntidad(e);
		JLabel nuevo = e.getGrafico().getGraficoActual();

		add(nuevo);
		repaint();
	}

	public void agregarEntidadEnPosActual(Entidad e) {
		mapa.setEntidad(e);
		JLabel nuevo = e.getGrafico().getGraficoActual();

		add(nuevo);
		repaint();
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
			if (mapa.tiendaGetEliminar()) {//BOTONELIMINAR
				int x = (e.getX() / 100) * 100; // Lo posiciona en el eje x
				int y = ((e.getY() / 66) - 3) * 66 + 183;// Lo posiciona en el eje y
				if (mapa.hayEnPos(x, y)) {
					Entidad aEliminar = mapa.getEntidadEnPos(x, y);
					aEliminar.eliminarPorBoton();

				}

			} else if (mapa.hayPremioActual()) { //PARA PREMIOS
				int x = (e.getX() / 100) * 100; // Lo posiciona en el eje x
				int y = ((e.getY() / 66) - 3) * 66 + 183;// Lo posiciona en el eje y
				Premio aColocar = mapa.getPremioActual();
				System.out.println("PANELMAPA: HAY PREMIO" + aColocar.getClass());
				if(y != 0 && aColocar!=null && aColocar.queHago(x,y)) {
					aColocar.cambiarPosLogica(x, y);
					System.out.println("PANELMAPA: Se seteo un premio precioso en el X:" + x + " Y:" + y);
					mapa.setEntidad(aColocar);
					JLabel nuevo = aColocar.getGrafico().getGraficoActual();
					mapa.getTienda().eliminarPremio(aColocar.getClave());
					add(nuevo);
					repaint();
			    }
			} else {//PARA DEFENSORES
				int x = 0;
				int y = 0;
				if (e.getY() > 200 && e.getY() < 590 && e.getX() < 600) {
					x = (e.getX() / 100) * 100; // Lo posiciona en el eje x
					y = ((e.getY() / 66) - 3) * 66 + 183;// Lo posiciona en el eje y
				}
				Defensor aColocar = mapa.getPersonajeActual();

				if (y != 0 && aColocar != null && !mapa.hayEnPos(x, y)) {
					aColocar.cambiarPosLogica(x, y);
					System.out.println("PANELMAPA: Se seteo un defensor en el X:" + x + " Y:" + y);
					mapa.setEntidad(aColocar);
					JLabel nuevo = aColocar.getGrafico().getGraficoActual();
					mapa.getTienda().actualizarOro(-aColocar.getCost());
					add(nuevo);
					repaint();
				}

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
