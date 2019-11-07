package Logica.PowerUps.Temporales;

import Logica.Entidades.Premios.Escudo;
import Logica.Entidades.Premios.Premio;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;

public class CampoProteccion extends MagiaTemporal{

	private Premio escudo;
	public CampoProteccion(Mapa m) {
		super(m);
		escudo = new Escudo(0, 0, m);
	}
	
	@Override
	public PowerUp clone() {
		// TODO Auto-generated method stub
		return new CampoProteccion(map);
	}

	@Override
	public Premio getPremio() {
		// TODO Auto-generated method stub
		return escudo;
	}

	@Override
	public void click() {
		// -----------------------------------------------------------
		
	}

}
