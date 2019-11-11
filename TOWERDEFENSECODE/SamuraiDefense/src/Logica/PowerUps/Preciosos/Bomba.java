package Logica.PowerUps.Preciosos;

import Grafica.PowerUps.BombaGrafico;
import Logica.Entidades.Premios.Bombita;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;

public class Bomba extends ObjetoPrecioso{
	
	public Bomba(Mapa m) {
		super(m);
		clave = 3;
		grafica = new BombaGrafico(this);
	}
	
	@Override
	public PowerUp clone() {
		return new Bomba(map);
	}
	
	@Override
	public void click() {
		map.agregarPremioTienda(clave, new Bombita(0, 0, map));
	}

	@Override
	public void morir() {
		map.eliminarPowerUp(this);		
	}

}
