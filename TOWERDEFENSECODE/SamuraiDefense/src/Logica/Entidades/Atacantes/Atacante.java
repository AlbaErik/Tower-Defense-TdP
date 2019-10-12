package Logica.Entidades.Atacantes;

import Grafica.Entidades.Atacantes.AtacanteGrafico;
import Logica.Entidades.Personaje;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;

public abstract class Atacante extends Personaje {
	protected int movementSpeed;
	protected InteligenciaAtacante intel;

	public Atacante(int x, int y, Mapa m) {
		super(x, y, m);
	}
	
	public void setGrafico(AtacanteGrafico graf) {
		this.grafico = graf;
	}
	
	public int getVelocidadMov() {
		return movementSpeed;
	}
	
	public Inteligencia getInteligencia() {
		return intel;
	}
	
	public abstract Atacante copyEntidad();

}
