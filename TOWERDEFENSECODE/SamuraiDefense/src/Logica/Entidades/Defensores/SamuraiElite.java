package Logica.Entidades.Defensores;

import Armas.ArmaSimple;
import Grafica.Entidades.Defensores.SamuraiEliteGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public class SamuraiElite extends Defensor {

	public SamuraiElite(int x, int y, Mapa m) {
		super(x, y, m);
		life = 500;
		vida = 500;
		attackSpeed = 3;
		damage = 100;
		range = 0;
		cost = 450;

		grafico = new SamuraiEliteGrafico(x, y, m.getPanelMapa(), this);
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
	public boolean chocaraDistancia(VisitorDistancia v) {
		return v.serChocado(this);
	}

	@Override
	public void superAtaque(Entidad aDestruir) {
		if (aDestruir != null) 
			aDestruir.recibirDaño(damage*4);		
	}

}
