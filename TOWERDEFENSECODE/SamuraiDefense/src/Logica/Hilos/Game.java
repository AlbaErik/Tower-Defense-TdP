package Logica.Hilos;

import GUI.Paneles.PanelJuego;
import Logica.Juego.Juego;

public class Game extends Thread{

	private Juego juego;
	
	public Game(Juego g) {
		System.out.println("Se creo un nuevo Game");
		juego = g;
		g.crearNivel();
	}
	
	public void run() {
		System.out.println("run()/n juego.iniciar()");
		juego.iniciar();
		while(true) {
			
		}
	}
	
}
