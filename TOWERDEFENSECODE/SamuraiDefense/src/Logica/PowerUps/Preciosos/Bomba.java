package Logica.PowerUps.Preciosos;

import Logica.Entidades.Premios.Bombita;
import Logica.Entidades.Premios.Premio;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;

public class Bomba extends ObjetoPrecioso{
	
	private Premio bombita;
	public Bomba(Mapa m) {
		super(m);
		bombita = new Bombita(0, 0, null);
	}
	
	@Override
	public PowerUp clone() {
		// TODO Auto-generated method stub
		return new Bomba(map);
	}

	@Override
	public Premio getPremio() {
		// TODO Auto-generated method stub
		return bombita;
	}

	@Override
	public void click() {
		// -----------------------------------------------------------
		
	}

}
