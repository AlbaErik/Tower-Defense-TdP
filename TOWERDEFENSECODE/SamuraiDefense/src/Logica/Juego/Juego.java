package Logica.Juego;

import GUI.Paneles.PanelJuego;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Hilos.HiloMovimientoEnemigo;
import Logica.Mapa.Niveles.Nivel;
import Logica.Mapa.Niveles.Nivel1;
import Logica.Tienda.Tienda;

public class Juego{
	private PanelJuego Gui;
	//private int tiempo;
	private Tienda tienda;
	private Nivel nivel;
	private HiloMovimientoEnemigo hiloEnem;
	
	/**
	 * Se inicializa el juego en el Nivel 1
	 * @param g
	 */
	public Juego(PanelJuego g) {
		Gui=g;
		tienda=new Tienda(this);
		nivel=new Nivel1(this);
		//tiempo=0;
		
	}
	
	/**public void aumentarTiempo() {
		tiempo++;
		Gui.getPanelStats().actualizarTiempo();
	}**/

	public void iniciar() {
		hiloEnem=new HiloMovimientoEnemigo();//Crea el hilo
		hiloEnem.agregarEnemigo((Atacante)Gui.getPanelMapa().getEntidadMapa());	//Agrega la entidad al hilo
		hiloEnem.start();//Inicia el hilo del movimiento de enemigos
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
	
	public Nivel getNivel() {
		return nivel;
	}
	

}
