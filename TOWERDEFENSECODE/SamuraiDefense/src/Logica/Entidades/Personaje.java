package Logica.Entidades;

import Armas.Arma;
import Logica.Mapa.Mapa;


public abstract class Personaje extends Entidad {
	protected int damage;
	protected int range;
	protected int attackSpeed;
	protected Arma Weapon;
	protected int contadorDisparos;
	protected int tiempoMuerte;
	protected int direccion;
	
	public Personaje(int x,int y, Mapa m) {
		super(x,y,m);
		contadorDisparos = 0;
		tiempoMuerte = 20;
	}
	
	public abstract int getDireccion();
	
	public void restarTiempoMuerte() {
		tiempoMuerte--;
	}
	
	public int getTiempoMuerte() {
		return tiempoMuerte;
	}
	
	public  int getDamage() {
		return damage;
	}
	
	public  int getRange() {
		return range;
	}
	
	public  int getAttackSpeed() {
		return attackSpeed;
	}
	
	public abstract void atacar(Entidad aDestruir);
}
