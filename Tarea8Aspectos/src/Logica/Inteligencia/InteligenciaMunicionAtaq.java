package Logica.Inteligencia;

import Logica.Entidades.Municiones.Municion;

public class InteligenciaMunicionAtaq extends Inteligencia {
	private Municion mun;

	public InteligenciaMunicionAtaq(Municion e) {
		mun = e;
	}

	@Override
	public void mover() {
		if (mun.getPos().getX() > -50) {
			double x = mun.getPos().getX() - mun.getVel();
			int y = (int) mun.getPos().getY();
			mun.cambiarPosLogica(x, y);
		} else {
			mun.morir();
		}
	}
}
