package GUI.Paneles;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Logica.Juego.Juego;
import Logica.Tienda.Tienda;

public class PanelTienda extends JPanel {
	private static final long serialVersionUID = 1L;
	private Tienda tienda;
	private Juego juego;
	private JButton colocables[];
	private JButton colocable;
	private String palabra="EspadachinElite";
	private String palabras[]= {"NinjaElite","EspadachinElite","ArqueroElite","LanceroElite","EmperadorReal","SamuraiElite"};
	private JLabel fondo;

	private JButton Esp;
	
	public PanelTienda(Tienda t){
		tienda=t;
		juego=t.getJuego();
		int ancho=juego.getPanelJuego().getAncho();
		int alto=juego.getPanelJuego().getAlto();
		this.setLayout(null);
		this.setBounds(0,50,ancho-1000, alto-50); //El 50 es debido a la altura del PanelStats
		
		crearBotones();
		fondo=new JLabel();
		fondo.setIcon(new ImageIcon("Sprites/FondoPanelTienda.png"));
		fondo.setBounds(0,0, ancho-1000, alto-50);
		this.add(fondo);	
	}
	
	public void crearBotones() {
		colocable=new JButton();
		colocable.setBorder(null);
		colocable.setBorderPainted(false);
		colocable.setContentAreaFilled(false);
		colocable.setIcon(new ImageIcon("Sprites/Boton"+palabra+".png"));
		colocable.setRolloverIcon(new ImageIcon("Sprites/Boton"+palabra+"Entered.png"));
		colocable.setFocusable(false);
		colocable.setBounds(25,25,50,50);
		this.add(colocable);
	}


}
