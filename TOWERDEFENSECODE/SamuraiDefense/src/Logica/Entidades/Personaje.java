package Logica.Entidades;

import Armas.Arma;
import Armas.ArmaSimple;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Mapa.Mapa;

public abstract class Personaje extends Entidad {
	protected int damage;
	protected int range;
	protected int contadorDisparos;
	protected int tiempoMuerte;
	protected boolean tengoCaminoLibre = true;
	protected Arma arma;
	protected VisitorDistancia visitorCaminoLibre;

	protected Personaje(int x, int y, Mapa m) {
		super(x, y, m);
		arma = new ArmaSimple(this, m);
		contadorDisparos = 0;
		tiempoMuerte = 20;
	}
	
	public void setCaminoLibre(boolean b) {
		tengoCaminoLibre = b;
	}

	public VisitorDistancia getVisitorDistancia() {
		return visitorCaminoLibre;
	}
	
	public boolean getCaminoLibre() {
		return tengoCaminoLibre;
	}
	
	public void superAtaque(Entidad e) {}

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

	public abstract void atacar(Entidad aDestruir);

	public void perdioElJugador() {
		mapa.perdioElJugador();
	}

}
