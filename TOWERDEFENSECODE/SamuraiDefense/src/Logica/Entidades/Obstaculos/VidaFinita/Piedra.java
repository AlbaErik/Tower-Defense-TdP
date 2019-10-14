package Logica.Entidades.Obstaculos.VidaFinita;

import Grafica.Entidades.EntidadGrafica;
import Grafica.Entidades.Obstaculos.VidaFinita.PiedraGrafica;
import Logica.Colisionadores.ColisionadoresObstaculo.ColisionadorPiedra;
import Logica.Entidades.Entidad;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Inteligencia.Inteligencia;
import Logica.Mapa.Mapa;

public class Piedra extends Obstaculo {

	public Piedra(int x, int y, Mapa m) {
		super(x, y, m);
		col = new ColisionadorPiedra(this);
		grafico = new PiedraGrafica(x, y, m.getPanelMapa(), this);
	}

	@Override
	public EntidadGrafica getGrafico() {
		return grafico;
	}

	@Override
	public void chocar(Entidad e) {
		e.getColisionador().serChocado(this);
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
	public Obstaculo clone() {
		return new Piedra(0, 0, mapa);
	}

}
