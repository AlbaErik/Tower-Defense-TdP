package entidad;

public class EspadachinElite extends Defensor {
	
	public EspadachinElite(int x,int y) {
		super(x,y);
		this.Life=300;
		this.Damage=50;
		this.AttackSpeed=2;
		this.Range=1;
		this.Cost=30;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.Cost;
	}

	@Override
	public int getDamage(){
		// TODO Auto-generated method stub
		return this.Damage;
	}

	@Override
	public int getRange() {
		// TODO Auto-generated method stub
		return this.Range;
	}

	@Override
	public int getAttackSpeed() {
		// TODO Auto-generated method stub
		return this.AttackSpeed;
	}
	

	@Override
	public int getLife() {
		// TODO Auto-generated method stub
		return this.Life;
	}

	@Override
	public void setLife(int l) {
		// TODO Auto-generated method stub
		this.Life=l;
	}

}
