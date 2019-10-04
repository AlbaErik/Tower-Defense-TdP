package Logica.Entidades.Atacantes;

import Logica.Entidades.Personaje;
import Logica.Mapa.Mapa;

public abstract class Atacante extends Personaje {
	protected int movementSpeed;

	public Atacante(int x, int y, Mapa m) {
		super(x, y, m);
	}

}
