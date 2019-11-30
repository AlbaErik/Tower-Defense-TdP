package Logica.Estados.Objetos;

import Logica.Entidades.Obstaculos.ConVida.ObstaculoConVida;

public class PiedraMedia extends EstadoObjeto {

	public PiedraMedia(ObstaculoConVida e) {
		super(e);
	}

	@Override
	public void ejecutar() {

		obs.getGrafico().vidaMedia();
		if (obs.getLife() < 100 && obs.getLife() >= 50) {
			obs.cambiarEstado(new PiedraBaja(obs));
		}
		
		if(obs.getLife() <= 0) {
			obs.morir();
		}
	}

}
