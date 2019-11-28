package Logica.Entidades.Obstaculos.ConVida;

import Grafica.Entidades.Obstaculos.VidaFinita.PiedraGrafica;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.ColisionadoresObstaculo.ColisionadorPiedra;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Estados.Objetos.PiedraAlta;
import Logica.Inteligencia.Inteligencia;
import Logica.Mapa.Mapa;

public class Piedra extends Obstaculo {

	public Piedra(int x, int y, Mapa m) {
		super(x, y, m);
		life = 200;

		col = new ColisionadorPiedra(this);
		grafico = new PiedraGrafica(x, y, m.getPanelMapa(), this);
		estado = new PiedraAlta(this);
	}

	@Override
	public void chocar(Colisionador e) {
		e.serChocado(this);		
	}

	@Override
	public Inteligencia getInteligencia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();
	}

	@Override
	public void chocaraDistancia(VisitorDistancia v) {
		v.serChocado(this);
	}

}
