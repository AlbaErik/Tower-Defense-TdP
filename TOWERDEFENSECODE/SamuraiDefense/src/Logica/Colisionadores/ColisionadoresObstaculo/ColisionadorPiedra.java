package Logica.Colisionadores.ColisionadoresObstaculo;

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
import Logica.Entidades.Municiones.MunicionesAtacante.FlechaAtacante;
import Logica.Entidades.Municiones.MunicionesDefensor.FlechaDefensor;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Entidades.Obstaculos.ConVida.Piedra;
import Logica.Entidades.Obstaculos.Temporales.Barro;

public class ColisionadorPiedra extends Colisionador {
	
	private Obstaculo obs;
	
	public ColisionadorPiedra(Obstaculo o) {
		obs = o;
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
		double x = obs.getPos().getX() - obs.getPos().getAncho()/2;
		int y = (int) obs.getPos().getY();
		obs.cambiarPosLogica(x, y);
		
		x = obs.getPos().getX() + obs.getPos().getAncho()/2;
		y = (int) obs.getPos().getY();
		e.cambiarPosLogica(x, y);
		
	}

	@Override
	public void serChocado(Barro barro) {
		// TODO Auto-generated method stub

	}

	@Override
	public void serChocado(FlechaAtacante f) {
		
	}

	@Override
	public void serChocado(FlechaDefensor flechaAtacante) {
		// TODO Auto-generated method stub
		
	}

}
