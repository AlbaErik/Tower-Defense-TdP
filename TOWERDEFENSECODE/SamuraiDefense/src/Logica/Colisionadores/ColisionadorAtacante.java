package Logica.Colisionadores;

import Logica.Entidades.Personaje;
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
import Logica.Entidades.Municiones.MunicionesAtacante.FlechaAtacante;
import Logica.Entidades.Municiones.MunicionesDefensor.FlechaDefensor;
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
	private Personaje noSeFrena;

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

	private Personaje quienSeFrena(Personaje p) {
		double x = ataq.getPos().getX();
		Personaje toret = ataq;
		noSeFrena = p;
		if (p.getPos().getX() > x) {
			toret = p;
			noSeFrena = ataq;
		}
		return toret;
	}

	private void frenar(Personaje p) {
		// Personaje noSeFrena = (p == ataq ? );
		if (!(noSeFrena.puedoPasar())) {
			// System.out.println("COLISIONADOR ATACANTE--- estado de p: " + p.getEstado());
			p.cambiarEstado(new ReposoEnemigo(p));
		}
	}

	@Override
	public void serChocado(Ninja e) {
		Personaje p = quienSeFrena(e);
		frenar(p);
	}

	@Override
	public void serChocado(Espadachin e) {
		Personaje p = quienSeFrena(e);
		frenar(p);
	}

	@Override
	public void serChocado(Arquero e) {
		Personaje p = quienSeFrena(e);
		frenar(p);
	}

	@Override
	public void serChocado(Ejecutor e) {
		Personaje p = quienSeFrena(e);
		frenar(p);
	}

	@Override
	public void serChocado(Necromante e) {
		Personaje p = quienSeFrena(e);
		frenar(p);
	}

	@Override
	public void serChocado(Emperador e) {
		Personaje p = quienSeFrena(e);
		frenar(p);
	}

	public void serChocado(FlechaAtacante flechaAtacante) {

	}

	@Override
	public void serChocado(FlechaDefensor f) {

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
		System.out.println("ColisionadorAtacante---me choque con escudo enemigo mato a mi atacante");
		ataq.morir();
	}

}
