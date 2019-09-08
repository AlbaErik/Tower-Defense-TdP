package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Gui extends JFrame {
	private JPanel Panel;
	
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
		setBounds(100, 100, 320, 320);
		Panel = new JPanel();
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Panel);
		Panel.setLayout(null);
		
	}

}
