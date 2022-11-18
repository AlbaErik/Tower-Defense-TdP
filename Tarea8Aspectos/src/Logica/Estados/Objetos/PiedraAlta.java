package Logica.Estados.Objetos;

import Logica.Entidades.Obstaculos.ConVida.ObstaculoConVida;

public class PiedraAlta extends EstadoObjeto {

	public PiedraAlta(ObstaculoConVida e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejecutar() {
		obs.getGrafico().vidaAlta(); 		
		if (obs.getLife() < 200 && obs.getLife() >= 100) {
			obs.cambiarEstado(new PiedraMedia(obs));
		}
		
		if(obs.getLife() <= 0) {
			obs.morir();
		}
	}

}
