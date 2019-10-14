package Logica.Estados.Objetos;

import Logica.Entidades.Entidad;
import Logica.Estados.Estado;

public class PiedraMedia extends Estado{

	public PiedraMedia(Entidad e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejecutar() {
		entidad.getGrafico().atacar(); // Simula la piedra con vida media
		if (entidad.getLife() < 40 && entidad.getLife() > 20) {
			entidad.cambiarEstado(new PiedraBaja(entidad));
		}
	}

}
