package Logica.Colisionadores;

import Logica.Entidades.Atacantes.Arquero;
import Logica.Entidades.Atacantes.Ejecutor;
import Logica.Entidades.Atacantes.Emperador;
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
import Logica.Entidades.Premios.Bombita;
import Logica.Entidades.Premios.Escudo;
import Logica.Entidades.Premios.EscudoEnemigo;
import Logica.Entidades.Premios.Muro;
import Logica.Estados.Personajes.Defensor.AtaqueDefensor;

public class ColisionadorDefensor extends Colisionador {

	private Defensor d;

	public ColisionadorDefensor(Defensor def) {
		d = def;
	}

	@Override
	public void serChocado(ArqueroElite e) {
		// e.cambiarEstado(new AtaqueDefensor(e));
	}

	@Override
	public void serChocado(SacerdoteElite e) {
		// e.cambiarEstado(new AtaqueDefensor(e));
	}

	@Override
	public void serChocado(EspadachinElite e) {
		// e.cambiarEstado(new AtaqueDefensor(e));
	}

	@Override
	public void serChocado(LanceroElite e) {
		// e.cambiarEstado(new AtaqueDefensor(e));
	}

	@Override
	public void serChocado(NinjaElite e) {
		// e.cambiarEstado(new AtaqueDefensor(e));
	}

	@Override
	public void serChocado(SamuraiElite e) {

		// e.cambiarEstado(new AtaqueDefensor(e));
	}

	@Override
	public void serChocado(Piedra e) {

	}

	@Override
	public void serChocado(Barro barro) {
		// TODO Auto-generated method stub

	}

	@Override
	public void serChocado(Ninja e) {
		d.cambiarEstado(new AtaqueDefensor(d));
		d.setEntidadADestruir(e);
	}

	@Override
	public void serChocado(Espadachin e) {
		d.cambiarEstado(new AtaqueDefensor(d));
		d.setEntidadADestruir(e);
	}

	@Override
	public void serChocado(Arquero e) {
		d.cambiarEstado(new AtaqueDefensor(d));
	}

	@Override
	public void serChocado(Ejecutor e) {
		d.cambiarEstado(new AtaqueDefensor(d));
		d.setEntidadADestruir(e);
	}

	@Override
	public void serChocado(Necromante e) {
		d.cambiarEstado(new AtaqueDefensor(d));
		d.setEntidadADestruir(e);
	}

	@Override
	public void serChocado(Emperador e) {
		d.cambiarEstado(new AtaqueDefensor(d));
		d.setEntidadADestruir(e);
	}

	public void serChocado(FlechaAtacante e) {

	}

	@Override
	public void serChocado(FlechaDefensor flechaAtacante) {
	}

	@Override
	public void serChocado(Muro m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(Escudo e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serChocado(EscudoEnemigo e) {
		System.out.println("ColisionadorDefensor---me choque con escudo enemigo mato a mi defensor");
		d.morir();
	}

	@Override
	public void serChocado(Bombita m) {
		// TODO Auto-generated method stub
		
	}

}
