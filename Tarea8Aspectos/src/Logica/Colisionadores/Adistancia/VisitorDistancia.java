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
import Logica.Entidades.Premios.Bombita;
import Logica.Entidades.Premios.EscudoDef;
import Logica.Entidades.Premios.EscudoEnemigo;
import Logica.Entidades.Premios.Muro;
import Logica.Entidades.Premios.PocionFuerza;

/*
 * Determina si el personaje encontro o no un enemigo a distancia
 */
public abstract class VisitorDistancia {

	public abstract void serChocado(PocionFuerza pocionFuerza);

	public abstract void serChocado(Ninja ninja);

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

	public abstract void serChocado(Muro m);
	
	public abstract void serChocado(Municion m);
	
	public abstract void serChocado(EscudoEnemigo e);
	
	public abstract void serChocado(EscudoDef e);

	public abstract void serChocado(Bombita bombita);

	
}
