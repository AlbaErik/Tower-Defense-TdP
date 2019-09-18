package Logica.Entidades.Defensores;

import Logica.Mapa.Celda;

public class EspadachinElite extends Defensor {
	
	public EspadachinElite(Celda c) {
		super(c);
		this.life=300;
		this.damage=50;
		this.attackSpeed=2;
		this.range=1;
		this.cost=30;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.cost;
	}

	@Override
	public int getDamage(){
		// TODO Auto-generated method stub
		return this.damage;
	}

	@Override
	public int getRange() {
		// TODO Auto-generated method stub
		return this.range;
	}

	@Override
	public int getAttackSpeed() {
		// TODO Auto-generated method stub
		return this.attackSpeed;
	}
	

	@Override
	public int getLife() {
		// TODO Auto-generated method stub
		return this.life;
	}

	@Override
	public void setLife(int l) {
		// TODO Auto-generated method stub
		this.life=l;
	}

}
