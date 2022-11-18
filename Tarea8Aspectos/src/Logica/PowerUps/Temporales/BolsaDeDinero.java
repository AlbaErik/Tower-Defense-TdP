package Logica.PowerUps.Temporales;

import Grafica.PowerUps.BolsadeMonedasGrafico;
import Logica.Mapa.Mapa;

public class BolsaDeDinero extends MagiaTemporal{

	public BolsaDeDinero(Mapa m) {
		super(m);
		clave = 0;
		grafica = new BolsadeMonedasGrafico(this);
	}
	
	public void morir() {
		map.eliminarPowerUp(this);
	}

	@Override
	public void click() {
		int i = (int) ((Math.random() * ((10000 - 5000) + 1)) + 5000);
		map.actualizarOroTienda(i);
	}
	
}
