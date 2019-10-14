package Logica.Entidades.Obstaculos.Temporales;
import Grafica.Entidades.EntidadGrafica;
import Logica.Colisionadores.ColisionadoresObstaculo.ColisionadorBarro;
import Logica.Entidades.Entidad;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Inteligencia.Inteligencia;
import Logica.Mapa.Mapa;

public class Barro extends Obstaculo{

	public Barro(int x,int y,Mapa m) {
		super(x,y,m);
		col = new ColisionadorBarro();
	}

	@Override
	public void setLife(int lp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntidadGrafica getGrafico() {
		return grafico;
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);		
	}

	@Override
	public Inteligencia getInteligencia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();		
	}

	@Override
	public Obstaculo clone() {
		// TODO Auto-generated method stub
		return new Barro(0, 0, mapa);
	}


}
