package Logica.Entidades;

import Armas.Arma;
import Armas.ArmaSimple;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Mapa.Mapa;

public abstract class Personaje extends Entidad {
	protected int damage;
	protected int range;
	protected double attackSpeed;
	protected Arma arma;
	protected int contadorDisparos;
	protected int tiempoMuerte;
	protected int direccion;

	protected VisitorDistancia colCaminoLibre;

	public Personaje(int x, int y, Mapa m) {
		super(x, y, m);
		arma = new ArmaSimple(this, m);
		contadorDisparos = 0;
		tiempoMuerte = 20;
	}

	public VisitorDistancia getVisitorDistancia() {
		return colCaminoLibre;
	}

	public abstract int getDireccion();

	public void restarTiempoMuerte() {
		tiempoMuerte--;
	}

	public int getTiempoMuerte() {
		return tiempoMuerte;
	}

	public int getDamage() {
		return damage;
	}

	public int getRange() {
		return range;
	}

	public double getAttackSpeed() {
		return attackSpeed;
	}

	public abstract void atacar(Entidad aDestruir);

	public void perdioElJugador() {
		mapa.perdioElJugador();
	}
}
