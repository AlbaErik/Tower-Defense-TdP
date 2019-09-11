package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Mapa.Celda;
import Mapa.Mapa;

public class GUI extends JFrame{
	PanelConFondo PanelSup;
	JPanel PanelInf,Grilla;
	Mapa map;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						GUI frame = new GUI();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	
	public GUI() {
		
		this.setLayout(new BorderLayout());
		this.setSize(1000,500);
		this.setLocationRelativeTo(null);//Setea la app en el centro de la pantalla(hay que colocarlo despues del setsize
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		PanelSup=new PanelConFondo();
		PanelInf=new JPanel();
		
		
		PanelInf.setBackground(Color.red);
		PanelInf.setSize(1000, 200);
		
		/**Grilla.setLayout(new FlowLayout());
		for(int i=0;i<map.getAncho();i++) {
			for(int j=0;j<map.getLargo();j++) {
				Grilla[i][j]=new Celda();
			}
		}**/
		
		this.getContentPane().add(PanelSup,BorderLayout.CENTER);
		this.getContentPane().add(PanelInf,BorderLayout.SOUTH);
		
		
	}
	     
		

}