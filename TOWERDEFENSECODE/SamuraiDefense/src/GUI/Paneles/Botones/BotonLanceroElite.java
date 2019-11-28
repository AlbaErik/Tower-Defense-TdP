package GUI.Paneles.Botones;

import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Defensores.LanceroElite;
import Logica.Tienda.Tienda;

public class BotonLanceroElite extends BotonDefensor {
	private static final long serialVersionUID = 1L;

	public BotonLanceroElite(Tienda t) {
		super(t);
	}

	@Override
	public Defensor crearDefensor() {
		return new LanceroElite(0, 0, tienda.getJuego().getMapa());

		//return tienda.getFabrica().crearLanceroElite(tienda.getJuego().getMapa());
	}

}