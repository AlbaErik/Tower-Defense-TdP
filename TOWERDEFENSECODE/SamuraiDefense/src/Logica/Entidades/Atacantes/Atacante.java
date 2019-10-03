package Logica.Entidades.Atacantes;

import Logica.Entidades.Personaje;
import Logica.Mapa.Mapa;

public abstract class Atacante extends Personaje {
	protected boolean sepuedemover;
	protected int movementSpeed;

	public Atacante(int x, int y, Mapa m) {
		super(x, y, m);
		sepuedemover = true;
	}

	public void mover() {
		int x = (int) miCelda.getX();
		if ((x - 1 >= 0) && sepuedemover) {
			int aux = (x - 1) * miCelda.getAncho();
			grafico.cambiarPos(grafico.getPosGrafica().x - movementSpeed, grafico.getPosGrafica().y);

		}
	}

}
