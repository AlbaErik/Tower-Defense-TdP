package GUI.Paneles.Botones;

import Logica.Entidades.Defensores.Defensor;
import Logica.Tienda.Tienda;

public class BotonArqueroElite extends Boton {
	private static final long serialVersionUID = 1L;

	public BotonArqueroElite(Tienda t) {
		super(t);
	}

	@Override
	public Defensor crearDefensor() {
		return tienda.getFabrica().crearArqueroElite(tienda.getJuego().getMapa());
	}

}