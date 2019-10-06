package Logica.Entidades.Atacantes;

import Grafica.Entidades.Atacantes.AtacanteGrafico;
import Logica.Entidades.Entidad;
import Logica.Entidades.Personaje;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;

public abstract class Atacante extends Personaje implements Cloneable{
	protected int movementSpeed;
	protected InteligenciaAtacante intel;

	public Atacante(int x, int y, Mapa m) {
		super(x, y, m);
	}
	
	//public abstract void setGrafico(AtacanteGrafico graf);
	public void setGrafico(AtacanteGrafico graf) {
		this.grafico = graf;
	}

	public abstract Atacante copyEntidad();

}
