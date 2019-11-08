package GUI.Paneles.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Logica.Tienda.Tienda;

public abstract class BotonPremio extends JButton {
	private static final long serialVersionUID = 1L;
	protected  Tienda tienda;
	protected int clave;
	
	public BotonPremio(Tienda t) {
		tienda=t;
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tienda.hayPremio(clave))
					tienda.setPremio(clave);	
			}	
		});
	}
	
    public int getClave() {
    	return clave;
    }

}
