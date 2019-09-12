package GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class Button extends JButton{
	private static final long serialVersionUID = 1L;
	//private float opacity;
	
	public Button() {
		this.addMouseListener(new EventoMouseButton());
		
	}
	/**public void setOpacity(float opa) {
		opacity=opa;
		this.repaint();
	}**/
	
	private class EventoMouseButton extends MouseAdapter{
		
		public void mouseClicked(MouseEvent e) {
			System.out.println("Es un boton");
		}
	}

}
