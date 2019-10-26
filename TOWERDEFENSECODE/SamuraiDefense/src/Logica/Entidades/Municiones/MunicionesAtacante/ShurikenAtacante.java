package Logica.Entidades.Municiones.MunicionesAtacante;

import Logica.Colisionadores.Colisionador;
import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Inteligencia.InteligenciaMunicionAtaq;
import Logica.Mapa.Mapa;

public class ShurikenAtacante extends Municion {

	public ShurikenAtacante(int x, int y, Mapa m) {
		super(x, y, m);
		intel = new InteligenciaMunicionAtaq(this);
		velocidad = 2;
		daño = 15;
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
