package Logica.Colisionadores.Adistancia;

import Logica.Entidades.Atacantes.Arquero;
import Logica.Entidades.Atacantes.Ejecutor;
import Logica.Entidades.Atacantes.Emperador;
import Logica.Entidades.Atacantes.Espadachin;
import Logica.Entidades.Atacantes.Necromante;
import Logica.Entidades.Atacantes.Ninja;
import Logica.Entidades.Defensores.ArqueroElite;
import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Defensores.EspadachinElite;
import Logica.Entidades.Defensores.LanceroElite;
import Logica.Entidades.Defensores.NinjaElite;
import Logica.Entidades.Defensores.SacerdoteElite;
import Logica.Entidades.Defensores.SamuraiElite;
import Logica.Entidades.Municiones.Municion;
import Logica.Entidades.Obstaculos.ConVida.Piedra;
import Logica.Entidades.Obstaculos.Temporales.Barro;
import Logica.Entidades.Premios.Bombita;
import Logica.Entidades.Premios.EscudoDef;
import Logica.Entidades.Premios.EscudoEnemigo;
import Logica.Entidades.Premios.Muro;
import Logica.Entidades.Premios.PocionFuerza;

public class ColCaminoLibreDef extends VisitorDistancia {

	private Defensor def;

	public ColCaminoLibreDef(Defensor l) {
		def = l;
	}

	@Override
	public void serChocado(Ninja e) {
		def.setCaminoLibre(false);
	}

	@Override
	public void serChocado(Ejecutor e) {
		def.setCaminoLibre(false);
	}

	@Override
	public void serChocado(Necromante e) {
		def.setCaminoLibre(false);
	}

	@Override
	public void serChocado(Espadachin e) {
		def.setCaminoLibre(false);
	}

	@Override
	public void serChocado(Arquero e) {
		def.setCaminoLibre(false);
	}

	@Override
	public void serChocado(Emperador e) {
		def.setCaminoLibre(false);
	}

	@Override
	public void serChocado(ArqueroElite e) {
		def.setCaminoLibre(true);
	}

	@Override
	public void serChocado(SacerdoteElite e) {
		def.setCaminoLibre(true);
	}

	@Override
	public void serChocado(EspadachinElite e) {
		def.setCaminoLibre(true);
	}

	@Override
	public void serChocado(LanceroElite e) {
		def.setCaminoLibre(true);
	}

	@Override
	public void serChocado(NinjaElite e) {
		def.setCaminoLibre(true);
	}

	@Override
	public void serChocado(SamuraiElite e) {
		def.setCaminoLibre(true);
	}

	@Override
	public void serChocado(Piedra e) {
		def.setCaminoLibre(true);
	}

	@Override
	public void serChocado(Barro barro) {
		def.setCaminoLibre(true);
	}

	@Override
	public void serChocado(Muro m) {
		def.setCaminoLibre(true);
	}

	@Override
	public void serChocado(Municion m) {
		def.setCaminoLibre(true);
	}

	@Override
	public void serChocado(EscudoEnemigo e) {
		def.setCaminoLibre(false);
	}

	@Override
	public void serChocado(EscudoDef e) {
		def.setCaminoLibre(true);
	}

	@Override
	public void serChocado(PocionFuerza pocionFuerza) {
		def.setCaminoLibre(true);
	}

	@Override
	public void serChocado(Bombita bombita) {
		def.setCaminoLibre(true);
	}

}
