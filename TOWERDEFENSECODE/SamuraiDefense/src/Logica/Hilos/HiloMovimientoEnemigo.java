package Logica.Hilos;

import java.util.ArrayList;
import java.util.List;

import Logica.Entidades.Atacantes.Atacante;

public class HiloMovimientoEnemigo extends Thread {
	protected volatile List<Atacante> toInsert, toExecute;
	protected volatile boolean ejecutar;

	public HiloMovimientoEnemigo() {
		ejecutar = true;
		toExecute = new ArrayList<Atacante>();
		toInsert = new ArrayList<Atacante>();
	}

	public void agregarEnemigo(Atacante e) {
		toExecute.add(e);
	}

	public void run() {
		Atacante ninja = toExecute.get(0);
		int y = (int) ninja.getPos().getY();
		for (int i = 800; i > 0; i = i - 3) {
			ninja.cambiarPosLogica(i, y);
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
