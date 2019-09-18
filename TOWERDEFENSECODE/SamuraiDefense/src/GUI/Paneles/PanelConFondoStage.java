package GUI.Paneles;


import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelConFondoStage extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private Image Background;
	
	public PanelConFondoStage() {
	     setBackground();
	}


	private void setBackground() {
		Background=new ImageIcon("Sprites/Cascada.gif").getImage();
	}
	
	
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(Background,0,0,this.getWidth(),this.getHeight(),this);
		
	}
	

}
