package Logica.Estados.Objetos;

import Grafica.Entidades.Obstaculos.VidaFinita.ObstaculoGrafico;
import Logica.Entidades.Obstaculos.Obstaculo;

public class PiedraBaja extends EstadoObjeto {

	public PiedraBaja(Obstaculo e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejecutar() {
		System.out.println("Vida de la piedra: " + obs.getLife());

		System.out.println("Vida de la piedra: " + obs.getLife());
		((ObstaculoGrafico) obs.getGrafico()).vidaBaja(); 		
		if(obs.getLife() <= 0) {
			obs.morir();
		}
		
	}

}
