package Logica.Entidades.Defensores;

import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Colisionadores.Adistancia.ColCaminoLibreDef;
import Logica.Colisionadores.VisitorsDeEstados.VisitorDeEstados;
import Logica.Colisionadores.VisitorsDeEstados.VisitorEstadoAtaque;
import Logica.Colisionadores.VisitorsDeEstados.VisitorEstadoFuerza;
import Logica.Entidades.Contador;
import Logica.Entidades.Personaje;
import Logica.Estados.Personajes.Defensor.ReposoDefensor;
import Logica.Estados.Personajes.Defensor.SuperReposoDefensor;
import Logica.Inteligencia.InteligenciaDefensor;
import Logica.Mapa.Mapa;

public abstract class Defensor extends Personaje {
	protected int cost;
	protected int vida;
	protected VisitorDeEstados visitorFuerza;
	protected VisitorDeEstados visitorAtaque;

	protected Defensor(int x, int y, Mapa m) {
		super(x, y, m);

		visitorCaminoLibre = new ColCaminoLibreDef(this);
		intel = new InteligenciaDefensor(this);
		estado = new SuperReposoDefensor(this, new Contador());
		col = new ColisionadorDefensor(this);
		visitorFuerza = new VisitorEstadoFuerza();
		visitorAtaque = new VisitorEstadoAtaque();
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();
	}

	/*
	 * Sirve para cambiar a un estado ataque independientemente del actual
	 */
	public void cambiarAEstadoAtaque() {
		if (permisoCambiarEstado) {
			estado.aceptarVisitorEstados(visitorAtaque);
			//((EstadoDefensor) estado).cambiarEstadoAtaque();
		}
	}

	/*
	 * Sirve para cambiar de cualquier estado a uno SUPER cuando se usa la Pocion de Fuerza
	 */
	public void cambiarASuperEstado() {
		if (permisoCambiarEstado) {
			estado.aceptarVisitorEstados(visitorFuerza);
			//((EstadoDefensor) estado).cambiarAPoderoso();
		}			
	}

	public int getDireccion() {
		return 1;
	}

	public int getCost() {
		return cost;
	}

	public void eliminarPorBoton() {
		if (life <= vida && life > vida / 2)
			mapa.actualizarOroTienda(cost);
		if (life <= vida / 2)
			mapa.actualizarOroTienda(cost / 2);
		mapa.eliminarEntidad(this);
	}
}
