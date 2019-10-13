package Logica.Colisionadores;

import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.Arquero;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Atacantes.Ejecutor;
import Logica.Entidades.Atacantes.Espadachin;
import Logica.Entidades.Atacantes.Necromante;
import Logica.Entidades.Atacantes.Ninja;
import Logica.Entidades.Defensores.ArqueroElite;
import Logica.Entidades.Defensores.EmperadorReal;
import Logica.Entidades.Defensores.EspadachinElite;
import Logica.Entidades.Defensores.LanceroElite;
import Logica.Entidades.Defensores.NinjaElite;
import Logica.Entidades.Defensores.SamuraiElite;
import Logica.Entidades.Municiones.MunicionesAtacante.FlechaAtacante;
import Logica.Entidades.Obstaculos.Temporales.Barro;
import Logica.Entidades.Obstaculos.VidaFinita.Piedra;


public class ColisionadorAtacante extends Colisionador{
	
	private Atacante ataq;
	
	public ColisionadorAtacante(Atacante a) {
		ataq = a;
	}
	
	/*
	 * Determina que entidad esta por detras de otra para frenarla mas tarde.
	 */
	private Entidad quienSeFrena(Entidad e) {
		double Xataq = ataq.getPos().getX();
		double XserChocado = e.getPos().getX();
		
		Entidad ret;
		if(Xataq > XserChocado)
			ret = ataq;
		else
			ret = e;
		return ret;
	}

	@Override
	public void serChocado(Ninja e) {
		quienSeFrena(e).mover(false);
	}

	@Override
	public void serChocado(ArqueroElite e) {
		quienSeFrena(e).mover(false);
	}

	@Override
	public void serChocado(EmperadorReal e) {
		quienSeFrena(e).mover(false);
	}

	@Override
	public void serChocado(EspadachinElite e) {
		quienSeFrena(e).mover(false);
	}

	@Override
	public void serChocado(LanceroElite e) {
		quienSeFrena(e).mover(false);
	}

	@Override
	public void serChocado(NinjaElite e) {
		quienSeFrena(e).mover(false);
	}

	@Override
	public void serChocado(SamuraiElite e) {
		quienSeFrena(e).mover(false);
	}

	@Override
	public void serChocado(Piedra e) {
		quienSeFrena(e).mover(false);
	}

	@Override
	public void serChocado(Barro e) {
		quienSeFrena(e).mover(false);
	}

	@Override
	public void serChocado(Espadachin e) {
		quienSeFrena(e).mover(false);
	}

	@Override
	public void serChocado(Arquero e) {
		quienSeFrena(e).mover(false);
	}

	@Override
	public void serChocado(FlechaAtacante flechaAtacante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Necromante necromante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Ejecutor ejecutor) {
		// TODO Auto-generated method stub
		
	}


}
