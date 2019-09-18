package GUI.Paneles.ObjetosPaneles;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import GUI.ClaseGuardarImg;

public class Button extends JButton{
	private static final long serialVersionUID = 1L;
	private ImageIcon img=null;
	//private float opacity;
	
	public Button() {
		this.addMouseListener(new EventoMouseButton());
		
	}
	private void setImg(ImageIcon i) {
		this.setIcon(i);
		img=i;
	}
	/**public void setOpacity(float opa) {
		opacity=opa;
		this.repaint();
	}**/
	
	private class EventoMouseButton extends MouseAdapter{
		
		public void mouseClicked(MouseEvent e) {
			System.out.println("Es un boton");
			if(ClaseGuardarImg.getIntance().tieneImg()) {
				setImg(ClaseGuardarImg.getIntance().getImg());	
			}
		}
	}

}
