package GUI.Paneles.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Logica.Entidades.Premios.Bombita;
import Logica.Tienda.Tienda;

public abstract class BotonPremio extends JButton {
	private static final long serialVersionUID = 1L;
	protected  Tienda tienda;
	protected int clave;
	
	public BotonPremio(Tienda t) {
		tienda=t;
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**tienda.setEliminar(false);
				tienda.setPersonajeActual(null);
				if(tienda.hayPremio(clave))
					tienda.setPremio(clave);	**/
				tienda.setPremioActual(new Bombita(0,0,tienda.getJuego().getMapa()));
				System.out.println("BOTONPREMIO: SE SETEO LA BOMBITA EN PREMIOACTUAL");
			}	
		});
	}
	
    public int getClave() {
    	return clave;
    }

}
