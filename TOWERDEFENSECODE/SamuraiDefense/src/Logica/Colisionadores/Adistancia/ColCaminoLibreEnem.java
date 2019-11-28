package Logica.Colisionadores.Adistancia;

import Logica.Entidades.Atacantes.Arquero;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Atacantes.Ejecutor;
import Logica.Entidades.Atacantes.Emperador;
import Logica.Entidades.Atacantes.Espadachin;
import Logica.Entidades.Atacantes.Necromante;
import Logica.Entidades.Atacantes.Ninja;
import Logica.Entidades.Defensores.ArqueroElite;
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

public class ColCaminoLibreEnem extends VisitorDistancia {

	private Atacante ataq;

	public ColCaminoLibreEnem(Atacante at) {
		ataq = at;
	}

	@Override
	public void serChocado(Ninja e) {
		ataq.setCaminoLibre(true);
	}

	@Override
	public void serChocado(Ejecutor e) {
		ataq.setCaminoLibre(true);
	}

	@Override
	public void serChocado(Necromante e) {
		ataq.setCaminoLibre(true);
	}

	@Override
	public void serChocado(Espadachin e) {
		ataq.setCaminoLibre(true);
	}

	@Override
	public void serChocado(Arquero e) {
		ataq.setCaminoLibre(true);
	}

	@Override
	public void serChocado(Emperador e) {
		ataq.setCaminoLibre(true);
	}

	@Override
	public void serChocado(ArqueroElite e) {
		ataq.setCaminoLibre(false);
	}

	@Override
	public void serChocado(SacerdoteElite e) {
		ataq.setCaminoLibre(false);
	}

	@Override
	public void serChocado(EspadachinElite e) {
		ataq.setCaminoLibre(false);
	}

	@Override
	public void serChocado(LanceroElite e) {
		ataq.setCaminoLibre(false);
	}

	@Override
	public void serChocado(NinjaElite e) {
		ataq.setCaminoLibre(false);
	}

	@Override
	public void serChocado(SamuraiElite e) {
		ataq.setCaminoLibre(false);
	}

	@Override
	public void serChocado(Piedra e) {
		ataq.setCaminoLibre(false);
	}

	@Override
	public void serChocado(Barro barro) {
		ataq.setCaminoLibre(true);
	}

	@Override
	public void serChocado(Muro m) {
		ataq.setCaminoLibre(false);
	}

	@Override
	public void serChocado(Municion m) {
		ataq.setCaminoLibre(true);
	}

	@Override
	public void serChocado(EscudoEnemigo e) {
		ataq.setCaminoLibre(true);
	}

	@Override
	public void serChocado(EscudoDef e) {
		ataq.setCaminoLibre(true);
	}

	@Override
	public void serChocado(PocionFuerza pocionFuerza) {
		ataq.setCaminoLibre(true);
	}

	@Override
	public void serChocado(Bombita bombita) {
		ataq.setCaminoLibre(true);
	}

}
