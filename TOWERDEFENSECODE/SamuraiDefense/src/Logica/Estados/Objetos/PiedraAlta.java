package Logica.Estados.Objetos;

import Logica.Entidades.Entidad;
import Logica.Estados.Estado;

public class PiedraAlta extends Estado {

	public PiedraAlta(Entidad e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejecutar() {
		entidad.getGrafico().posicionInicial();
		if (entidad.getLife() < 60 && entidad.getLife() > 40) {
			entidad.cambiarEstado(new PiedraMedia(entidad));
		}
	}

}
