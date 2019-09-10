package entidad;


public abstract class Personaje extends Entidad {
	protected int Damage;
	protected int Range;
	protected int AttackSpeed;
	//protected Arma Weapon;
	
	public Personaje(int x, int y) {
		super(x, y);
	}

		
	public abstract int getDamage();
	
	public abstract int getRange();
	
	public abstract int getAttackSpeed();
}
