package Logica.Inteligencia;

import Logica.Entidades.Defensores.Defensor;

public class InteligenciaDefensor extends Inteligencia{

	public InteligenciaDefensor(Defensor def) {
		entidad = def;	
		
	}

	@Override
	public void mover() {
		System.out.println("Muevo Defensor");
	}

}
