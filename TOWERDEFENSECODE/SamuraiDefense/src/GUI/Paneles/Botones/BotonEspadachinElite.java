package GUI.Paneles.Botones;

import Logica.Entidades.Defensores.Defensor;
import Logica.Tienda.Tienda;

public class BotonEspadachinElite extends Boton {
	private static final long serialVersionUID = 1L;

	public BotonEspadachinElite(Tienda t) {
		super(t);
	}

	@Override
	public Defensor crearDefensor() {
		return tienda.getFabrica().crearEspadachinElite(tienda.getJuego().getMapa());
	}

}
