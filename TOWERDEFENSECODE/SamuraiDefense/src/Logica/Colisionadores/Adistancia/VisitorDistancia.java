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
import Logica.Entidades.Municiones.MunicionesAtacante.FlechaAtacante;
import Logica.Entidades.Municiones.MunicionesAtacante.LanzaAtacante;
import Logica.Entidades.Municiones.MunicionesAtacante.ShurikenAtacante;
import Logica.Entidades.Municiones.MunicionesDefensor.FlechaDefensor;
import Logica.Entidades.Municiones.MunicionesDefensor.LanzaDefensor;
import Logica.Entidades.Municiones.MunicionesDefensor.ShurikenDefensor;
import Logica.Entidades.Obstaculos.ConVida.Piedra;
import Logica.Entidades.Obstaculos.Temporales.Barro;
import Logica.Entidades.Premios.Muro;

/*
 * Determina si el personaje encontro o no un enemigo a distancia
 */
public abstract class VisitorDistancia {

	
	public abstract boolean serChocado(Ninja e);

	
	public abstract boolean serChocado(Ejecutor e);

	
	public abstract boolean serChocado(Necromante e);

	
	public abstract boolean serChocado(Espadachin e);

	
	public abstract boolean serChocado(Arquero e);

	
	public abstract boolean serChocado(Emperador e);

	
	public abstract boolean serChocado(ArqueroElite e);

	
	public abstract boolean serChocado(SacerdoteElite e);

	
	public abstract boolean serChocado(EspadachinElite e);

	
	public abstract boolean serChocado(LanceroElite e);

	
	public abstract boolean serChocado(NinjaElite e);

	
	public abstract boolean serChocado(SamuraiElite e);

	
	public abstract boolean serChocado(Piedra e);

	
	public abstract boolean serChocado(Barro barro);
	
	public abstract boolean serChocado(Muro m);

	
	public abstract boolean serChocado(FlechaAtacante flechaAtacante);

	
	public abstract boolean serChocado(FlechaDefensor flechaAtacante);


	public abstract boolean serChocado(ShurikenAtacante shurikenAtacante);


	public abstract boolean serChocado(LanzaAtacante lanzaAtacante);


	public abstract boolean serChocado(ShurikenDefensor shurikenDefensor);


	public abstract boolean serChocado(LanzaDefensor lanzaDefensor);
}
