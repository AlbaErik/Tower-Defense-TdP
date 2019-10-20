package Logica.Estados.Objetos;

import Grafica.Entidades.Obstaculos.VidaFinita.ObstaculoGrafico;
import Logica.Entidades.Entidad;
import Logica.Entidades.Obstaculos.Obstaculo;

public class PiedraAlta extends EstadoObjeto {

	public PiedraAlta(Obstaculo e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejecutar() {
		((ObstaculoGrafico) obs.getGrafico()).vidaAlta(); 		
		if (obs.getLife() < 60 && obs.getLife() >= 40) {
			obs.cambiarEstado(new PiedraMedia(obs));
		}
	}

	@Override
	public void entidadADestruir(Entidad e) {
		// TODO Auto-generated method stub
		
	}

}
