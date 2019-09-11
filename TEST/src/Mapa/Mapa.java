package Mapa;


public class Mapa{
	private Celda mapa[][];
	private static final int ancho=6;
	private static final int largo=10;
	
	public Mapa() {
		for(int i=0;i<ancho;i++) {
			for(int j=0;j<largo;j++) {
				mapa[i][j]=new Celda();
			}
		}	
	}
	
	public Celda[][] getMapa(){
		return mapa;
	}
	public int getAncho() {
		return ancho;
	}
	public int getLargo() {
		return largo;
	}

}
