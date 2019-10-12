package Logica.Entidades.Atacantes;

import Grafica.Entidades.Atacantes.NecromanteGrafico;
import Logica.Colisionadores.ColisionadorAtacante;
import Logica.Entidades.Entidad;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;

public class Necromante extends Atacante {

	public Necromante(int x, int y, Mapa m) {
		super(x, y, m);
		this.grafico = new NecromanteGrafico(x, y, m.getPanelMapa(), this);
		this.movementSpeed = 1;
		this.col = new ColisionadorAtacante(this);
		intel = new InteligenciaAtacante(this);
	}

	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
	}

	public Atacante copyEntidad() {
		return new Necromante(0, 0, super.mapa);
	}

	@Override
	public Inteligencia getInteligencia() {
		// TODO Auto-generated method stub
		return intel;
	}

}
