package Logica.Entidades.Defensores;

import Armas.ArmaSimple;
import Grafica.Entidades.Defensores.SacerdoteEliteGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public class SacerdoteElite extends Defensor {

	public SacerdoteElite(int x, int y, Mapa m) {
		super(x, y, m);
		life = 350;
		vida = 350;
		damage = 70;
		range = 0;
		cost = 300;

		grafico = new SacerdoteEliteGrafico(x, y, m.getPanelMapa(), this);
		arma = new ArmaSimple(this, m);
	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	@Override
	public void atacar(Entidad aDestruir) {
		if (aDestruir != null) 
			aDestruir.recibirDaño(damage);
	}

	@Override
	public void chocaraDistancia(VisitorDistancia v) {
		v.serChocado(this);
	}

	@Override
	public void superAtaque(Entidad aDestruir) {
		if (aDestruir != null) 
			aDestruir.recibirDaño(damage*4);
	}

}
