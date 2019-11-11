package Logica.Entidades.Defensores;

import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Colisionadores.Adistancia.ColCaminoLibreDef;
import Logica.Entidades.Personaje;
import Logica.Entidades.Municiones.Municion;
import Logica.Estados.Personajes.Defensor.ReposoDefensor;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaDefensor;
import Logica.Mapa.Mapa;

public abstract class Defensor extends Personaje {
	protected int cost;
	protected int vida;

	protected Defensor(int x, int y, Mapa m) {
		super(x, y, m);
		direccion = 1;
		
		colCaminoLibre = new ColCaminoLibreDef();
		intel = new InteligenciaDefensor(this);
		estado = new ReposoDefensor(this);
		col = new ColisionadorDefensor(this);
	}

	@Override
	public Inteligencia getInteligencia() {
		return intel;
	}
	
	@Override
	public void ejecutarEstado() {
		estado.ejecutar();
	}
	
	public void subirFuerza(int cant) {
		damage += cant;
	}

	public int getDireccion() {
		return direccion;
	}

	public int getCost() {
		return cost;
	}

	public int getDañoArma() {
		return arma.getDaño();
	}

	public Municion getMunicion() {
		return arma.crearMunicionDefensor();
	}

	public void eliminarPorBoton() {
		if (life <= vida && life > vida / 2)
			mapa.actualizarOroTienda(cost);
		if (life <= vida / 2)
			mapa.actualizarOroTienda(cost / 2);
		mapa.eliminarEntidad(this);
	}
}
