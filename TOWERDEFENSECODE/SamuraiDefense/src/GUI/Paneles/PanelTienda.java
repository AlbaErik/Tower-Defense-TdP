package GUI.Paneles;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import GUI.Paneles.Botones.BotonDefensor;
import GUI.Paneles.Botones.BotonEliminar;
import GUI.Paneles.Botones.BotonArqueroElite;
import GUI.Paneles.Botones.BotonBarricada;
import GUI.Paneles.Botones.BotonBomba;
import GUI.Paneles.Botones.BotonCampoProteccion;
import GUI.Paneles.Botones.BotonSacerdoteElite;
import GUI.Paneles.Botones.BotonEspadachinElite;
import GUI.Paneles.Botones.BotonLanceroElite;
import GUI.Paneles.Botones.BotonNinjaElite;
import GUI.Paneles.Botones.BotonPocionDeFuerza;
import GUI.Paneles.Botones.BotonPremio;
import GUI.Paneles.Botones.BotonSamuraiElite;
import Logica.Juego.Juego;
import Logica.Tienda.Tienda;

public class PanelTienda extends JPanel {
	private static final long serialVersionUID = 1L;
	private Tienda tienda;
	private Juego juego;
	private BotonDefensor colocables[];
	private BotonPremio colocablesP[];
	private BotonEliminar Eliminar;
	private JLabel fondo;

	public PanelTienda(Tienda t) {
		tienda = t;
		juego = t.getJuego();
		int ancho = juego.getPanelJuego().getAncho();
		int alto = juego.getPanelJuego().getAlto();
		this.setLayout(null);
		this.setBounds(0, 50, ancho - 1000, alto - 50); // El 50 es debido a la altura del PanelStats

		crearBotones();

		fondo = new JLabel();
		fondo.setIcon(new ImageIcon("Sprites/Fondos/FondoPanelTienda.png"));
		fondo.setBounds(0, 0, ancho - 1000, alto - 50);
		this.add(fondo);
	}

	public void revisarStockPremios() {
		for (BotonPremio b : colocablesP)
			if (tienda.hayPremio(b.getClave()))
				b.setEnabled(true);
	}

	private void crearBotones() {
		crearBotonesDefensores();
		crearBotonesPremios();
		crearBotonEliminar();

	}

	private void crearBotonesDefensores() {
		colocables = new BotonDefensor[6];

		colocables[0] = new BotonNinjaElite(this.getTienda());
		colocables[0].setBorder(null);
		colocables[0].setBorderPainted(false);
		colocables[0].setContentAreaFilled(false);
		colocables[0].setIcon(new ImageIcon("Sprites/Botones/BotonNinjaElite.png"));
		colocables[0].setRolloverIcon(new ImageIcon("Sprites/Botones/BotonNinjaEliteEntered.png"));
		colocables[0].setFocusable(false);
		this.add(colocables[0]);

		colocables[1] = new BotonEspadachinElite(this.getTienda());
		colocables[1].setBorder(null);
		colocables[1].setBorderPainted(false);
		colocables[1].setContentAreaFilled(false);
		colocables[1].setIcon(new ImageIcon("Sprites/Botones/BotonEspadachinElite.png"));
		colocables[1].setRolloverIcon(new ImageIcon("Sprites/Botones/BotonEspadachinEliteEntered.png"));
		colocables[1].setFocusable(false);
		this.add(colocables[1]);

		colocables[2] = new BotonArqueroElite(this.getTienda());
		colocables[2].setBorder(null);
		colocables[2].setBorderPainted(false);
		colocables[2].setContentAreaFilled(false);
		colocables[2].setIcon(new ImageIcon("Sprites/Botones/BotonArqueroElite.png"));
		colocables[2].setRolloverIcon(new ImageIcon("Sprites/Botones/BotonArqueroEliteEntered.png"));
		colocables[2].setFocusable(false);
		this.add(colocables[2]);

		colocables[3] = new BotonLanceroElite(this.getTienda());
		colocables[3].setBorder(null);
		colocables[3].setBorderPainted(false);
		colocables[3].setContentAreaFilled(false);
		colocables[3].setIcon(new ImageIcon("Sprites/Botones/BotonLanceroElite.png"));
		colocables[3].setRolloverIcon(new ImageIcon("Sprites/Botones/BotonLanceroEliteEntered.png"));
		colocables[3].setFocusable(false);
		this.add(colocables[3]);

		colocables[4] = new BotonSacerdoteElite(this.getTienda());
		colocables[4].setBorder(null);
		colocables[4].setBorderPainted(false);
		colocables[4].setContentAreaFilled(false);
		colocables[4].setIcon(new ImageIcon("Sprites/Botones/BotonSacerdoteElite.png"));
		colocables[4].setRolloverIcon(new ImageIcon("Sprites/Botones/BotonSacerdoteEliteEntered.png"));
		colocables[4].setFocusable(false);
		this.add(colocables[4]);

		colocables[5] = new BotonSamuraiElite(this.getTienda());
		colocables[5].setBorder(null);
		colocables[5].setBorderPainted(false);
		colocables[5].setContentAreaFilled(false);
		colocables[5].setIcon(new ImageIcon("Sprites/Botones/BotonSamuraiElite.png"));
		colocables[5].setRolloverIcon(new ImageIcon("Sprites/Botones/BotonSamuraiEliteEntered.png"));
		colocables[5].setFocusable(false);
		this.add(colocables[5]);

		acomodarBotonesDefensores();

	}

	private void acomodarBotonesDefensores() {
		int j = 0;
		int x = 0;
		int y = 0;
		int medida = 70;
		int cont = 0;
		while (j < 2) {
			x = 20 * (cont + 1) + 70 * cont;
			y = 20;
			colocables[j].setBounds(x, y, medida, medida);
			j++;
			cont++;
		}
		cont = 0;
		while (j < 4) {
			x = 20 * (cont + 1) + 70 * cont;
			y = 110;
			colocables[j].setBounds(x, y, medida, medida);
			j++;
			cont++;
		}
		cont = 0;
		while (j < 6) {
			x = 20 * (cont + 1) + 70 * cont;
			y = 200;
			colocables[j].setBounds(x, y, medida, medida);
			j++;
			cont++;
		}
	}

	private void crearBotonEliminar() {
		Eliminar = new BotonEliminar(this.getTienda());
		Eliminar.setBorder(null);
		Eliminar.setBorderPainted(false);
		Eliminar.setContentAreaFilled(false);
		Eliminar.setIcon(new ImageIcon("Sprites/Botones/BotonEliminar.png"));
		Eliminar.setRolloverIcon(new ImageIcon("Sprites/Botones/BotonEliminarEntered.png"));
		Eliminar.setFocusable(false);

		Eliminar.setBounds(65, 500, 70, 70);
		this.add(Eliminar);
	}

	private void crearBotonesPremios() {
		colocablesP = new BotonPremio[4];

		colocablesP[0] = new BotonCampoProteccion(this.getTienda());
		colocablesP[0].setBorder(null);
		colocablesP[0].setBorderPainted(false);
		colocablesP[0].setContentAreaFilled(false);
		colocablesP[0].setIcon(new ImageIcon("Sprites/Botones/BotonCampoDeFuerza.png"));
		colocablesP[0].setRolloverIcon(new ImageIcon("Sprites/Botones/BotonCampoDeFuerzaEntered.png"));
		colocablesP[0].setDisabledIcon(new ImageIcon("Sprites/Botones/BotonCampoDeFuerzaDisable.png"));
		colocablesP[0].setFocusable(false);
		this.add(colocablesP[0]);

		colocablesP[1] = new BotonPocionDeFuerza(this.getTienda());
		colocablesP[1].setBorder(null);
		colocablesP[1].setBorderPainted(false);
		colocablesP[1].setContentAreaFilled(false);
		colocablesP[1].setIcon(new ImageIcon("Sprites/Botones/BotonPocionFuerza.png"));
		colocablesP[1].setRolloverIcon(new ImageIcon("Sprites/Botones/BotonPocionFuerzaEntered.png"));
		colocablesP[1].setDisabledIcon(new ImageIcon("Sprites/Botones/BotonPocionFuerzaDisable.png"));
		colocablesP[1].setFocusable(false);
		//colocablesP[1].setEnabled(false);
		this.add(colocablesP[1]);

		colocablesP[2] = new BotonBarricada(this.getTienda());
		colocablesP[2].setBorder(null);
		colocablesP[2].setBorderPainted(false);
		colocablesP[2].setContentAreaFilled(false);
		colocablesP[2].setIcon(new ImageIcon("Sprites/Botones/BotonBarricada.png"));
		colocablesP[2].setRolloverIcon(new ImageIcon("Sprites/Botones/BotonBarricadaEntered.png"));
		colocablesP[2].setDisabledIcon(new ImageIcon("Sprites/Botones/BotonBarricadaDisable.png"));
		colocablesP[2].setFocusable(false);
		this.add(colocablesP[2]);

		colocablesP[3] = new BotonBomba(this.getTienda());
		colocablesP[3].setBorder(null);
		colocablesP[3].setBorderPainted(false);
		colocablesP[3].setContentAreaFilled(false);
		colocablesP[3].setIcon(new ImageIcon("Sprites/Botones/BotonBomba.png"));
		colocablesP[3].setRolloverIcon(new ImageIcon("Sprites/Botones/BotonBombaEntered.png"));
		colocablesP[3].setDisabledIcon(new ImageIcon("Sprites/Botones/BotonBombaDisable.png"));
		colocablesP[3].setFocusable(false);
		this.add(colocablesP[3]);

		acomodarBotonesPremios();
	}

	private void acomodarBotonesPremios() {
		int j = 0;
		int x = 0;
		int y = 0;
		int medida = 70;
		int cont = 0;
		while (j < 2) {
			x = 20 * (cont + 1) + 70 * cont;
			y = 310;
			colocablesP[j].setBounds(x, y, medida, medida);
			j++;
			cont++;
		}
		cont = 0;
		while (j < 4) {
			x = 20 * (cont + 1) + 70 * cont;
			y = 400;
			colocablesP[j].setBounds(x, y, medida, medida);
			j++;
			cont++;
		}

	}

	public Tienda getTienda() {
		return tienda;
	}

}
