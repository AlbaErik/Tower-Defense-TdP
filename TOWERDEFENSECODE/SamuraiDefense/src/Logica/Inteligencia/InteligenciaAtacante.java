package Logica.Inteligencia;

import Logica.Entidades.Atacantes.Atacante;

public class InteligenciaAtacante extends Inteligencia {

	public InteligenciaAtacante(Atacante e) {
		entidad = e;
	}

	public void mover() {

		double x = ((int) entidad.getPos().getX()) - ((Atacante) entidad).getVelocidadMov();
		int y = (int) entidad.getPos().getY();
		if (x > -10) {
			entidad.cambiarPosLogica(x, y);
			if (((Atacante) entidad).getEscudo() != null) {
				((Atacante) entidad).getEscudo().actualizarPos(x, y);
			}
		}
		
		
	}

}
