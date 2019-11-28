package GUI.Paneles.Botones;

import Logica.Entidades.Defensores.ArqueroElite;
import Logica.Entidades.Defensores.Defensor;
import Logica.Tienda.Tienda;

public class BotonArqueroElite extends BotonDefensor {
	private static final long serialVersionUID = 1L;

	public BotonArqueroElite(Tienda t) {
		super(t);
	}

	@Override
	public Defensor crearDefensor() {
		//return tienda.getFabrica().crearArqueroElite(tienda.getJuego().getMapa());
		return new ArqueroElite(0,0,map);
	}

}