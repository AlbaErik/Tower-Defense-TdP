package GUI;


import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelConFondo extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private Image Background;
	
	public PanelConFondo() {
	     preInit();
	     initcomponent();
	}

	private void initcomponent() {

	}

	private void preInit() {
		Background=new ImageIcon("Sprites/Acantilado.gif").getImage();
	}
	
	
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(Background,0,0,this.getWidth(),this.getHeight(),this);
		
	}
	

}
