package Logica.Entidades.Municiones.MunicionesDefensor;

import Logica.Colisionadores.ColisionadoresMunicion.ColisionadorMunicionDef;
import Logica.Entidades.Municiones.Municion;
import Logica.Inteligencia.InteligenciaMunicionDef;
import Logica.Mapa.Mapa;

public abstract class MunicionDefensor extends Municion {

	protected MunicionDefensor(int x, int y, Mapa m) {
		super(x, y, m);
		intel = new InteligenciaMunicionDef(this);
		col = new ColisionadorMunicionDef(this);
	}
}
