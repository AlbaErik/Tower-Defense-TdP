package Logica.Colisionadores.Adistancia;

import Logica.LargaVistaDefensor;
import Logica.Entidades.Atacantes.Arquero;
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

public class ColCaminoLibreDef extends VisitorDistancia {

	private LargaVistaDefensor largaVista;

	public ColCaminoLibreDef(LargaVistaDefensor lar) {
		largaVista = lar;
	}

	@Override
	public void serChocado(Ninja e) {
		largaVista.setCaminoLibre(false);
	}

	@Override
	public void serChocado(Ejecutor e) {
		largaVista.setCaminoLibre(false);
	}

	@Override
	public void serChocado(Necromante e) {
		largaVista.setCaminoLibre(false);
	}

	@Override
	public void serChocado(Espadachin e) {
		largaVista.setCaminoLibre(false);
	}

	@Override
	public void serChocado(Arquero e) {
		largaVista.setCaminoLibre(false);
	}

	@Override
	public void serChocado(Emperador e) {
		largaVista.setCaminoLibre(false);
	}

	@Override
	public void serChocado(ArqueroElite e) {
		largaVista.setCaminoLibre(true);
	}

	@Override
	public void serChocado(SacerdoteElite e) {
		largaVista.setCaminoLibre(true);
	}

	@Override
	public void serChocado(EspadachinElite e) {
		largaVista.setCaminoLibre(true);
	}

	@Override
	public void serChocado(LanceroElite e) {
		largaVista.setCaminoLibre(true);
	}

	@Override
	public void serChocado(NinjaElite e) {
		largaVista.setCaminoLibre(true);
	}

	@Override
	public void serChocado(SamuraiElite e) {
		largaVista.setCaminoLibre(true);
	}

	@Override
	public void serChocado(Piedra e) {
		largaVista.setCaminoLibre(true);
	}

	@Override
	public void serChocado(Barro barro) {
		largaVista.setCaminoLibre(true);
	}

	@Override
	public void serChocado(Muro m) {
		largaVista.setCaminoLibre(true);
	}

	@Override
	public void serChocado(Municion m) {
		largaVista.setCaminoLibre(true);
	}

	@Override
	public void serChocado(EscudoEnemigo e) {
		largaVista.setCaminoLibre(true);
	}

	@Override
	public void serChocado(EscudoDef e) {
		largaVista.setCaminoLibre(true);
	}

	@Override
	public void serChocado(PocionFuerza pocionFuerza) {
		largaVista.setCaminoLibre(true);
	}

	@Override
	public void serChocado(Bombita bombita) {
		largaVista.setCaminoLibre(true);
	}

}
