package Logica.Entidades.Premios;

import Grafica.Entidades.Premios.EscudoGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.Premios.VisitorEscudoEnemigo;
import Logica.Mapa.Mapa;

public class EscudoEnemigo extends Premio{

	public EscudoEnemigo(int x, int y, Mapa m) {
		super(x, y, m);
		clave = 1;
		grafico = new EscudoGrafico(y, y, mapa.getPanelMapa(), this);
		col = new VisitorEscudoEnemigo(this);
	}

	@Override
	public boolean chocaraDistancia(VisitorDistancia v) {
		return v.serChocado(this);
	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	@Override
	public void ejecutarEstado() {
		
	}

	public void actualizarPos(double x, int y) {
		this.cambiarPosLogica(x, y);
	}
	
	@Override
	public boolean queHago(int x, int y) {
		return false;
	}
	
}
