package Logica.Entidades.Obstaculos.Temporales;
import Grafica.Entidades.EntidadGrafica;
import Grafica.Entidades.Obstaculos.VidaFinita.BarroGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.ColisionadoresObstaculo.ColisionadorBarro;
import Logica.Entidades.Entidad;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Inteligencia.Inteligencia;
import Logica.Mapa.Mapa;

public class Barro extends Obstaculo{

	private int lentitud;
	public Barro(int x,int y,Mapa m) {
		super(x,y,m);
		life = 1000000000;
		lentitud = 1;
		grafico = new BarroGrafico(y, y, mapa.getPanelMapa(), this);
		col = new ColisionadorBarro();
	}

	public int getLentitud() {
		return lentitud;
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
	public void chocar(Colisionador e) {
		e.serChocado(this);		
	}

	@Override
	public Inteligencia getInteligencia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ejecutarEstado() {
		//estado.ejecutar();		
	}

	@Override
	public Obstaculo clone() {
		// TODO Auto-generated method stub
		return new Barro(0, 0, mapa);
	}

	@Override
	public boolean chocaraDistancia(VisitorDistancia v) {
		return v.serChocado(this);
	}
	

}
