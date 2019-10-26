package Logica;

import Logica.Entidades.Defensores.ArqueroElite;
import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Defensores.SacerdoteElite;
import Logica.Entidades.Defensores.EspadachinElite;
import Logica.Entidades.Defensores.LanceroElite;
import Logica.Entidades.Defensores.NinjaElite;
import Logica.Entidades.Defensores.SamuraiElite;
import Logica.Mapa.Mapa;

public class FabricaDefensores{
	
	public FabricaDefensores() {
	}

	public Defensor crearNinjaElite(Mapa m) {
		return new NinjaElite(0,0,m) ;
	}

	public Defensor crearArqueroElite(Mapa m) {
		return new ArqueroElite(0,0,m);
	}

	public Defensor crearLanceroElite(Mapa m) {
		return new LanceroElite(0,0,m);
	}

	public Defensor crearEspadachinElite(Mapa m) {
		return new EspadachinElite(0,0,m);
	}

	public Defensor crearSacerdoteElite(Mapa m) {
		return new SacerdoteElite(0,0,m);
	}

	public Defensor crearSamuraiElite(Mapa m) {
		return new SamuraiElite(0,0,m);
	}

}