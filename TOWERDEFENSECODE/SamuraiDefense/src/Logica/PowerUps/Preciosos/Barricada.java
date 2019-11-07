package Logica.PowerUps.Preciosos;

import Logica.Entidades.Premios.Muro;
import Logica.Entidades.Premios.Premio;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;

public class Barricada extends ObjetoPrecioso{
	
	private Premio muro;
	public Barricada(Mapa m) {
		super(m);
		muro = new Muro(0, 0, m);
	}

	@Override
	public PowerUp clone() {
		// TODO Auto-generated method stub
		return new Barricada(map);
	}

	@Override
	public Premio getPremio() {
		// TODO Auto-generated method stub
		return muro;
	}

	@Override
	public void click() {
		// -----------------------------------------------------------
		
	}

}
