package Logica.Entidades.Defensores;

import Armas.LanzadorShurikens;
import Grafica.Entidades.EntidadGrafica;
import Grafica.Entidades.Defensores.NinjaEliteGrafico;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Entidades.Entidad;
import Logica.Estados.Personajes.Reposo;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaDefensor;
import Logica.Mapa.Mapa;

public class NinjaElite extends Defensor {

	public NinjaElite(int x, int y, Mapa m) {// Agregar valores a los atributos
		super(x, y, m);
		this.grafico = new NinjaEliteGrafico(x, y, m.getPanelMapa(), this);
		super.col = new ColisionadorDefensor(this);
		intel = new InteligenciaDefensor(this);
		arma = new LanzadorShurikens(this, m);
		estado = new Reposo(this);
		life = 190;
	}

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
	
}
