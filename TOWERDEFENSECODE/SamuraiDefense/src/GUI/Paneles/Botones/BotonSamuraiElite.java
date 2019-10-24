package GUI.Paneles.Botones;

import Logica.Entidades.Defensores.Defensor;
import Logica.Tienda.Tienda;

public class BotonSamuraiElite extends Boton {
	private static final long serialVersionUID = 1L;

	public BotonSamuraiElite(Tienda t) {
		super(t);
	}

	@Override
	public Defensor crearDefensor() {
		return tienda.getFabrica().crearSamuraiElite(tienda.getJuego().getMapa());
	}

}