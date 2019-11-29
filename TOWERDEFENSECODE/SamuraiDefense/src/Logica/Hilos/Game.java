package Logica.Hilos;


import Logica.Juego.Juego;

public class Game extends Thread {

	private Juego juego;
	private Control control;
	private boolean ejecutar;

	public Game(Juego g) {
		juego = g;
		juego.crearNivel();
		control = new Control(juego.getMapa());
		ejecutar = true;
	}
	
	public Control getControl() {
		return control;
	}

	public void run() {
		juego.inicializarHorda();
		juego.generarObstaculos();
		
		int vueltas = 0;

		while (ejecutar) {
			try {
				if (vueltas % 120 == 0) { // Da tiempo entre entidades para agregarlas al mapa
					juego.agregarEntidades();
					if (juego.hordaVacia())
						juego.cargarSigHorda();
					vueltas = 0;
				}

				juego.accionarEstados();
				control.chequearColision();

				vueltas++;
				sleep(20);
				if (!juego.haySiguienteNivel() && !juego.haySigHorda() && juego.enemigosMuertos()) {
					System.out.println("GANO EL JUGADOR 	WIN - WIN - WIN");
					ejecutar = false;
				}
				if (juego.controlPerder()) {
					System.out.println("PERDIO EL JUGADOR");
					ejecutar = false;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
