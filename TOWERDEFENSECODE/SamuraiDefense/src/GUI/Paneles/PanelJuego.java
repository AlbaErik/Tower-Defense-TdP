package GUI.Paneles;

import javax.swing.JPanel;

import GUI.VentanaInicial;
import Grafica.Mapa.PanelMapa;
import Logica.Hilos.Game;
import Logica.Juego.Juego;

public class PanelJuego extends JPanel {
	private static final long serialVersionUID = 1L;
	private static int AnchoVentana, AltoVentana;
	private VentanaInicial vInicial;
	private Juego juego;
	private PanelStats panelStats;
	private PanelMapa mapag;
	private Game game;

	public PanelJuego(VentanaInicial v) {
		vInicial = v;
		AnchoVentana = v.getAncho();
		AltoVentana = v.getAlto();
		this.setLayout(null);
		this.setBounds(0, 0, AnchoVentana, AltoVentana);
	}
	
	public void actualizarOroStats(int o) {
		panelStats.actualizarOro(o);
	}
	
	public void cambiarNivel() {
		panelStats.cambiarNivel();
	}

	public void ejecutar() {
		if (juego == null) {
			
			panelStats = new PanelStats(AnchoVentana, AltoVentana, this);
			juego = new Juego(this);	
			this.add(panelStats);
			this.add(juego.getPanelTienda());
			mapag = juego.getPanelMapa();
			this.add(mapag);
			
			game = new Game(juego);	

			game.start();
			
		} 

	}
	
	public Game getgame() {
		return game;
	}

	public VentanaInicial getVentanaInicial() {
		return vInicial;
	}

	public PanelStats getPanelStats() {
		return panelStats;
	}

	public int getAncho() {
		return AnchoVentana;
	}

	public int getAlto() {
		return AltoVentana;
	}

	public PanelMapa getPanelMapa() {
		return mapag;
	}
	
	public void ganar() {
		vInicial.cambiarPanel(this, new PanelGanar(vInicial));
	}
	
	public void perder() {
		vInicial.cambiarPanel(this, new PanelPerder(vInicial));
	}
	

}
