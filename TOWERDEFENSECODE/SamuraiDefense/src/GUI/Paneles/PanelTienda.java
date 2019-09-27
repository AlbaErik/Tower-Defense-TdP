package GUI.Paneles;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	private String palabras[]= {"NinjaElite","EspadachinElite","ArqueroElite","LanceroElite","EmperadorReal","SamuraiElite"};
	private JLabel fondo;

	
	public PanelTienda(Tienda t){
		tienda=t;
		juego=t.getJuego();
		int ancho=juego.getPanelJuego().getAncho();
		int alto=juego.getPanelJuego().getAlto();
		this.setLayout(null);
		this.setBounds(0,50,ancho-1000, alto-50); //El 50 es debido a la altura del PanelStats
		
		crearBotones();
		fondo=new JLabel();
		fondo.setIcon(new ImageIcon("Sprites/Fondos/FondoPanelTienda.png"));
		fondo.setBounds(0,0, ancho-1000, alto-50);
		this.add(fondo);	
	}
	
	public void crearBotones() {
		colocables=new JButton[palabras.length];
		OyenteB oyente=new OyenteB();
		for(int i=0;i<palabras.length;i++) {
			crearBoton(i,oyente);
		}
		acomodarBotones();
		
	}
	
	private void crearBoton(int i,OyenteB oyente) {
		colocables[i]=new JButton();
		colocables[i].setBorder(null);
		colocables[i].setBorderPainted(false);
		colocables[i].setContentAreaFilled(false);
		colocables[i].setActionCommand(palabras[i]);
		colocables[i].setIcon(new ImageIcon("Sprites/Botones/Boton"+palabras[i]+".png"));
		colocables[i].setRolloverIcon(new ImageIcon("Sprites/Botones/Boton"+palabras[i]+"Entered.png"));
		colocables[i].setFocusable(false);
		colocables[i].addActionListener(oyente);
		this.add(colocables[i]);
	}
	
	private void acomodarBotones() {
		int j=0;
		int x=0;
		int y=0;
		int medida=70;
		int cont=0;
		while(j<2) {
			x=20*(cont+1)+70*cont;
			y=20;
			colocables[j].setBounds(x, y, medida, medida);
			j++;
			cont++;
		}
		cont=0;
		while(j<4) {
			x=20*(cont+1)+70*cont;
			y=110;
			colocables[j].setBounds(x, y, medida, medida);
			j++;
			cont++;
		}
		cont=0;
		while(j<6) {
			x=20*(cont+1)+70*cont;
			y=200;
			colocables[j].setBounds(x, y, medida, medida);
			j++;
			cont++;
		}
	}
	
	public Tienda getTienda() {
		return tienda;
	}
	
 private class OyenteB implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand();
		switch(s) {
		case("NinjaElite"):{
			System.out.println("Pase por el boton Ninja");
			break;
		}
		case("EspadachinElite"):{
			tienda.setPersonajeActual(tienda.getFabrica().crearEspadachinElite(juego.getNivel().getMapa()));
			System.out.println("Pase por el boton Espadachin");
			break;
		}
		case("ArqueroElite"):{
			System.out.println("Pase por el boton Arquero");
			break;
		}
		case("LanceroElite"):{
			System.out.println("Pase por el boton Lancero");
			break;
		}
		case("EmperadorReal"):{
			System.out.println("Pase por el boton Emperador");
			break;
		}
		case("SamuraiElite"):{
			System.out.println("Pase por el boton Samurai");
			break;
		}
		
		
		
		
		}
		
	}
	 
 }


}
