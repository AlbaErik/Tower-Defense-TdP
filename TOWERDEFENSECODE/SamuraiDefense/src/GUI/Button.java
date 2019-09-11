package GUI;

import javax.swing.JButton;

public class Button extends JButton{
	private static final long serialVersionUID = 1L;
	private float opacity;
	
	public Button() {
		
	}
	public void setOpacity(float opa) {
		opacity=opa;
		this.repaint();
	}

}
