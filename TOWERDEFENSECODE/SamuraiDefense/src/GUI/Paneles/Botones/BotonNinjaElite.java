package GUI.Paneles.Botones;

import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Defensores.NinjaElite;
import Logica.Tienda.Tienda;

public class BotonNinjaElite extends BotonDefensor {
	private static final long serialVersionUID = 1L;

	public BotonNinjaElite(Tienda t) {
		super(t);
		miDef=new NinjaElite(0, 0, tienda.getJuego().getMapa());
	}

	@Override
	public Defensor crearDefensor() {
		return new NinjaElite(0, 0, tienda.getJuego().getMapa());
	}

}