package Armas;

import Logica.Entidades.Personaje;
import Logica.Entidades.Municiones.Municion;
import Logica.Entidades.Municiones.MunicionesDefensor.FlechaDefensor;
import Logica.Mapa.Mapa;

public class ArmaSimple extends Arma{
	
	public ArmaSimple(Personaje p, Mapa m) {
		super(p, m);
		super.daño = 80;
	}

	@Override
	public Municion crearMunicionDefensor() {
		// TODO Auto-generated method stub
		return new FlechaDefensor(daño, daño, mapa);
	}

	@Override
	public Municion crearMunicionAtacante() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
