package GUI.Paneles.Botones;

import Logica.Entidades.Defensores.Defensor;
import Logica.Tienda.Tienda;

public class BotonNinjaElite extends Boton {
	private static final long serialVersionUID = 1L;

	public BotonNinjaElite(Tienda t) {
		super(t);
	}

	@Override
	public Defensor crearDefensor() {
		return tienda.getFabrica().crearNinjaElite(tienda.getJuego().getMapa());
	}

}