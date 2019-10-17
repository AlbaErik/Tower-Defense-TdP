package Logica.Entidades.Defensores;

import Grafica.Entidades.Defensores.SamuraiEliteGrafico;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Entidades.Entidad;
import Logica.Estados.Personajes.Reposo;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaDefensor;
import Logica.Mapa.Mapa;

public class SamuraiElite extends Defensor {

	public SamuraiElite(int x,int y,Mapa m) {
		super(x,y,m);
		super.col = new ColisionadorDefensor(this);
		this.grafico=new SamuraiEliteGrafico(x,y,m.getPanelMapa(),this);
		intel = new InteligenciaDefensor(this);
		estado = new Reposo(this);
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	@Override
	public Inteligencia getInteligencia() {
		// TODO Auto-generated method stub
		return intel;
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}
	

}
