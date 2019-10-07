package Logica.Colisionadores;

import Logica.Entidades.Atacantes.Arquero;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Atacantes.Espadachin;
import Logica.Entidades.Atacantes.Ninja;
import Logica.Entidades.Defensores.ArqueroElite;
import Logica.Entidades.Defensores.EmperadorReal;
import Logica.Entidades.Defensores.EspadachinElite;
import Logica.Entidades.Defensores.LanceroElite;
import Logica.Entidades.Defensores.NinjaElite;
import Logica.Entidades.Defensores.SamuraiElite;
import Logica.Entidades.Obstaculos.Barro;
import Logica.Entidades.Obstaculos.Piedra;

public class ColisionadorAtacante extends Colisionador{
	
	private Atacante ataq;
	
	public ColisionadorAtacante(Atacante a) {
		ataq = a;
	}

	@Override
	public void serChocado(Ninja e) {
		e.mover(false);
	}

	@Override
	public void serChocado(ArqueroElite e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(EmperadorReal e) {
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Barro barro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Espadachin espadachin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Arquero arquero) {
		// TODO Auto-generated method stub
		
	}


}
