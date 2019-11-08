package Logica.PowerUps.Preciosos;

import Grafica.PowerUps.BarricadaGrafico;
import Logica.Entidades.Premios.Muro;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;

public class Barricada extends ObjetoPrecioso{
	
	public Barricada(Mapa m) {
		super(m);
		clave = 4;
		grafica = new BarricadaGrafico(this);
	}

	@Override
	public PowerUp clone() {
		// TODO Auto-generated method stub
		return new Barricada(map);
	}

	@Override
	public void click() {
		map.agregarPremioTienda(clave, new Muro(0, 0, map));
	}

	@Override
	public void morir() {
		map.eliminarPowerUp(this);
		
	}

}
