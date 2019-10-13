package Logica.Inteligencia;

import Logica.Entidades.Municiones.Municion;

public class InteligenciaMunicionDef extends Inteligencia{
	
	public InteligenciaMunicionDef(Municion e) {
		entidad = e;
	}

	@Override
	public void mover() {
		
		if(entidad.getPos().getX() < 990) {
			double x = entidad.getPos().getX() + ( (Municion)entidad).getVel();
			int y =  (int) entidad.getPos().getY();
			entidad.cambiarPosLogica(x, y);
			System.out.println("Me movi a las pos: (" + entidad.getPos().getX() + ";"+ entidad.getPos().getY() + ")");
		}
	}

	@Override
	public void atacarIA() {
		// TODO Auto-generated method stub
		
	}

}
