package Mapa;

public class Mapa{
	private Celda mapa[][];
	private int ancho,largo;
	//FUNCION GETINFORMACION ASI EL MAPA NOS DEVUELVE ARREGLO DE 3 CELDAS, ADELANTE,MEDIO,ATRAS;
	
	public Mapa(int a,int l) {
		ancho=a;
		largo=l;
		
		for(int i=0;i<largo;i++) {
			for(int j=0;i<ancho;j++) {
				mapa[i][j]=new Celda(this,i,j);
			}
		}
	}
	
	
	
	

}
