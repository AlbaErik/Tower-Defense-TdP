package Logica.Colisionadores.ColisionadoresMunicion;

import Logica.Colisionadores.Colisionador;
import Logica.Entidades.Atacantes.Arquero;
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
import Logica.Entidades.Municiones.Municion;
import Logica.Entidades.Municiones.MunicionesAtacante.MunicionAtacante;
import Logica.Entidades.Municiones.MunicionesDefensor.MunicionDefensor;
import Logica.Entidades.Obstaculos.ConVida.Piedra;
import Logica.Entidades.Obstaculos.Temporales.Barro;
import Logica.Entidades.Premios.Bombita;
import Logica.Entidades.Premios.EscudoDef;
import Logica.Entidades.Premios.EscudoEnemigo;
import Logica.Entidades.Premios.Muro;

public class ColisionadorMunicionDef extends Colisionador{
	
	private Municion mun;

	public ColisionadorMunicionDef(Municion flechaDefensor) {
		mun = flechaDefensor;
	}

	@Override
	public void serChocado(Ninja e) {
		int da�o = mun.getDa�o();
		e.recibirDa�o(da�o);
		mun.morir();		
	}

	@Override
	public void serChocado(Ejecutor e) {
		int da�o = mun.getDa�o();
		e.recibirDa�o(da�o);
		mun.morir();		
	}

	@Override
	public void serChocado(Necromante e) {
		int da�o = mun.getDa�o();
		e.recibirDa�o(da�o);
		mun.morir();		
	}

	@Override
	public void serChocado(Espadachin e) {
		int da�o = mun.getDa�o();
		e.recibirDa�o(da�o);
		mun.morir();		
	}

	@Override
	public void serChocado(Arquero e) {
		int da�o = mun.getDa�o();
		e.recibirDa�o(da�o);
		mun.morir();		
	}
	
	@Override
	public void serChocado(Emperador e) {
		int da�o = mun.getDa�o();
		e.recibirDa�o(da�o);
		mun.morir();
		
	}


	@Override
	public void serChocado(ArqueroElite e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(SacerdoteElite e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(EspadachinElite e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(LanceroElite e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(NinjaElite e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(SamuraiElite e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Piedra e) {
		
	}

	@Override
	public void serChocado(Barro barro) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void serChocado(Muro m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(EscudoEnemigo e) {
		//mun.morir();
	}
	
	@Override
	public void serChocado(EscudoDef e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Bombita m) {
		// TODO Auto-generated method stub
		
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
