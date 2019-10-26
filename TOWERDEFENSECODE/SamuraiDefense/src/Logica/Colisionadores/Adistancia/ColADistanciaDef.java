package Logica.Colisionadores.Adistancia;

import Logica.Colisionadores.Colisionador;
import Logica.Entidades.Atacantes.Arquero;
import Logica.Entidades.Atacantes.Ejecutor;
import Logica.Entidades.Atacantes.Espadachin;
import Logica.Entidades.Atacantes.Necromante;
import Logica.Entidades.Atacantes.Ninja;
import Logica.Entidades.Defensores.ArqueroElite;
import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Defensores.SacerdoteElite;
import Logica.Entidades.Defensores.EspadachinElite;
import Logica.Entidades.Defensores.LanceroElite;
import Logica.Entidades.Defensores.NinjaElite;
import Logica.Entidades.Defensores.SamuraiElite;
import Logica.Entidades.Municiones.MunicionesAtacante.FlechaAtacante;
import Logica.Entidades.Municiones.MunicionesDefensor.FlechaDefensor;
import Logica.Entidades.Obstaculos.ConVida.Piedra;
import Logica.Entidades.Obstaculos.Temporales.Barro;
import Logica.Estados.Personajes.Defensor.AtaqueDefensor;

/*
 * Cambia el estado de la entidad de acuerdo con la entidad que detecta a distancia.
 */
public class ColADistanciaDef extends Colisionador{

	private Defensor def;
	
	public ColADistanciaDef(Defensor d) {
		def = d;
	}
	
	@Override
	public void serChocado(Ninja e) {
		def.cambiarEstado(new AtaqueDefensor(def));
	}

	@Override
	public void serChocado(Ejecutor e) {
		def.cambiarEstado(new AtaqueDefensor(def));
		
	}

	@Override
	public void serChocado(Necromante e) {
		def.cambiarEstado(new AtaqueDefensor(def));
		
	}

	@Override
	public void serChocado(Espadachin e) {
		def.cambiarEstado(new AtaqueDefensor(def));
		
	}

	@Override
	public void serChocado(Arquero e) {
		def.cambiarEstado(new AtaqueDefensor(def));
		
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
		// TODO Auto-generated method stub
		
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
