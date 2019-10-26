package Logica.Colisionadores.Adistancia;

import Logica.Colisionadores.Colisionador;
import Logica.Entidades.Atacantes.Arquero;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Atacantes.Ejecutor;
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
import Logica.Estados.Personajes.Atacante.AtaqueEnemigo;

public class ColADistanciaEnem extends Colisionador{
	
	protected Atacante ataq;
	
	public ColADistanciaEnem(Atacante a) {
		ataq = a;
	}

	@Override
	public void serChocado(Ninja e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Ejecutor e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Necromante e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Espadachin e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Arquero e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(ArqueroElite e) {
		ataq.cambiarEstado(new AtaqueEnemigo(ataq));
	}

	@Override
	public void serChocado(SacerdoteElite e) {
		ataq.cambiarEstado(new AtaqueEnemigo(ataq));
		
	}

	@Override
	public void serChocado(EspadachinElite e) {
		ataq.cambiarEstado(new AtaqueEnemigo(ataq));
		
	}

	@Override
	public void serChocado(LanceroElite e) {
		ataq.cambiarEstado(new AtaqueEnemigo(ataq));
		
	}

	@Override
	public void serChocado(NinjaElite e) {
		ataq.cambiarEstado(new AtaqueEnemigo(ataq));
		
	}

	@Override
	public void serChocado(SamuraiElite e) {
		ataq.cambiarEstado(new AtaqueEnemigo(ataq));
		
	}

	@Override
	public void serChocado(Piedra e) {
		ataq.cambiarEstado(new AtaqueEnemigo(ataq));
		
	}

	@Override
	public void serChocado(Barro barro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(FlechaAtacante flechaAtacante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(FlechaDefensor flechaAtacante) {
		// TODO Auto-generated method stub
		
	}

}
