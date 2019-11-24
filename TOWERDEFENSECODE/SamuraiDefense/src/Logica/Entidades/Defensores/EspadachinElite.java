package Logica.Entidades.Defensores;

import Armas.ArmaSimple;
import Grafica.Entidades.Defensores.EspadachinEliteGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public class EspadachinElite extends Defensor {

	public EspadachinElite(int x, int y, Mapa m) {
		super(x, y, m);
		life = 250;
		vida = 250;
		attackSpeed = 1;
		damage = 40;
		range = 0;
		cost = 200;

		grafico = new EspadachinEliteGrafico(x, y, m.getPanelMapa(), this);
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
			aDestruir.recibirDaño(damage * 4);
	}

	@Override
	public Defensor clone() {
		return new EspadachinElite(0, 0, mapa);
	}

}
