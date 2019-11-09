package Logica.Entidades.Defensores;

import Logica.Colisionadores.Adistancia.ColCaminoLibreDef;
import Logica.Entidades.Personaje;
import Logica.Entidades.Municiones.Municion;
import Logica.Mapa.Mapa;

public abstract class Defensor extends Personaje {
	protected int cost;
	protected int vida;
	
	public Defensor(int x, int y, Mapa m) {
		super(x, y, m);
		colCaminoLibre = new ColCaminoLibreDef();
		direccion = 1;
		
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
		if(this.life<=vida && this.life>vida/2)
			mapa.actualizarOroTienda(cost);
		if(this.life<=vida/2)
			mapa.actualizarOroTienda(cost/2);
		this.mapa.eliminarEntidad(this);	
	} 
}
