package Logica.Entidades.Atacantes;

import Armas.Arco;
import Grafica.Entidades.Atacantes.EspadachinGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.ColisionadorAtacante;
import Logica.Entidades.Entidad;
import Logica.Estados.Personajes.*;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;

public class Espadachin extends Atacante {

	public Espadachin(int x, int y, Mapa m) {
		super(x, y, m);
		life = 260;
		attackSpeed=1;
		damage = 50;
		range = 100;
		movementSpeed=1.5;
		
		grafico = new EspadachinGrafico(x, y, m.getPanelMapa(), this);
		intel = new InteligenciaAtacante(this);
		arma = new Arco(this, m);
		estado = new Avanzar(this);
		col = new ColisionadorAtacante(this);
	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);
	}
	
	@Override
	public Atacante clone() {
		return new Espadachin(0,0,super.mapa);
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
