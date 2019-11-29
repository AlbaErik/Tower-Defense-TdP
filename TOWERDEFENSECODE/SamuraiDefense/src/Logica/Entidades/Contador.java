package Logica.Entidades;

public class Contador {
	private int contador = 0;
	
	public void incrementarContador() {
		contador ++;
	}
	
	public void setContador(int c) {
		contador = c;
	}
	
	public int getContador() {
		return contador;
	}
	
	public void resetContador() {
		contador = 0;
	}
}
