package Logica.Colisionadores;

import Logica.Entidades.Atacantes.*;
import Logica.Entidades.Defensores.*;
import Logica.Entidades.Municiones.MunicionesAtacante.MunicionAtacante;
import Logica.Entidades.Municiones.MunicionesDefensor.MunicionDefensor;
import Logica.Entidades.Obstaculos.ConVida.Piedra;
import Logica.Entidades.Obstaculos.Temporales.Barro;
import Logica.Entidades.Premios.Bombita;
import Logica.Entidades.Premios.EscudoDef;
import Logica.Entidades.Premios.EscudoEnemigo;
import Logica.Entidades.Premios.Muro;

public abstract class Colisionador {
		
	public abstract void serChocado(Ninja e);
	public abstract void serChocado(Ejecutor e);
	public abstract void serChocado(Necromante e);
	public abstract void serChocado(Espadachin e);
	public abstract void serChocado(Arquero e);
	public abstract void serChocado(Emperador e);
	

	public abstract void serChocado(ArqueroElite e);
	public abstract void serChocado(SacerdoteElite e);
	public abstract void serChocado(EspadachinElite e);
	public abstract void serChocado(LanceroElite e);
	public abstract void serChocado(NinjaElite e);
	public abstract void serChocado(SamuraiElite e);

	public abstract void serChocado(Piedra e);
	public abstract void serChocado(Barro barro);

	public abstract void serChocado(MunicionAtacante m);
	public abstract void serChocado(MunicionDefensor m);
		
	public abstract void serChocado(Muro m);
	public abstract void serChocado(EscudoDef e);
	public abstract void serChocado(EscudoEnemigo e);

	public abstract void serChocado(Bombita m);


}
