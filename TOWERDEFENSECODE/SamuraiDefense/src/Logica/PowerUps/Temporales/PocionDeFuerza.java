package Logica.PowerUps.Temporales;

import Logica.Entidades.Premios.Premio;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;

public class PocionDeFuerza extends MagiaTemporal{

	public PocionDeFuerza(Mapa m) {
		super(m);
	}
	
	@Override
	public PowerUp clone() {
		// TODO Auto-generated method stub
		return new PocionDeFuerza(map);
	}

	@Override
	public Premio getPremio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void click() {
		// -----------------------------------------------------------
		
	}

}
