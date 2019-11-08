package Logica.PowerUps.Temporales;

import Grafica.PowerUps.CampoProteccionGrafico;
import Logica.Entidades.Premios.Escudo;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;

public class CampoProteccion extends MagiaTemporal{

	public CampoProteccion(Mapa m) {
		super(m);
		clave = 1;
		grafica = new CampoProteccionGrafico(this);
	}
	
	@Override
	public PowerUp clone() {
		// TODO Auto-generated method stub
		return new CampoProteccion(map);
	}

	@Override
	public void click() {
		map.agregarPremioTienda(clave, new Escudo(0, 0, map));
	}

	@Override
	public void morir() {
		map.eliminarPowerUp(this);
	}

}
