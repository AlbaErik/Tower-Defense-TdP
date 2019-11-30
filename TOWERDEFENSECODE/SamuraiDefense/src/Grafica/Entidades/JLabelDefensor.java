package Grafica.Entidades;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import Logica.Entidades.Entidad;
import Logica.Entidades.Defensores.Defensor;

public class JLabelDefensor extends JLabel {
	private static final long serialVersionUID = 1L;
	protected Defensor defensor;
	public JLabelDefensor(Entidad def) {
		defensor=(Defensor)def;
		this.addMouseListener(new OyenteDef());
	}

	private class OyenteDef implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
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
		public void mousePressed(MouseEvent arg0) {
			if(defensor.getMapa().tiendaGetEliminar()) {
				if (defensor.getLife() <= defensor.getVida() && defensor.getLife() > (defensor.getVida()  / 2))
					defensor.getMapa().actualizarOroTienda(defensor.getCost());
				if (defensor.getLife() <= (defensor.getVida() / 2))
					defensor.getMapa().actualizarOroTienda(defensor.getCost() / 2);
				defensor.getMapa().eliminarEntidad(defensor);
			}else if(defensor.getMapa().hayPremioActual()) {
				   defensor.getMapa().getPanelMapa().insertarPremio(defensor.getPos().getX(),defensor.getPos().getY());
			}
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
