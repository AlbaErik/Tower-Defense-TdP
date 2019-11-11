package Logica.Colisionadores.Adistancia;

import Logica.Entidades.Atacantes.Arquero;
import Logica.Entidades.Atacantes.Ejecutor;
import Logica.Entidades.Atacantes.Emperador;
import Logica.Entidades.Atacantes.Espadachin;
import Logica.Entidades.Atacantes.Necromante;
import Logica.Entidades.Atacantes.Ninja;
import Logica.Entidades.Defensores.ArqueroElite;
import Logica.Entidades.Defensores.EspadachinElite;
import Logica.Entidades.Defensores.LanceroElite;
import Logica.Entidades.Defensores.NinjaElite;
import Logica.Entidades.Defensores.SacerdoteElite;
import Logica.Entidades.Defensores.SamuraiElite;
import Logica.Entidades.Municiones.Municion;
import Logica.Entidades.Obstaculos.ConVida.Piedra;
import Logica.Entidades.Obstaculos.Temporales.Barro;
import Logica.Entidades.Premios.EscudoDef;
import Logica.Entidades.Premios.EscudoEnemigo;
import Logica.Entidades.Premios.Muro;

public class ColCaminoLibreEnem extends VisitorDistancia{
	

	@Override
	public boolean serChocado(Ninja e) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean serChocado(Ejecutor e) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean serChocado(Necromante e) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean serChocado(Espadachin e) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean serChocado(Arquero e) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean serChocado(Emperador e) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean serChocado(ArqueroElite e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean serChocado(SacerdoteElite e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean serChocado(EspadachinElite e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean serChocado(LanceroElite e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean serChocado(NinjaElite e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean serChocado(SamuraiElite e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean serChocado(Piedra e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean serChocado(Barro barro) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean serChocado(Muro m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean serChocado(Municion m) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean serChocado(EscudoEnemigo e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean serChocado(EscudoDef e) {
		// TODO Auto-generated method stub
		return true;
	}

	

}
