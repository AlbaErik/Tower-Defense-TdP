package Logica.Inteligencia;

import Logica.Entidades.Atacantes.Atacante;

public class InteligenciaAtacante extends Inteligencia {

	protected Atacante atacante;

	public InteligenciaAtacante(Atacante e) {
		atacante = e;
	}

	public void mover() {
		
		double x = atacante.getPos().getX() - atacante.getVelocidadMov();
		int y = (int) atacante.getPos().getY();
		if (x > -10) {
			atacante.cambiarPosLogica(x, y);

			if (atacante.getEscudo() != null)
				atacante.getEscudo().actualizarPos(x - 10, y);
		}
	}
}