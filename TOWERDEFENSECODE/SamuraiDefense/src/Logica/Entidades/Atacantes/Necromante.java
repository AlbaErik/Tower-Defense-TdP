package Logica.Entidades.Atacantes;

import Armas.Arco;
import Grafica.Entidades.Atacantes.NecromanteGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.ColisionadorAtacante;
import Logica.Entidades.Entidad;
import Logica.Estados.Personajes.*;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;

public class Necromante extends Atacante {

	public Necromante(int x, int y, Mapa m) {
		super(x, y, m);
		this.grafico = new NecromanteGrafico(x, y, m.getPanelMapa(), this);
		this.movementSpeed = 2.5;
		life = 150;
		this.col = new ColisionadorAtacante(this);
		intel = new InteligenciaAtacante(this);
		estado = new Avanzar(this);
		arma = new Arco(this,m);
		damage = 50;
	}

	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	public Atacante clone() {
		return new Necromante(0, 0, super.mapa);
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
