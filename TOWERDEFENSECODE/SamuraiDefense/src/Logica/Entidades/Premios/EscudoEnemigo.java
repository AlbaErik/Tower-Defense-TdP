package Logica.Entidades.Premios;

import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.Premios.VisitorEscudoEnemigo;
import Logica.Mapa.Mapa;

public class EscudoEnemigo extends Premio{

	public EscudoEnemigo(int x, int y, Mapa m) {
		super(x, y, m);
		col = new VisitorEscudoEnemigo();
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

}
