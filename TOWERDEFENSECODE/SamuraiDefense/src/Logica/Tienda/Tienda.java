package Logica.Tienda;

import GUI.Paneles.PanelTienda;
import Logica.FabricaDefensores;
import Logica.Entidades.Personaje;
import Logica.Juego.Juego;

public class Tienda{
	private PanelTienda tienda;
	private Juego juego;
	private Personaje personajeActual;
	private FabricaDefensores fabrica;
	
	public Tienda(Juego j) {
		juego=j;
		tienda=new PanelTienda(this);
		fabrica=new FabricaDefensores();
		personajeActual=null;
	}
	
	public PanelTienda getPanelTienda() {
		return tienda;
	}
	public Juego getJuego() {
		return juego;
	}
	
	public void setPersonajeActual(Personaje e) {
		personajeActual=e;
	}
	
	public Personaje getPersonajeActual() {
		Personaje toret=personajeActual;
		personajeActual=null;
		return toret;
	}
	
	public FabricaDefensores getFabrica() {
		return fabrica;
	}
	
	


}
