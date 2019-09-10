package Testers;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import GUI.Gui;
import Logica.Juego;
import Mapa.Mapa;

public class TesterGUI extends JFrame{

		private JPanel panel;
		private Mapa mapa;
		
		public static void main(String[] a) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Gui frame=new Gui();
						frame.setVisible(true);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}			
			});
				
		}
		
		public TesterGUI() {
			getContentPane().setLayout(null);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(0, 0, 2000, 2000);
			panel = new JPanel();
			panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(panel);
			panel.setLayout(null);
			
			mapa = new Mapa(1000,1000);
			getContentPane().add(mapa.getMapaGrafico().getGrafica());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(1, 1, 5000, 5000);
			
		}


	

}
