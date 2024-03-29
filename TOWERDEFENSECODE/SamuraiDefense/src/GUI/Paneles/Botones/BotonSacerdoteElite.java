package GUI.Paneles.Botones;

import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Defensores.SacerdoteElite;
import Logica.Tienda.Tienda;

public class BotonSacerdoteElite extends BotonDefensor {
	private static final long serialVersionUID = 1L;

	public BotonSacerdoteElite(Tienda t) {
		super(t);
		miDef=new SacerdoteElite(0, 0, tienda.getJuego().getMapa());
	}

	@Override
	public Defensor crearDefensor() {
		return new SacerdoteElite(0, 0, tienda.getJuego().getMapa());
	}

}