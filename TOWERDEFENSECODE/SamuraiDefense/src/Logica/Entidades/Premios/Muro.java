package Logica.Entidades.Premios;

import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.Premios.VisitorMuro;
import Logica.Mapa.Mapa;

public class Muro extends Premio{

	public Muro(int x, int y, Mapa m) {
		super(x, y, m);
		life = 100;
		col = new VisitorMuro(this);
	}

	@Override
	public boolean chocaraDistancia(VisitorDistancia v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	@Override
	public void ejecutarEstado() {
		// TODO Auto-generated method stub
		
	}

}
