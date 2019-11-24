package Logica.Entidades.Atacantes;

import Armas.ArmaSimple;
import Grafica.Entidades.Atacantes.NecromanteGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public class Necromante extends Atacante {

	public Necromante(int x, int y, Mapa m) {
		super(x, y, m);
		life = 300;
		attackSpeed = 1;
		damage = 45;
		range = 0;
		movementSpeed = 1.3;

		grafico = new NecromanteGrafico(x, y, m.getPanelMapa(), this);
		arma = new ArmaSimple(this, m);
	}

	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	public Atacante clone() {
		return new Necromante(0, 0, super.mapa);
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
