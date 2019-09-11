package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelConFondoTienda extends JPanel {
	private static final long serialVersionUID = 1L;
	private Image Background;
	private LabelParaTienda Espadachin;
	private JButton Esp;
	
	public PanelConFondoTienda() {
		setBackground();
		setPlayers();
	}


	private void setPlayers() {	
		Espadachin=new LabelParaTienda(new ImageIcon("Sprites/Espadachin.png"));
		this.add(Espadachin);
	}


	private void setBackground() {
		Background=new ImageIcon("Sprites/FondoTienda.jpg").getImage();	
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(Background,0,0,this.getWidth(),this.getHeight(),this);
		
	}

}
