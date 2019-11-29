package Logica.Mapa.Niveles;

import java.awt.Image;
import java.util.LinkedList;

import javax.swing.ImageIcon;

import Logica.Entidades.Entidad;
import Logica.Entidades.Personaje;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Juego.Juego;
import Logica.Mapa.Hordas.HordaDificil;

public class Nivel3 extends Nivel {

	public Nivel3(Juego j) {
		super(j);
		crearHordas();
		cantidadEnems = 1;
		cantObs = 2;
		siguiente = null;
	}

	@Override
	public Nivel getSigNivel() {
		return siguiente;
	}

	@Override
	public boolean haySigNivel() {
		return siguiente != null;
	}

	@Override
	protected void crearHordas() {
		misHordas.add(new HordaDificil(juego.getMapa()));
		misHordas.add(new HordaDificil(juego.getMapa()));
		misHordas.add(new HordaDificil(juego.getMapa()));		
	}

	@Override
	public LinkedList<Obstaculo> getObstaculos() {
		return creadorObs.getObstaculosRandom(cantObs);
	}

	@Override
	public LinkedList<Atacante> getSigHorda() {
		return getHorda().crearAtacantes(cantidadEnems);
	}

	@Override
	public Image getFondo() {
		// TODO Auto-generated method stub
		return new ImageIcon("Sprites/Fondos/FondoMapa2.png").getImage();
	}
}
