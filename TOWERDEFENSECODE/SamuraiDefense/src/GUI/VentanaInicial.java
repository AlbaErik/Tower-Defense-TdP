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
import javax.swing.border.EmptyBorder;

import GUI.Paneles.PanelTienda;
import GUI.Paneles.PanelInicio;
import GUI.Paneles.PanelJuego;
import GUI.Paneles.PanelStats;

public class VentanaInicial extends JFrame {
	private static final long serialVersionUID = 1L;
	protected static final int AnchoVentana = 1200, AltoVentana = 700;// Hay que dejarlo en 700 porque la imagen es de
																		// ese tamaño
	protected PanelTienda panelInf;
	private PanelInicio inicio;
	// private PanelPausa pausa;
	private PanelJuego Gui;
	protected JPanel PanelPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicial frame = new VentanaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaInicial() {
		super("Samurai Defense");

		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, AnchoVentana, AltoVentana);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setLayout(null);
		setContentPane(PanelPrincipal);

		inicio = new PanelInicio(this);
		PanelPrincipal.add(inicio);

	}

	public int getAncho() {
		return AnchoVentana;
	}

	public int getAlto() {
		return AltoVentana;
	}

	public PanelJuego getPanelJuego() {
		return Gui;
	}

	public PanelInicio getInicio() {
		return inicio;
	}

	public void cambiarJuego(PanelJuego g) {
		Gui = g;

	}

	public void cambiarPanel(JPanel actual, JPanel nuevo) {
		PanelPrincipal.remove(actual);
		PanelPrincipal.add(nuevo);
		PanelPrincipal.repaint();

	}

}
