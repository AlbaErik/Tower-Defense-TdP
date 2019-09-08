package Clases;

public abstract class Entidad {
	protected int Life,x,y;
	
	public Entidad(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public abstract int getLife();
	public abstract void setLife(int lp);
	public int getx() {
		return x;
	}
	public void setx(int x) {
		this.x=x;
	}
	public int gety() {
		return y;
	}
	public void sety(int y) {
		this.y=y;
	}

}
