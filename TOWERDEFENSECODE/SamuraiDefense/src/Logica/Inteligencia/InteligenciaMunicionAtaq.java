package Logica.Inteligencia;

import Logica.Entidades.Municiones.Municion;

public class InteligenciaMunicionAtaq extends Inteligencia {

	public InteligenciaMunicionAtaq(Municion e) {
		entidad = e;
	}

	@Override
	public void mover() {
		if (entidad.getPos().getX() > 0) {
			double x = entidad.getPos().getX() - ((Municion) entidad).getVel();
			int y = (int) entidad.getPos().getY();
			entidad.cambiarPosLogica(x, y);
		}else {
			//Matar la flecha
		}
	}

	@Override
	public void atacarIA() {
		// TODO Auto-generated method stub
		
	}

}
