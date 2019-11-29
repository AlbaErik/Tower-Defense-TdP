package Logica.Mapa.Niveles;

import java.awt.Image;
import java.util.LinkedList;

import javax.swing.ImageIcon;

import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Juego.Juego;
import Logica.Mapa.Hordas.HordaFacil;
import Logica.Mapa.Hordas.HordaMedia;

public class Nivel1 extends Nivel {

	public Nivel1(Juego j) {
		super(j);
		crearHordas();
		cantidadEnems = 1;
		cantObs = 2;
		siguiente = new Nivel2(juego);

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
		misHordas.add(new HordaFacil(juego.getMapa()));
		misHordas.add(new HordaMedia(juego.getMapa()));
		misHordas.add(new HordaMedia(juego.getMapa()));
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
		return new ImageIcon("Sprites/Fondos/FondoMapa2.png").getImage();
	}

}
