package Logica.PowerUps.Temporales;

import Grafica.PowerUps.CampoProteccionGrafico;
import Logica.Entidades.Premios.EscudoDef;
import Logica.Mapa.Mapa;

public class CampoProteccion extends MagiaTemporal{

	public CampoProteccion(Mapa m) {
		super(m);
		clave = 1;
		grafica = new CampoProteccionGrafico(this);
	}

	@Override
	public void click() {
		map.agregarPremioTienda(clave, new EscudoDef(0, 0, map));
		map.revisarStockPremios();
	}

	@Override
	public void morir() {
		map.eliminarPowerUp(this);
	}

}
