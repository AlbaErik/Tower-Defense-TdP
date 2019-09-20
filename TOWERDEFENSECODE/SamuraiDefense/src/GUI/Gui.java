package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import GUI.Paneles.PanelConFondoStage;
import GUI.Paneles.PanelConFondoTienda;
import GUI.Paneles.ObjetosPaneles.Button;
import Logica.Juego.Juego;
import Logica.Mapa.Mapa;

public class Gui extends JFrame{
	protected PanelConFondoStage panelSup;
	protected PanelConFondoTienda panelInf;
	protected JPanel panelArena;
	protected Juego juego;
	protected Button[][] arena;
	protected GridBagConstraints c;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Gui frame = new Gui();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	
	public Gui() {
		
		this.setLayout(new BorderLayout());
		this.setSize(1000,500);
		this.setLocationRelativeTo(null);//Setea la app en el centro de la pantalla(hay que colocarlo despues del setsize
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);//Hace que la ventana no se pueda agrandar o achicar
		
		panelSup=new PanelConFondoStage();//Creacion PanelSuperior
		panelSup.setLayout(new GridBagLayout());
		panelSup.setPreferredSize(new Dimension(1000,400));
		panelSup.setMinimumSize(new Dimension(1000,400));
		panelSup.setMaximumSize(new Dimension(1000,400));
		
		panelInf=new PanelConFondoTienda();//Creacion PanelInferior
		panelInf.setPreferredSize(new Dimension(1000,100));
		panelInf.setMinimumSize(new Dimension(1000,100));
		panelInf.setMaximumSize(new Dimension(1000,100));
		
		juego=new Juego();
		Mapa mapa=juego.getMapa();
		arena=new Button[mapa.getFilas()][mapa.getColumnas()];//Creo un arreglo de JButton con n filas y m columnas
		panelArena=new JPanel(new GridLayout(mapa.getFilas(),mapa.getColumnas()));//Creo un nuevo panel que tiene n filas y m columnas
		//panelArena.setBackground(new Color(0,0,0,64));
		for(int i=0;i<mapa.getFilas();i++) {//Inicializo los botones del panel arena
			for(int j=0;j<mapa.getColumnas();j++) {
				arena[i][j]=new Button();
				arena[i][j].setVisible(true);
				arena[i][j].setMinimumSize(new Dimension(20,20));
				arena[i][j].setMaximumSize(new Dimension(20,20));
				arena[i][j].setPreferredSize(new Dimension(20,20));
				arena[i][j].setBackground(Color.lightGray);
				arena[i][j].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,Color.BLACK));//Crea el borde de cada boton
				panelArena.add(arena[i][j],new Dimension(i,j));//Agrega el boton creado en panelArena en la posicion i,j
				
			}
		}
		panelArena.setPreferredSize(new Dimension(700,250));
		panelArena.setMinimumSize(new Dimension(700,250));
		panelArena.setMaximumSize(new Dimension(700,250));
		panelArena.setVisible(true);
		panelSup.add(panelArena,c);//Agrega panelArena a panelSup*
		
		this.getContentPane().add(panelSup,BorderLayout.CENTER);
		this.getContentPane().add(panelInf,BorderLayout.SOUTH);
		
		
	}
	     
		

}