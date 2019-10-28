package Logica.Entidades.Municiones.MunicionesAtacante;

import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Inteligencia.InteligenciaMunicionAtaq;
import Logica.Mapa.Mapa;

public class LanzaAtacante extends Municion {

	public LanzaAtacante(int x, int y, Mapa m) {
		super(x, y, m);
		intel = new InteligenciaMunicionAtaq(this);
		velocidad = 2;
		da�o = 20;
	}

	@Override
	public void chocar(Colisionador e) {

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

	@Override
	public boolean chocaraDistancia(VisitorDistancia v) {
		return v.serChocado(this);
	}


}
