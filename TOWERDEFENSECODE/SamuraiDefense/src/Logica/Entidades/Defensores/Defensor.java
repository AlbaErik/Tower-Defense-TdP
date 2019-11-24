package Logica.Entidades.Defensores;

import Logica.LargaVistaDefensor;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Entidades.Contador;
import Logica.Entidades.Personaje;
import Logica.Estados.Personajes.Defensor.SuperReposoDefensor;
import Logica.Inteligencia.InteligenciaDefensor;
import Logica.Mapa.Mapa;

public abstract class Defensor extends Personaje {
	protected int cost;
	protected int vida;

	protected Defensor(int x, int y, Mapa m) {
		super(x, y, m);
		
		colCaminoLibre = new LargaVistaDefensor();
		intel = new InteligenciaDefensor(this);
		estado = new SuperReposoDefensor(this, new Contador());
		col = new ColisionadorDefensor(this);
	}
	
	@Override
	public void ejecutarEstado() {
		estado.ejecutar();
	}
	
	public void subirFuerza() {
		estado.cambiarAPoderoso();
	}

	public int getDireccion() {
		return 1;
	}

	public int getCost() {
		return cost;
	}
	
	public abstract Defensor clone();
	
	public void eliminarPorBoton() {
		if (life <= vida && life > vida / 2)
			mapa.actualizarOroTienda(cost);
		if (life <= vida / 2)
			mapa.actualizarOroTienda(cost / 2);
		mapa.eliminarEntidad(this);
	}
}
