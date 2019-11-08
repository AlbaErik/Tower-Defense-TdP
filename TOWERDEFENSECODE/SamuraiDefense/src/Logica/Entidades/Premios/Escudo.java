package Logica.Entidades.Premios;

import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Mapa.Mapa;

public class Escudo extends Premio{

	public Escudo(int x, int y, Mapa m) {
		super(x, y, m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean chocaraDistancia(VisitorDistancia v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void chocar(Colisionador e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejecutarEstado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean queHago(int x,int y) {
		// TODO Auto-generated method stub
		return false;
	}

}
