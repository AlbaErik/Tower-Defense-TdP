package Logica.Colisionadores;

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
import Logica.Entidades.Obstaculos.ConVida.Piedra;
import Logica.Entidades.Obstaculos.Temporales.Barro;

/*
 * Retorna si puede o no avanzar la entidad en caso de toparse con cualquiera de estas.
 */
public class ColisionadorADistancia {

	
	public boolean serChocado(Ninja e) {
		return false;
	}

	
	public boolean serChocado(Ejecutor e) {
		return false;		
	}

	
	public boolean serChocado(Necromante e) {
		return false;		
	}

	
	public boolean serChocado(Espadachin e) {
		return false;		
	}

	
	public boolean serChocado(Arquero e) {
		return false;		
	}

	
	public boolean serChocado(ArqueroElite e) {
		return false;		
	}

	
	public boolean serChocado(EmperadorReal e) {
		return false;		
	}

	
	public boolean serChocado(EspadachinElite e) {
		return false;		
	}

	
	public boolean serChocado(LanceroElite e) {
		return false;		
	}

	
	public boolean serChocado(NinjaElite e) {
		return false;		
	}

	
	public boolean serChocado(SamuraiElite e) {
		return false;		
	}

	
	public boolean serChocado(Piedra e) {
		return false;		
	}

	
	public boolean serChocado(Barro barro) {
		return true;		
	}

	
	public boolean serChocado(FlechaAtacante flechaAtacante) {
		return true;		
	}

	
	public boolean serChocado(FlechaDefensor flechaAtacante) {
		return true;		
	}

}
