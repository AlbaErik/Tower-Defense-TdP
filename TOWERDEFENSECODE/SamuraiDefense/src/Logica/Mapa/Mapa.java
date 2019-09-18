package Logica.Mapa;

public class Mapa{
	private Celda[][] mapa;
	private static final int filas=6;
	private static final int columnas=10;
	
	public Mapa() {
		mapa=new Celda[filas][columnas];
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				mapa[i][j]=new Celda();
			}
		}	
	}
	/**
	 * Devuelve el ancho del mapa
	 * @return cantidad de filas del mapa
	 */
	public int getFilas() {
		return filas;
	}
	/**
	 * Devuelve el largo del mapa
	 * @return cantidad de columnas del mapa
	 */
	public int getColumnas() {
		return columnas;
	}

}
