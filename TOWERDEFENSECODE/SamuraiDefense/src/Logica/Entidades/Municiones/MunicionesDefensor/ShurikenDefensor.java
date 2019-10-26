package Logica.Entidades.Municiones.MunicionesDefensor;

import Logica.Colisionadores.Colisionador;
import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Inteligencia.InteligenciaMunicionDef;
import Logica.Mapa.Mapa;

public class ShurikenDefensor extends Municion {

	public ShurikenDefensor(int x, int y, Mapa m) {
		super(x, y, m);
		intel = new InteligenciaMunicionDef(this);
		velocidad = 2;
		daño = 10;
	}

	@Override
	public void chocar(Colisionador e) {

	}


	@Override
	public void ejecutarEstado() {
		estado.ejecutar();		
	}

	@Override
	public int getDaño() {
		// TODO Auto-generated method stub
		return daño;
	}

}
