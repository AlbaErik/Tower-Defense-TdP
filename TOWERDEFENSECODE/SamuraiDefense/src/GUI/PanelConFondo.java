package GUI;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class PanelConFondo extends JPanel{
	
	private Image img = null;
	private static final long serialVersionUID = 1L;
	
	public PanelConFondo(final Image i) {
		img = i;
	}
	
	public void paintComponent(final Graphics g) {
		super.paintComponent(g);
		if(img != null) {
			g.drawImage(img, 0, 0, null);
		}
	}

}
