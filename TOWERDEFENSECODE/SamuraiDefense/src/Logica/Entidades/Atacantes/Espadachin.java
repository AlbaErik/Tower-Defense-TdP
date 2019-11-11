package Logica.Entidades.Atacantes;

import Armas.ArmaSimple;
import Grafica.Entidades.Atacantes.EspadachinGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public class Espadachin extends Atacante {

	public Espadachin(int x, int y, Mapa m) {
		super(x, y, m);
		life = 260;
		attackSpeed = 1;
		damage = 50;
		range = 0;
		movementSpeed = 1.5;

		grafico = new EspadachinGrafico(x, y, m.getPanelMapa(), this);
		arma = new ArmaSimple(this, m);
	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	@Override
	public Atacante clone() {
		return new Espadachin(0, 0, super.mapa);
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();
	}

	@Override
	public void atacar(Entidad aDestruir) {
		if (aDestruir != null) {
			aDestruir.setLife(damage);
		}
	}

	@Override
	public boolean chocaraDistancia(VisitorDistancia v) {
		return v.serChocado(this);
	}

}
