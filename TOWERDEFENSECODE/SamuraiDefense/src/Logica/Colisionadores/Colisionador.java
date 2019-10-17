package Logica.Colisionadores;

import Logica.Entidades.Atacantes.*;
import Logica.Entidades.Defensores.*;
import Logica.Entidades.Municiones.MunicionesAtacante.FlechaAtacante;
import Logica.Entidades.Municiones.MunicionesDefensor.FlechaDefensor;
import Logica.Entidades.Obstaculos.ConVida.Piedra;
import Logica.Entidades.Obstaculos.Temporales.Barro;

public abstract class Colisionador {
		
	public abstract void serChocado(Ninja e);
	public abstract void serChocado(Ejecutor e);
	public abstract void serChocado(Necromante e);
	public abstract void serChocado(Espadachin e);
	public abstract void serChocado(Arquero e);
	

	public abstract void serChocado(ArqueroElite e);
	public abstract void serChocado(EmperadorReal e);
	public abstract void serChocado(EspadachinElite e);
	public abstract void serChocado(LanceroElite e);
	public abstract void serChocado(NinjaElite e);
	public abstract void serChocado(SamuraiElite e);

	public abstract void serChocado(Piedra e);
	public abstract void serChocado(Barro barro);

	public abstract void serChocado(FlechaAtacante flechaAtacante);
	public abstract void serChocado(FlechaDefensor flechaAtacante);
	



}
