package GUI.Paneles.ObjetosPaneles;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import GUI.ClaseGuardarImg;

public class LabelParaTienda extends JLabel {
	 
	protected MouseEvent eventoTemp=null;
	protected ImageIcon ima;
	
	public LabelParaTienda(ImageIcon img){
		ima=img;
		this.setIcon(img);
		this.addMouseListener(new EventoMouseLabel());    
	}
	
	public void setEventoNull() {
		eventoTemp=null;
	}
	
private class EventoMouseLabel extends MouseAdapter{
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("Es un label");
		ClaseGuardarImg.getIntance().setImg(ima);
	}
	

}
}
