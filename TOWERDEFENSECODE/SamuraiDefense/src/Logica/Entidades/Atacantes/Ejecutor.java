package Logica.Entidades.Atacantes;

import Armas.ArmaSimple;
import Grafica.Entidades.Atacantes.EjecutorGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public class Ejecutor extends Atacante {

	public Ejecutor(int x, int y, Mapa m) {
		super(x, y, m);
		life = 360;
		attackSpeed = 1;
		damage = 70;
		range = 0;
		movementSpeed = 0.8;

		grafico = new EjecutorGrafico(x, y, m.getPanelMapa(), this);
		arma = new ArmaSimple(this, m);
	}

	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	public Atacante clone() {
		return new Ejecutor(0, 0, super.mapa);
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();

	}

	@Override
	public void atacar(Entidad aDestruir) {
		if (aDestruir != null) {
			aDestruir.recibirDaño(damage);
		}
	}

	@Override
	public void chocaraDistancia(VisitorDistancia v) {
		v.serChocado(this);
	}

}
