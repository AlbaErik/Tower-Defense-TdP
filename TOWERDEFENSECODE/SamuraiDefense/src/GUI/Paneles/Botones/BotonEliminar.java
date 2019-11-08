package GUI.Paneles.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Logica.Entidades.Defensores.Defensor;
import Logica.Tienda.Tienda;

public class BotonEliminar extends JButton {
	private static final long serialVersionUID = 1L;
	protected  Tienda tienda;
	
	public BotonEliminar(Tienda t) {
		tienda=t;
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tienda.setPremio(5);
				tienda.setPersonajeActual(null);
				tienda.setEliminar(true);
			}	
		});
	}
}