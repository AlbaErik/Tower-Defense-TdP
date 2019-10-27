package Logica.Hilos;

import Logica.Juego.Juego;

public class Game extends Thread{

	private Juego juego;
	private Control control;
	
	public Game(Juego g) {
		juego = g;
		juego.crearNivel();
		control = new Control(juego.getMapa());
	}
	
	public void run() {
		juego.inicializarHorda();
		juego.generarObstaculos();
		int vueltas = 0;

		while(true) {
			try {
				if(vueltas % 120 == 0) { 		//Da tiempo entre entidades para agregarlas al mapa
					juego.agregarEntidades();
					if(juego.nivelTerminado()) {
						juego.setSigNivel();
						System.out.println("GAME: Se seteo el siguiente nivel");
					}
					vueltas = 0;	
				}
								
				juego.accionarEstados();
				control.chequearColision();
				
				vueltas++;
				sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
