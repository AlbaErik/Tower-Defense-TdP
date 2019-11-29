package Logica.Entidades.Obstaculos.Temporales;
import Grafica.Entidades.EntidadGrafica;
import Grafica.Entidades.Obstaculos.VidaFinita.BarroGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.ColisionadoresObstaculo.ColisionadorBarro;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Inteligencia.Inteligencia;
import Logica.Mapa.Mapa;

public class Barro extends Obstaculo{

	private int lentitud;
	public Barro(int x,int y,Mapa m) {
		super(x,y,m);
		life = 1000;
		lentitud = 1;
		
		grafico = new BarroGrafico(y, y, mapa.getPanelMapa(), this);
		col = new ColisionadorBarro();
	}

	public int getLentitud() {
		return lentitud;
	}
	
	@Override
	public void recibirDaño(int lp) {

	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);		
	}

	@Override
	public Inteligencia getInteligencia() {
		return null;
	}

	@Override
	public void ejecutarEstado() {
		life--;
		if(life <= 0 )
			morir();
	}

	@Override
	public void chocaraDistancia(VisitorDistancia v) {
		v.serChocado(this);
	}	

}
