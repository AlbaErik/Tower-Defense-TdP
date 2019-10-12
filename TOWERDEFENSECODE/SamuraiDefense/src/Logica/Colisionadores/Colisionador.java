package Logica.Colisionadores;

import Logica.Entidades.Atacantes.*;
import Logica.Entidades.Defensores.*;
import Logica.Entidades.Municiones.MunicionesAtacante.FlechaAtacante;
import Logica.Entidades.Municiones.MunicionesDefensor.FlechaDefensor;
import Logica.Entidades.Obstaculos.Temporales.Barro;
import Logica.Entidades.Obstaculos.VidaFinita.Piedra;

public abstract class Colisionador {
		
	public abstract void serChocado(Ninja e);
	public abstract void serChocado(Ejecutor e);
	public abstract void serChocado(Necromante e);
	public abstract void serChocado(Espadachin espadachin);
	public abstract void serChocado(Arquero arquero);
	
	public abstract void serChocado(ArqueroElite e);
	public abstract void serChocado(EmperadorReal e);
	public abstract void serChocado(EspadachinElite e);
	public abstract void serChocado(LanceroElite e);
	public abstract void serChocado(NinjaElite e);
	public abstract void serChocado(SamuraiElite e);
	
	public abstract void serChocado(Piedra e);
	public abstract void serChocado(Barro barro);
	
	public abstract void serChocado(FlechaAtacante e);
	public abstract void serChocado(FlechaDefensor e);
	



}
