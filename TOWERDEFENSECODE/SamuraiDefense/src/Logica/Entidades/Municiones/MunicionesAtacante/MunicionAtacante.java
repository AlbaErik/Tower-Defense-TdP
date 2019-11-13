package Logica.Entidades.Municiones.MunicionesAtacante;

import Logica.Colisionadores.ColisionadoresMunicion.ColisionadorMunicionAtaq;
import Logica.Entidades.Municiones.Municion;
import Logica.Inteligencia.InteligenciaMunicionAtaq;
import Logica.Mapa.Mapa;

public abstract class MunicionAtacante extends Municion{

	protected MunicionAtacante(int x, int y, Mapa m) {
		super(x, y, m);
		intel = new InteligenciaMunicionAtaq(this);
		col = new ColisionadorMunicionAtaq(this);

	}
}
