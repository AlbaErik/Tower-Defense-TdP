package Grafica.PowerUps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.Entidades.Entidad;
import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Premios.Premio;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;

public abstract class PowerUpGrafico extends JLabel {
	private static final long serialVersionUID = 1L;
	private PowerUp pu;
	protected Mapa mapa;

	public PowerUpGrafico(PowerUp p) {
		pu = p;
		addMouseListener(new OyenteMouse());

	}

	public abstract JLabel getGrafico();

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
			pu.click();
			pu.morir();
			System.out.println("POWERUPGRAFICO: Se elimino entidad");
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {

		}

	}
}
