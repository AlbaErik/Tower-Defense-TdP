package GUI.Paneles.Botones;

import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Defensores.EspadachinElite;
import Logica.Tienda.Tienda;

public class BotonEspadachinElite extends BotonDefensor {
	private static final long serialVersionUID = 1L;

	public BotonEspadachinElite(Tienda t) {
		super(t);
		miDef= new EspadachinElite(0, 0, tienda.getJuego().getMapa());
	}

	@Override
	public Defensor crearDefensor() {
		return new EspadachinElite(0, 0, tienda.getJuego().getMapa());
	}

}
