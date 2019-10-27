package Logica.Entidades.Atacantes;

import Armas.Arco;
import Grafica.Entidades.Atacantes.EmperadorGrafico;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.ColisionadorAtacante;
import Logica.Entidades.Entidad;
import Logica.Estados.Personajes.Avanzar;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Mapa.Mapa;

public class Emperador extends Atacante {

	public Emperador(int x, int y, Mapa m) {
		super(x, y, m);
		life = 450;
		attackSpeed=4;
		damage = 90;
		range = 100;
		movementSpeed=0.5;
		
		grafico = new EmperadorGrafico(x, y, m.getPanelMapa(), this);
		intel = new InteligenciaAtacante(this);
		arma = new Arco(this, m);
		estado = new Avanzar(this);
		col = new ColisionadorAtacante(this);
	}

	@Override
	public void chocar(Colisionador e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Atacante clone() {
		return new Emperador(0,0,super.mapa);
	}

	@Override
	public Inteligencia getInteligencia() {
		// TODO Auto-generated method stub
		return intel;
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();		
	}

	@Override
	public void atacar(Entidad aDestruir) {
		// TODO Auto-generated method stub
		
	}

	
}