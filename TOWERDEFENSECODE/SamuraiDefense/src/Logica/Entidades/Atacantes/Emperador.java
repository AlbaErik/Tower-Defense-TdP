package Logica.Entidades.Atacantes;

import Armas.ArmaSimple;
import Grafica.Entidades.Atacantes.EmperadorGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public class Emperador extends Atacante {

	public Emperador(int x, int y, Mapa m) {
		super(x, y, m);
		life = 450;
		attackSpeed = 4;
		damage = 90;
		range = 0;
		movementSpeed = 0.5;

		grafico = new EmperadorGrafico(x, y, m.getPanelMapa(), this);
		arma = new ArmaSimple(this, m);
	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	@Override
	public Atacante clone() {
		return new Emperador(0, 0, super.mapa);
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();
	}

	@Override
	public void atacar(Entidad aDestruir) {
		if(aDestruir != null) {
			aDestruir.setLife(damage);
		}
	}

	@Override
	public boolean chocaraDistancia(VisitorDistancia v) {
		return v.serChocado(this);
	}

}