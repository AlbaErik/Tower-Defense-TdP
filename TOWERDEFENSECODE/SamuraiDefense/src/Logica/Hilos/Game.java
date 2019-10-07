package Logica.Hilos;

import Logica.Juego.Juego;

public class Game extends Thread{

	private Juego juego;
	private Control control;
	
	public Game(Juego g) {
		juego = g;
		g.crearNivel();
		control = new Control(juego.getMapa());
	}
	
	public void run() {
		juego.inicializarHorda();		
		int c = 0;

		while(true) {
			try {
				if(c % 120 == 0) { 		//Da tiempo entre entidades para agregarlas al mapa
					juego.agregarAtacante();
					c = 0;
				}
				juego.moverAtacantes();
				control.chequearColision();
				c++;
				sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
