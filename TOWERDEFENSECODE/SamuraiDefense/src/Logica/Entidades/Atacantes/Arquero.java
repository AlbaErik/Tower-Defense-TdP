package Logica.Entidades.Atacantes;

import Armas.Arco;
import Grafica.Entidades.Atacantes.ArqueroGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.ColisionadorAtacante;
import Logica.Colisionadores.Adistancia.ColADistanciaEnem;
import Logica.Entidades.Entidad;
import Logica.Entidades.Municiones.Municion;
import Logica.Estados.Personajes.*;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;

public class Arquero extends Atacante {
	
	public Arquero(int x, int y, Mapa m) {
		super(x, y, m);
		this.grafico = new ArqueroGrafico(x, y, m.getPanelMapa(), this);
		this.movementSpeed = 1;
		life = 100;
		this.col = new ColisionadorAtacante(this);
		intel = new InteligenciaAtacante(this);
		arma = new Arco(this, m);
		estado = new Avanzar(this);
		damage = 0;
		colDistancia = new ColADistanciaEnem(this);
		range = 200;
	}

	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	public Atacante clone() {
		return new Arquero(0, 0, super.mapa);
	}

	@Override
	public Inteligencia getInteligencia() {
		return intel;
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();
	}

	@Override
	public void atacar(Entidad e) {
		Municion mun = arma.crearMunicionAtacante();
		mapa.agregarEntidadAlCampoEnPosActual(mun);
	}

}
