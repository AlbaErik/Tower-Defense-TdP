package Logica.Colisionadores.Premios;

import Logica.Colisionadores.Colisionador;
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
import Logica.Entidades.Municiones.MunicionesAtacante.MunicionAtacante;
import Logica.Entidades.Municiones.MunicionesDefensor.MunicionDefensor;
import Logica.Entidades.Obstaculos.ConVida.Piedra;
import Logica.Entidades.Obstaculos.Temporales.Barro;
import Logica.Entidades.Premios.Bombita;
import Logica.Entidades.Premios.EscudoDef;
import Logica.Entidades.Premios.EscudoEnemigo;
import Logica.Entidades.Premios.Muro;

public class VisitorEscudoEnemigo extends Colisionador{
	
	private EscudoEnemigo escudo;
	private int cont = 0;
	
	public VisitorEscudoEnemigo(EscudoEnemigo esc) {
		escudo = esc;
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
	public void serChocado(Emperador e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(ArqueroElite e) {
		escudo.morir();		
	}

	@Override
	public void serChocado(SacerdoteElite e) {
		escudo.morir();		
	}

	@Override
	public void serChocado(EspadachinElite e) {
		escudo.morir();		
	}

	@Override
	public void serChocado(LanceroElite e) {
		escudo.morir();		
	}

	@Override
	public void serChocado(NinjaElite e) {
		escudo.morir();		
	}

	@Override
	public void serChocado(SamuraiElite e) {
		escudo.morir();		
	}

	@Override
	public void serChocado(Piedra e) {
		escudo.morir();
		e.morir();
	}

	@Override
	public void serChocado(Barro barro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Muro m) {
		m.morir();
		escudo.morir();
	}

	@Override
	public void serChocado(EscudoEnemigo e) {

	}

	@Override
	public void serChocado(Bombita m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(EscudoDef e) {
		e.morir();		
	}

	@Override
	public void serChocado(MunicionAtacante m) {
		
	}

	@Override
	public void serChocado(MunicionDefensor m) {
		m.morir();
		cont++;
		if(cont >=3)
			escudo.morir();
	}

}
