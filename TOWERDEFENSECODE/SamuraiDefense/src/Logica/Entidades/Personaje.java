package Logica.Entidades;

import Armas.Arma;
import Armas.ArmaSimple;
import Logica.LargaVista;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Premios.EscudoEnemigo;
import Logica.Mapa.Mapa;

public abstract class Personaje extends Entidad {
	protected int damage;
	protected int range;
	protected Arma arma;
	protected int contadorDisparos;
	protected int tiempoMuerte;
	protected LargaVista colCaminoLibre;

	protected Personaje(int x, int y, Mapa m) {
		super(x, y, m);
		arma = new ArmaSimple(this, m);
		contadorDisparos = 0;
		tiempoMuerte = 20;
	}
	
	public void setCaminoLibre(boolean b) {
		colCaminoLibre.setCaminoLibre(b);
	}

	public VisitorDistancia getVisitorDistancia() {
		return colCaminoLibre.getVisitorDistancia();
	}
	
	public boolean getCaminoLibre() {
		return colCaminoLibre.getCaminoLibre();
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
