package Logica.Estados.Objetos;

import Logica.Entidades.Obstaculos.ConVida.ObstaculoConVida;

public class PiedraBaja extends EstadoObjeto {

	public PiedraBaja(ObstaculoConVida e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejecutar() {
		
		obs.getGrafico().vidaBaja(); 		
		if(obs.getLife() <= 0) {
			obs.morir();
		}
		
	}

}
