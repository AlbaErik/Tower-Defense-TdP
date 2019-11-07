package Logica.PowerUps.Temporales;

import Logica.Entidades.Premios.PocionFuerza;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;

public class PocionDeFuerza extends MagiaTemporal{

	public PocionDeFuerza(Mapa m) {
		super(m);
		clave = 3;
	}
	
	@Override
	public PowerUp clone() {
		// TODO Auto-generated method stub
		return new PocionDeFuerza(map);
	}

	@Override
	public void click() {
		map.agregarPremioTienda(clave, new PocionFuerza(0, 0, map));
	}

}
