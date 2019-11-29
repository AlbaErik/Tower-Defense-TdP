package Logica.PowerUps.Preciosos;

import Grafica.PowerUps.BarricadaGrafico;
import Logica.Entidades.Premios.Muro;
import Logica.Mapa.Mapa;

public class Barricada extends ObjetoPrecioso{
	
	public Barricada(Mapa m) {
		super(m);
		clave = 4;
		grafica = new BarricadaGrafico(this);
	}

	@Override
	public void click() {
		map.agregarPremioTienda(clave, new Muro(0, 0, map));
		map.revisarStockPremios();
	}

	@Override
	public void morir() {
		map.eliminarPowerUp(this);		
	}

}
