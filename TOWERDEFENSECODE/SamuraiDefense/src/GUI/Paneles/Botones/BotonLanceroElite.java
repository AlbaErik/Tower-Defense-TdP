package GUI.Paneles.Botones;

import Logica.Entidades.Defensores.Defensor;
import Logica.Tienda.Tienda;

public class BotonLanceroElite extends Boton {
	private static final long serialVersionUID = 1L;

	public BotonLanceroElite(Tienda t) {
		super(t);
	}

	@Override
	public Defensor crearDefensor() {
		return tienda.getFabrica().crearLanceroElite(tienda.getJuego().getMapa());
	}

}