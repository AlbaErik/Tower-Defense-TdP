package Logica.Inteligencia;

import Logica.Entidades.Atacantes.Atacante;

public class InteligenciaAtacanteLento extends InteligenciaAtacante {

	public InteligenciaAtacanteLento(Atacante e) {
		super(e);
	}

	@Override
	public void mover() {
		double x = atacante.getPos().getX() - atacante.getVelocidadMov() / 2;
		int y = (int) atacante.getPos().getY();
		if (x > -10) {
			atacante.cambiarPosLogica(x, y);

			if (atacante.getEscudo() != null)
				atacante.getEscudo().actualizarPos(x - 10, y);
		}
		
		atacante.incrementarContadorLentitud();

		int cuenta = atacante.getContadorLentitud();
		if (cuenta == 5) {
			atacante.devolverVelocidad();
			atacante.resetContadorLentitud();
		}
		
	}

}
