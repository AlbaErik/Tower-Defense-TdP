package Logica.Tienda;

import GUI.Paneles.PanelTienda;
import Logica.Juego.Juego;

public class Tienda{
	private PanelTienda tienda;
	private Juego juego;
	
	public Tienda(Juego j) {
		juego=j;
		tienda=new PanelTienda(this);
	}
	
	public PanelTienda getPanelTienda() {
		return tienda;
	}
	public Juego getJuego() {
		return juego;
	}
	


}
