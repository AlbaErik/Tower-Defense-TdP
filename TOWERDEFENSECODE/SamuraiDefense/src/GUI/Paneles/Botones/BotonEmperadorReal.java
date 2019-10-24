package GUI.Paneles.Botones;

import Logica.Entidades.Defensores.Defensor;
import Logica.Tienda.Tienda;

public class BotonEmperadorReal extends Boton {
	private static final long serialVersionUID = 1L;

	public BotonEmperadorReal(Tienda t) {
		super(t);
	}

	@Override
	public Defensor crearDefensor() {
		return tienda.getFabrica().crearEmperadorReal(tienda.getJuego().getMapa());
	}

}