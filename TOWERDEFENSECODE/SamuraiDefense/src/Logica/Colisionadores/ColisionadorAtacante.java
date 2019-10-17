package Logica.Colisionadores;

import Logica.Entidades.Entidad;
import Logica.Entidades.Personaje;
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
import Logica.Entidades.Obstaculos.ConVida.Piedra;
import Logica.Entidades.Obstaculos.Temporales.Barro;
import Logica.Estados.Personajes.*;

public class ColisionadorAtacante extends Colisionador {

	private Atacante ataq;

	public ColisionadorAtacante(Atacante a) {
		ataq = a;
	}

	@Override
	public void serChocado(ArqueroElite e) {
		e.cambiarEstado(new Ataque(e));

	}

	@Override
	public void serChocado(EmperadorReal e) {
		e.cambiarEstado(new Ataque(e));
	}

	@Override
	public void serChocado(EspadachinElite e) {
		e.cambiarEstado(new Ataque(e));
	}

	@Override
	public void serChocado(LanceroElite e) {
		e.cambiarEstado(new Ataque(e));
	}

	@Override
	public void serChocado(NinjaElite e) {
		e.cambiarEstado(new Ataque(e));
	}

	@Override
	public void serChocado(SamuraiElite e) {
		e.cambiarEstado(new Ataque(e));
	}

	@Override
	public void serChocado(Piedra e) {
		ataq.cambiarEstado(new Ataque(ataq));
	}

	@Override
	public void serChocado(Barro e) {
	}

	
	private Personaje quienSeFrena(Personaje p) {
		double x = ataq.getPos().getX();
		Personaje toret = ataq;
		if(p.getPos().getX() > x)
			toret = p;
		return toret;
	}
	
	
	@Override
	public void serChocado(Ninja e) {
		Personaje p = quienSeFrena(e);
		p.cambiarEstado(new Reposo(p));
	}
	
	@Override
	public void serChocado(Espadachin e) {
		Personaje p = quienSeFrena(e);
		p.cambiarEstado(new Reposo(p));
	}

	@Override
	public void serChocado(Arquero e) {
		Personaje p = quienSeFrena(e);
		p.cambiarEstado(new Reposo(p));
	}

	@Override
	public void serChocado(Ejecutor e) {
		Personaje p = quienSeFrena(e);
		p.cambiarEstado(new Reposo(p));	}

	@Override
	public void serChocado(Necromante e) {
		Personaje p = quienSeFrena(e);
		p.cambiarEstado(new Reposo(p));	}

	public void serChocado(FlechaAtacante flechaAtacante) {
		// TODO Auto-generated method stub

	}

}
