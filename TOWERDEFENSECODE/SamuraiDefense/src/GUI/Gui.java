package GUI;
import Logica.Juego;
import Mapa.Mapa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Gui extends JFrame {
	private JPanel panel;
	private Juego juego;
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
	
	public Gui() {
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 2000, 2000);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		mapa = new Mapa(1000,1000);
		this.add(mapa.getMapaGrafico().getGrafica());
		getContentPane().add(mapa.getMapaGrafico().getGrafica());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1, 1, 4500, 5500);
		
	}

}
