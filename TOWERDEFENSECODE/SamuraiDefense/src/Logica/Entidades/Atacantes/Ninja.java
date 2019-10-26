package Logica.Entidades.Atacantes;

import Armas.LanzadorShurikens;
import Grafica.Entidades.Atacantes.NinjaGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.ColisionadorAtacante;
import Logica.Entidades.Entidad;
import Logica.Estados.Personajes.Avanzar;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;

public class Ninja extends Atacante {

	public Ninja(int x, int y, Mapa m) {
		super(x, y, m);
		intel = new InteligenciaAtacante(this);
		this.life = 100;
		this.damage = 30;
		this.attackSpeed = 5;
		this.movementSpeed = 1.5;
		this.range = 3;
		this.grafico = new NinjaGrafico(x, y, m.getPanelMapa(), this);
		this.col = new ColisionadorAtacante(this);
		arma = new LanzadorShurikens(this, m);
		estado = new Avanzar(this);
		//colDistancia = new ColADistanciaEnem(this);
		//range = 100;
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
		if(aDestruir != null) {
			aDestruir.setLife(damage);
		}
	}

}
