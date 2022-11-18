package GUI.Paneles.Botones;

import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Defensores.SamuraiElite;
import Logica.Tienda.Tienda;

public class BotonSamuraiElite extends BotonDefensor {
	private static final long serialVersionUID = 1L;

	public BotonSamuraiElite(Tienda t) {
		super(t);
		miDef=new SamuraiElite(0, 0, tienda.getJuego().getMapa());
	}

	@Override
	public Defensor crearDefensor() {
		return new SamuraiElite(0, 0, tienda.getJuego().getMapa());
	}

}