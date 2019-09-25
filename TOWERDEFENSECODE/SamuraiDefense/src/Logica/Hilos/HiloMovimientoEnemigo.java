package Logica.Hilos;

import java.util.ArrayList;
import java.util.List;

import Logica.Entidades.Atacantes.Atacante;

public class HiloMovimientoEnemigo extends Thread {
	protected volatile List<Atacante> toInsert,toExecute;
	protected volatile boolean ejecutar;
	
	public HiloMovimientoEnemigo() {
		ejecutar=true;
		toExecute=new ArrayList<Atacante>();
		toInsert=new ArrayList<Atacante>();
	}
	
	public void agregarEnemigo(Atacante e){
		toExecute.add(e);
	}
	
	public void run() {
		while(ejecutar) {
			int x=toExecute.size();
			for(int i=0;i<x;i++) {
				toExecute.get(i).mover();
			}
		}
	}
	
}
