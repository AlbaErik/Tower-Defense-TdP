package Logica.Entidades.Atacantes;

import Armas.LanzadorShurikens;
import Grafica.Entidades.Atacantes.NinjaGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.ColisionadorAtacante;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Entidades.Entidad;
import Logica.Estados.Personajes.Avanzar;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;

public class Ninja extends Atacante {

	public Ninja(int x, int y, Mapa m) {
		super(x, y, m);
		life = 210;
		attackSpeed = 0.5;
		damage = 25;
		range = 0;
		movementSpeed = 1;

		grafico = new NinjaGrafico(x, y, m.getPanelMapa(), this);
		intel = new InteligenciaAtacante(this);
		arma = new LanzadorShurikens(this, m);
		estado = new Avanzar(this);
		col = new ColisionadorAtacante(this);
		// colDistancia = new ColADistanciaEnem(this);
	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);
	}

	@Override
	public Atacante clone() {
		return new Ninja(0, 0, super.mapa);
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
