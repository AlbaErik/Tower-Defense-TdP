package Logica.PowerUps.Preciosos;

import Logica.Entidades.Premios.Bombita;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;

public class Bomba extends ObjetoPrecioso{
	
	public Bomba(Mapa m) {
		super(m);
		clave = 5;
	}
	
	@Override
	public PowerUp clone() {
		// TODO Auto-generated method stub
		return new Bomba(map);
	}
	
	@Override
	public void click() {
		map.agregarPremioTienda(clave, new Bombita(0, 0, map));
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}

}
