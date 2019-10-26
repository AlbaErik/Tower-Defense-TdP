package Logica.Entidades.Defensores;

import Grafica.Entidades.Defensores.EmperadorRealGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Entidades.Entidad;
import Logica.Estados.Personajes.Defensor.ReposoDefensor;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaDefensor;
import Logica.Mapa.Mapa;

public class EmperadorReal extends Defensor {

	public EmperadorReal(int x, int y, Mapa m) {
		super(x, y, m);
		super.col = new ColisionadorDefensor(this);
		this.grafico = new EmperadorRealGrafico(x, y, m.getPanelMapa(), this);
		intel = new InteligenciaDefensor(this);
		estado = new ReposoDefensor(this);
		life = 300;
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

}
