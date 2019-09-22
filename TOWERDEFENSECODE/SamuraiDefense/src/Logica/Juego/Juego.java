package Logica.Juego;

import GUI.Paneles.PanelJuego;
import Logica.Mapa.Niveles.Nivel;
import Logica.Tienda.Tienda;

public class Juego{
	private PanelJuego Gui;
	//private int tiempo;
	private Tienda tienda;
	private Nivel nivel;
	
	/**
	 * Se inicializa el juego en el Nivel 1
	 * @param g
	 */
	public Juego(PanelJuego g) {
		Gui=g;
		tienda=new Tienda(this);
		//tiempo=0;
		
	}
	
	/**public void aumentarTiempo() {
		tiempo++;
		Gui.getPanelStats().actualizarTiempo();
	}**/

	public void iniciar() {
		// TODO Auto-generated method stub
		
	}
	public void reanudar() {
		// TODO Auto-generated method stub
		
	}
	
	public Tienda getTienda() {
		return tienda;
	}
	public PanelJuego getPanelJuego() {
		return Gui;
	}
	

}
