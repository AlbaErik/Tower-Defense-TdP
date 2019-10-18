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
		
		((ObstaculoGrafico) obs.getGrafico()).vidaBaja(); 		
		if(obs.getLife() <= 0) {
			obs.morir();
		}
		
	}

}
