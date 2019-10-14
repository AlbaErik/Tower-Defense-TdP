package Logica.Hilos;

import Logica.Entidades.Municiones.Municion;
import Logica.Entidades.Municiones.MunicionesAtacante.FlechaAtacante;
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
		int vueltas = 0;

		while(true) {
			try {
				if(vueltas % 120 == 0) { 		//Da tiempo entre entidades para agregarlas al mapa
					juego.agregarAtacante();
					vueltas = 0;
				}
				
				/*
				 * moverAtacantes y atacarAtacantes deben ser remplazados por "ejecutarEstado() donde se delega la accion a cada estado perteneciente a la entidad"
				 */
				//juego.moverAtacantes();
				//juego.atacarAtacantes();
				
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
