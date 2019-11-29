package Logica.Entidades.Defensores;

import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Colisionadores.Adistancia.ColCaminoLibreDef;
import Logica.Entidades.Personaje;
import Logica.Estados.Personajes.Defensor.EstadoDefensor;
import Logica.Estados.Personajes.Defensor.ReposoDefensor;

import Logica.Inteligencia.InteligenciaDefensor;
import Logica.Mapa.Mapa;

public abstract class Defensor extends Personaje {
	protected int cost;
	protected int vida;

	protected Defensor(int x, int y, Mapa m) {
		super(x, y, m);

		visitorCaminoLibre = new ColCaminoLibreDef(this);
		intel = new InteligenciaDefensor(this);
		estado = new ReposoDefensor(this);
		col = new ColisionadorDefensor(this);
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();
	}

	public void cambiarAEstadoAtaque() {
		if (permisoCambiarEstado) {
			((EstadoDefensor) estado).cambiarEstadoAtaque();
		}
	}

	public void cambiarASuperEstado() {
		if (permisoCambiarEstado)
			((EstadoDefensor) estado).cambiarAPoderoso();
	}

	public int getDireccion() {
		return 1;
	}

	public int getCost() {
		return cost;
	}
	
	public int getVida() {
		return vida;
	}

}
