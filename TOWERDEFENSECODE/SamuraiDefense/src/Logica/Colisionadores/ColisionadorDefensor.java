package Logica.Colisionadores;

import Logica.Entidades.Atacantes.Arquero;
import Logica.Entidades.Atacantes.Ejecutor;
import Logica.Entidades.Atacantes.Espadachin;
import Logica.Entidades.Atacantes.Necromante;
import Logica.Entidades.Atacantes.Ninja;
import Logica.Entidades.Defensores.ArqueroElite;
import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Defensores.EmperadorReal;
import Logica.Entidades.Defensores.EspadachinElite;
import Logica.Entidades.Defensores.LanceroElite;
import Logica.Entidades.Defensores.NinjaElite;
import Logica.Entidades.Defensores.SamuraiElite;
import Logica.Entidades.Municiones.MunicionesAtacante.FlechaAtacante;
import Logica.Entidades.Obstaculos.Temporales.Barro;
import Logica.Entidades.Obstaculos.VidaFinita.Piedra;
import Logica.Estados.Ataque;

public class ColisionadorDefensor extends Colisionador {

	private Defensor d;

	public ColisionadorDefensor(Defensor def) {
		d = def;
	}

	@Override
	public void serChocado(ArqueroElite e) {
		e.mover(false);
		e.atacar(true);
		e.cambiarEstado(new Ataque(e));
	}

	@Override
	public void serChocado(EmperadorReal e) {
		e.mover(false);
		e.atacar(true);
		e.cambiarEstado(new Ataque(e));
	}

	@Override
	public void serChocado(EspadachinElite e) {
		e.mover(false);
		e.atacar(true);
		e.cambiarEstado(new Ataque(e));
	}

	@Override
	public void serChocado(LanceroElite e) {
		e.mover(false);
		e.atacar(true);
		e.cambiarEstado(new Ataque(e));
	}

	@Override
	public void serChocado(NinjaElite e) {
		e.mover(false);
		e.atacar(true);
		e.cambiarEstado(new Ataque(e));
	}

	@Override
	public void serChocado(SamuraiElite e) {
		e.mover(false);
		e.atacar(true);
		e.cambiarEstado(new Ataque(e));
	}

	@Override
	public void serChocado(Piedra e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void serChocado(Barro barro) {
		// TODO Auto-generated method stub

	}

	@Override
	public void serChocado(Ninja e) {
		e.mover(false);
		e.atacar(true);
		e.cambiarEstado(new Ataque(e));
	}

	@Override
	public void serChocado(Espadachin e) {
		e.mover(false);
		e.atacar(true);
		e.cambiarEstado(new Ataque(e));
	}

	@Override
	public void serChocado(Arquero e) {
		e.mover(false);
		e.atacar(true);
		e.cambiarEstado(new Ataque(e));
	}

	@Override
	public void serChocado(Ejecutor e) {
		e.mover(false);
		e.atacar(true);
		e.cambiarEstado(new Ataque(e));
	}

	public void serChocado(FlechaAtacante e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void serChocado(Necromante e) {
		e.mover(false);
		e.atacar(true);
		e.cambiarEstado(new Ataque(e));
	}

}
