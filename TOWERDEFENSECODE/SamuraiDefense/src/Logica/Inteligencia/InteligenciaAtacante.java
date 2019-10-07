package Logica.Inteligencia;

import Logica.Entidades.Atacantes.Atacante;

public class InteligenciaAtacante extends Inteligencia {

	public InteligenciaAtacante(Atacante e) {
		entidad = e;
	}

	public void mover() {
		if (entidad.mePuedoMover()) {
			int x = ((int) entidad.getPos().getX()) -1;
			int y = (int) entidad.getPos().getY();
			if (x > 0) {
				entidad.cambiarPosLogica(x, y);
			}
		}

	}

}
