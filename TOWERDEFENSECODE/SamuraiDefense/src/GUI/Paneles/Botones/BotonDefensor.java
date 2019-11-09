package GUI.Paneles.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Logica.Entidades.Defensores.Defensor;
import Logica.Tienda.Tienda;

public abstract class BotonDefensor extends JButton {
	private static final long serialVersionUID = 1L;
	protected Tienda tienda;

	public BotonDefensor(Tienda t) {
		tienda = t;
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tienda.setEliminar(false);
				tienda.setPremio(5);
				Defensor defensor = crearDefensor();
				t.setPersonajeActual(defensor);
			}
		});
	}

	public abstract Defensor crearDefensor();

}
