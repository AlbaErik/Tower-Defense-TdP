package Logica.Entidades.Defensores;

import Armas.LanzadorShurikens;
import Grafica.Entidades.EntidadGrafica;
import Grafica.Entidades.Defensores.NinjaEliteGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Estados.Personajes.Defensor.ReposoDefensor;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaDefensor;
import Logica.Mapa.Mapa;

public class NinjaElite extends Defensor {

	public NinjaElite(int x, int y, Mapa m) {// Agregar valores a los atributos
		super(x, y, m);
		life = 200;
		vida=200;
		attackSpeed = 0.5; //Es 1 seg
		damage = 20;
		range = 0;
		cost = 150;
		
		this.grafico = new NinjaEliteGrafico(x, y, m.getPanelMapa(), this);
		super.col = new ColisionadorDefensor(this);
		intel = new InteligenciaDefensor(this);
		arma = new LanzadorShurikens(this, m);
		estado = new ReposoDefensor(this);
	}

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
		return intel;
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();		
	}

	@Override
	public void atacar(Entidad aDestruir) {
		if(aDestruir != null) {
			aDestruir.setLife(damage);
		}
	}

	@Override
	public boolean chocaraDistancia(VisitorDistancia v) {
		return v.serChocado(this);
	}

}
