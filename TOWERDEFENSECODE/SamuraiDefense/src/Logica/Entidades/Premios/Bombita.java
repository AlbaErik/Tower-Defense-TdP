package Logica.Entidades.Premios;

import Grafica.Entidades.Premios.BombaGrafica;
import Logica.Colisionadores.Colisionador;
import Logica.Colisionadores.Adistancia.VisitorDistancia;
import Logica.Colisionadores.Premios.VisitorSinEfecto;
import Logica.Entidades.Entidad;
import Logica.Mapa.Mapa;

public class Bombita extends Premio {

	private int cont = 100;
	private int rangoX = 200;
	private int rangoY = 200;

	public Bombita(int x, int y, Mapa m) {
		super(x, y, m);
		clave = 3;
		
		grafico = new BombaGrafica(x, y, mapa.getPanelMapa(), this);
		col = new VisitorSinEfecto();
	}

	public void reventar() {
		matarEnRangoX();
		matarEnRangoY();
		this.morir();
	}

	private void matarEnRangoX() {
		int rang = rangoX;
		int X1 = (int) miCelda.getX() + 1;
		int X2 = (int) miCelda.getX() - 1;
		int Y = (int) miCelda.getY();

		while (rang >= 0) {// Mata en un rango X tanto para la izq como para la derecha
			Entidad entidad = mapa.getEntidadEnPos(X1, Y);
			if (entidad != null)
				entidad.morir();
			X1++;

			Entidad entidad2 = mapa.getEntidadEnPos(X2, Y);
			if (entidad2 != null)
				entidad2.morir();
			X2--;

			rang--;
		}
	}

	private void matarEnRangoY() {
		int rang = rangoY;
		int Y1 = (int) miCelda.getY() + 1;
		int Y2 = (int) miCelda.getY() - 1;
		int X = (int) miCelda.getX();

		while (rang >= 0) {// Mata en un rango Y tanto para la arriba como para abajo
			Entidad entidad = mapa.getEntidadEnPos(X, Y1);
			if (entidad != null)
				entidad.morir();
			Y1++;

			Entidad entidad2 = mapa.getEntidadEnPos(X, Y2);
			if (entidad2 != null)
				entidad2.morir();
			Y2--;

			rang--;
		}
	}

	@Override
	public boolean chocaraDistancia(VisitorDistancia v) {
		// TODO Auto-generated method stub
		return v.serChocado(this);
	}

	@Override
	public void chocar(Colisionador e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejecutarEstado() {
		cont--;
		if (cont <= 0)
			reventar();
	}

	@Override
	public boolean queHago(int x,int y) {
		return !mapa.hayEnPos(x, y);
	}

}
