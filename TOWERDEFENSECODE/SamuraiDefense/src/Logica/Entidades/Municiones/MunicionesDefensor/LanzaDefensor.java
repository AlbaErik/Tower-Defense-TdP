package Logica.Entidades.Municiones.MunicionesDefensor;

import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Inteligencia.InteligenciaMunicionDef;
import Logica.Mapa.Mapa;

public class LanzaDefensor extends Municion {

	public LanzaDefensor(int x, int y, Mapa m) {
		super(x, y, m);
		intel = new InteligenciaMunicionDef(this);
		velocidad = 2;
		da�o = 15;
	}

	@Override
	public void chocar(Entidad e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();		
	}

	@Override
	public int getDa�o() {
		// TODO Auto-generated method stub
		return da�o;
	}
	
}
