package Mapa;

import Grafica.MapaGrafico;

public class Mapa{
	
	int altoCelda = 100;
	int anchoCelda = 100;
	
	private Celda mapa[][];
	private int ancho,largo;
	
	//AGREGAR FUNCION GETINFORMACION ASI EL MAPA NOS DEVUELVE ARREGLO DE 3 CELDAS, ADELANTE,MEDIO,ATRAS;
	private MapaGrafico mGrafico;
	
	public Mapa(int a,int l) {
		mGrafico = new MapaGrafico();
		ancho=a;
		largo=l;
		mapa = new Celda[a][l];
		
		for(int i=0; i < largo; i++) {
			for(int j=0; j < ancho; j++) {
				mapa[i][j]= new Celda(this, i, j, anchoCelda, altoCelda);
			}
		}
	}
	
	public MapaGrafico getMapaGrafico() {
		return mGrafico;
	}
	
	
	

}
