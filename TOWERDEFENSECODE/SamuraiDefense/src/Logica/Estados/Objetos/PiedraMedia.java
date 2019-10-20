package Logica.Estados.Objetos;

import Grafica.Entidades.Obstaculos.VidaFinita.ObstaculoGrafico;
import Logica.Entidades.Entidad;
import Logica.Entidades.Obstaculos.Obstaculo;

public class PiedraMedia extends EstadoObjeto {

	public PiedraMedia(Obstaculo e) {
		super(e);
	}

	@Override
	public void ejecutar() {

		((ObstaculoGrafico) obs.getGrafico()).vidaMedia();
		if (obs.getLife() < 40 && obs.getLife() >= 20) {
			obs.cambiarEstado(new PiedraBaja(obs));
		}
	}

	@Override
	public void entidadADestruir(Entidad e) {
		// TODO Auto-generated method stub
		
	}

}
