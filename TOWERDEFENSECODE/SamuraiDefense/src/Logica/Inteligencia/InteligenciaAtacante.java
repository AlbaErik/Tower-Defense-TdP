package Logica.Inteligencia;

import Logica.Entidades.Atacantes.Atacante;

public class InteligenciaAtacante extends Inteligencia {

	private Atacante atacante;
	public InteligenciaAtacante(Atacante e) {
		atacante = e;
	}

	public void mover() {

		if(atacante.estoyLento()) {
			atacante.incrementarContador();

			int cuenta = atacante.getContador();
			if(cuenta == 5) {
				atacante.devolverVelocidad();
				atacante.resetContador();
			}
		}
		double x = ((int) atacante.getPos().getX()) - atacante.getVelocidadMov();
		int y = (int) atacante.getPos().getY();
		if (x > -10) {
			atacante.cambiarPosLogica(x, y);
			
			if ( atacante.getEscudo() != null) 
				atacante.getEscudo().actualizarPos(x - 10, y);
		}
	}
}