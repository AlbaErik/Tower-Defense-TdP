package Logica.PowerUps.Temporales;

import Grafica.PowerUps.PocionDeFuerzaGrafico;
import Logica.Entidades.Premios.PocionFuerza;
import Logica.Mapa.Mapa;

public class PocionDeFuerza extends MagiaTemporal{

	public PocionDeFuerza(Mapa m) {
		super(m);
		clave = 2;
		grafica = new PocionDeFuerzaGrafico(this);
	}
	
	@Override
	public void click() {
		map.agregarPremioTienda(clave, new PocionFuerza(0, 0, map));
		map.revisarStockPremios();
	}

	@Override
	public void morir() {
		map.eliminarPowerUp(this);
	}

}
