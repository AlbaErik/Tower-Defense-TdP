package Logica.Entidades;

import Logica.Mapa.Celda;

public abstract class Personaje extends Entidad {
	protected int damage;
	protected int range;
	protected int attackSpeed;
	//protected Arma Weapon;
	
	public Personaje(Celda c) {
		super(c);
	}

		
	public abstract int getDamage();
	
	public abstract int getRange();
	
	public abstract int getAttackSpeed();
}