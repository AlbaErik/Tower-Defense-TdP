package Logica.Colisionadores.ColisionadoresMunicion;

import Logica.Colisionadores.Colisionador;
import Logica.Entidades.Atacantes.Arquero;
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
import Logica.Entidades.Municiones.Municion;
import Logica.Entidades.Municiones.MunicionesAtacante.FlechaAtacante;
import Logica.Entidades.Municiones.MunicionesDefensor.FlechaDefensor;
import Logica.Entidades.Obstaculos.ConVida.Piedra;
import Logica.Entidades.Obstaculos.Temporales.Barro;

public class ColisionadorMunicionAtaq extends Colisionador{
	
	private Municion mun;
	
	public ColisionadorMunicionAtaq(Municion m) {
		mun = m;
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
		int daño = mun.getDaño();
		e.setLife(daño);
		mun.morir();			
	}

	@Override
	public void serChocado(EmperadorReal e) {
		int daño = mun.getDaño();
		e.setLife(daño);
		mun.morir();			
	}

	@Override
	public void serChocado(EspadachinElite e) {
		int daño = mun.getDaño();
		e.setLife(daño);
		mun.morir();			
	}

	@Override
	public void serChocado(LanceroElite e) {
		int daño = mun.getDaño();
		e.setLife(daño);
		mun.morir();			
	}

	@Override
	public void serChocado(NinjaElite e) {
		int daño = mun.getDaño();
		e.setLife(daño);
		mun.morir();			
	}

	@Override
	public void serChocado(SamuraiElite e) {
		int daño = mun.getDaño();
		e.setLife(daño);
		mun.morir();			
	}

	@Override
	public void serChocado(Piedra e) {
		int daño = mun.getDaño();
		e.setLife(daño);
		mun.morir();		
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
