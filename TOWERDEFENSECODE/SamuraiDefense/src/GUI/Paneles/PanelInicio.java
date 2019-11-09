package GUI.Paneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import GUI.VentanaInicial;

public class PanelInicio extends JPanel {
	private static final long serialVersionUID = 1L;
	private JButton botones[];
	private JLabel fondo;
	private String[] palabras = { "Juego", "Salir" };
	private VentanaInicial vInicial;

	public PanelInicio(VentanaInicial v) {
		vInicial = v;
		this.setLayout(null);
		this.setBounds(0, 0, v.getAncho(), v.getAlto());

		fondo = new JLabel(new ImageIcon("Sprites/Fondos/FondoInicio.jpg"));
		fondo.setBounds(0, 0, v.getAncho(), v.getAlto());
		armarBotones();
		this.add(fondo);
	}

	private void armarBotones() {
		botones = new JButton[palabras.length];
		OyenteBotones oyenteB = new OyenteBotones();

		for (int i = 0; i < botones.length; i++) {
			botones[i] = new JButton();
			botones[i].setBorder(null);
			botones[i].setBorderPainted(false);
			botones[i].setContentAreaFilled(false);
			botones[i].setActionCommand(palabras[i]);
			botones[i].setBounds(30, (i + 1) * 50, 250, 50);
			botones[i].addActionListener(oyenteB);
			botones[i].setIcon(new ImageIcon("Sprites/Botones/BotonInicio" + palabras[i] + ".png"));
			botones[i].setRolloverIcon(new ImageIcon("Sprites/Botones/BotonInicio" + palabras[i] + "Entered.png"));
			add(botones[i]);
		}

	}

	private void cambiar(JPanel panel) {
		vInicial.cambiarPanel(this, panel);
	}

	private class OyenteBotones implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String s = e.getActionCommand();
			switch (s) {
			case ("Juego"): {
				PanelJuego g = vInicial.getPanelJuego();
				// if(g!=null) {//Si ya hay un juego guardado lo elimina
				// g.terminarPartidaAnterior();
				// }
				g = new PanelJuego(vInicial);// Crea juego nuevo
				g.ejecutar();// Ejecuta el juego
				vInicial.cambiarJuego(g);// El panel inicial tiene ahora al juego nuevo
				cambiar(g);// El panel inicial ahora muestra el juego nuevo
				break;
			}
			case ("Salir"): {
				PanelJuego g = vInicial.getPanelJuego();
				if (g != null) {// Si ya hay un juego guardado lo elimina
					// g.terminarPartidaAnterior();
				}
				vInicial.dispose();// Cierra la aplicacion
			}
			}
		}
	}

}
