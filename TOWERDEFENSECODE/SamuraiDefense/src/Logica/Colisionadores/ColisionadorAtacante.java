package Logica.Colisionadores;

import Logica.Entidades.Atacantes.Arquero;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Atacantes.Ejecutor;
import Logica.Entidades.Atacantes.Emperador;
import Logica.Entidades.Atacantes.Espadachin;
import Logica.Entidades.Atacantes.Necromante;
import Logica.Entidades.Atacantes.Ninja;
import Logica.Entidades.Defensores.ArqueroElite;
import Logica.Entidades.Defensores.SacerdoteElite;
import Logica.Entidades.Defensores.EspadachinElite;
import Logica.Entidades.Defensores.LanceroElite;
import Logica.Entidades.Defensores.NinjaElite;
import Logica.Entidades.Defensores.SamuraiElite;
import Logica.Entidades.Municiones.MunicionesAtacante.MunicionAtacante;
import Logica.Entidades.Municiones.MunicionesDefensor.MunicionDefensor;
import Logica.Entidades.Obstaculos.ConVida.Piedra;
import Logica.Entidades.Obstaculos.Temporales.Barro;
import Logica.Entidades.Premios.Bombita;
import Logica.Entidades.Premios.EscudoDef;
import Logica.Entidades.Premios.EscudoEnemigo;
import Logica.Entidades.Premios.Muro;
import Logica.Estados.Personajes.Atacante.AtaqueEnemigo;
import Logica.Estados.Personajes.Atacante.ReposoEnemigo;

public class ColisionadorAtacante extends Colisionador {

	private Atacante ataq;
	private Atacante noSeFrena;

	public ColisionadorAtacante(Atacante a) {
		ataq = a;
	}

	@Override
	public void serChocado(ArqueroElite e) {
		ataq.cambiarEstado(new AtaqueEnemigo(ataq));
	}

	@Override
	public void serChocado(SacerdoteElite e) {
		ataq.cambiarEstado(new AtaqueEnemigo(ataq));
		ataq.setEntidadADestruir(e);

	}

	@Override
	public void serChocado(EspadachinElite e) {
		ataq.cambiarEstado(new AtaqueEnemigo(ataq));
		ataq.setEntidadADestruir(e);
	}

	@Override
	public void serChocado(LanceroElite e) {
		ataq.cambiarEstado(new AtaqueEnemigo(ataq));
		ataq.setEntidadADestruir(e);
	}

	@Override
	public void serChocado(NinjaElite e) {
		ataq.cambiarEstado(new AtaqueEnemigo(ataq));
		ataq.setEntidadADestruir(e);
	}

	@Override
	public void serChocado(SamuraiElite e) {
		ataq.cambiarEstado(new AtaqueEnemigo(ataq));
		ataq.setEntidadADestruir(e);
	}

	@Override
	public void serChocado(Piedra e) {
		ataq.cambiarEstado(new AtaqueEnemigo(ataq));
		ataq.setEntidadADestruir(e);
	}

	@Override
	public void serChocado(Barro e) {
		
	}

	private Atacante quienSeFrena(Atacante p) {
		double x = ataq.getPos().getX();
		Atacante toret = ataq;
		noSeFrena = p;
		if (p.getPos().getX() > x) {
			toret = p;
			noSeFrena = ataq;
		}
		return toret;
	}

	private void frenar(Atacante p) {
		if (!(noSeFrena.puedoPasar())) {
			p.cambiarEstado(new ReposoEnemigo(p));
		}
	}

	@Override
	public void serChocado(Ninja e) {
		Atacante p = quienSeFrena(e);
		frenar(p);
	}

	@Override
	public void serChocado(Espadachin e) {
		Atacante p = quienSeFrena(e);
		frenar(p);
	}

	@Override
	public void serChocado(Arquero e) {
		Atacante p = quienSeFrena(e);
		frenar(p);
	}

	@Override
	public void serChocado(Ejecutor e) {
		Atacante p = quienSeFrena(e);
		frenar(p);
	}

	@Override
	public void serChocado(Necromante e) {
		Atacante p = quienSeFrena(e);
		frenar(p);
	}

	@Override
	public void serChocado(Emperador e) {
		Atacante p = quienSeFrena(e);
		frenar(p);
	}

	@Override
	public void serChocado(Muro m) {
		ataq.cambiarEstado(new AtaqueEnemigo(ataq));
		ataq.setEntidadADestruir(m);
		if(m.getLife() <= 0)
			m.morir();
	}
	
	@Override
	public void serChocado(Bombita m) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void serChocado(EscudoEnemigo e) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void serChocado(EscudoDef e) {
		ataq.morir();
		e.morir();
	}

	@Override
	public void serChocado(MunicionAtacante m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(MunicionDefensor m) {
		// TODO Auto-generated method stub
		
	}

}
