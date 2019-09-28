package GUI.Paneles;

import javax.swing.JPanel;

import GUI.VentanaInicial;
import Grafica.Mapa.PanelMapa;
import Logica.Juego.Juego;

public class PanelJuego extends JPanel {
	private static final long serialVersionUID = 1L;
	private static int AnchoVentana,AltoVentana;
	private VentanaInicial vInicial;
	private Juego juego;
	private PanelStats panelStats;
	private PanelMapa mapag;
	
	
	public PanelJuego(VentanaInicial v) {
		vInicial=v;
		juego=null;
		AnchoVentana=v.getAncho();
		AltoVentana=v.getAlto();
		this.setLayout(null);
		this.setBounds(0, 0, AnchoVentana, AltoVentana);		
	}
	
	private void cambiar(JPanel panel) {
		vInicial.cambiarPanel(this, panel);
	}
	
	public void ejecutar() {
		if(juego==null) {
			juego=new Juego(this);
			panelStats=new PanelStats(AnchoVentana,AltoVentana,this);
			this.add(panelStats);
			this.add(juego.getTienda().getPanelTienda());
			mapag=juego.getMapa().getPanelMapa();
			this.add(mapag);
			
			juego.iniciar();
		}//else {
			//juego.reanudar();
		//}
		
	}
	
/**
	public void terminarPartidaAnterior() {
		
	}

	**/
	
	public Juego getJuego() {
		return juego;
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
	

}
