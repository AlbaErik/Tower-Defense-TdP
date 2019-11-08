package Logica.Inteligencia;

import Logica.Entidades.Municiones.Municion;

public class InteligenciaMunicionDef extends Inteligencia{
	
	public InteligenciaMunicionDef(Municion e) {
		entidad = e;
	}

	@Override
	public void mover() {

		if(entidad.getPos().getX() < 980) {
			double x = entidad.getPos().getX() + ( (Municion)entidad).getVel();
			int y =  (int) entidad.getPos().getY();
			entidad.cambiarPosLogica(x, y);
		}else {
			entidad.morir();
		}
	}

}
