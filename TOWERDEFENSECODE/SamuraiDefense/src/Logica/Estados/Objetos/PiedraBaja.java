package Logica.Estados.Objetos;

import Logica.Entidades.Entidad;
import Logica.Estados.Estado;

public class PiedraBaja extends Estado{

	public PiedraBaja(Entidad e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejecutar() {
		entidad.getGrafico().morir(); //Simula una piedra con baja vida
		if(entidad.getLife() <= 0) {
			//Morir
		}
		
	}

}
