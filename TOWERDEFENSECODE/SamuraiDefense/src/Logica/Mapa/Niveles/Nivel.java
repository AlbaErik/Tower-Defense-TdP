package Logica.Mapa.Niveles;

import Logica.Juego.Juego;
import Logica.Mapa.Hordas.Horda;

import java.awt.Image;
import java.util.LinkedList;

import javax.swing.ImageIcon;

import Logica.Entidades.*;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Entidades.Obstaculos.ConVida.Piedra;

public abstract class Nivel {

	// AGREGAR FONDO

	private int presupuesto;
	protected Horda horda;
	protected boolean horda1,horda2,horda3,obstaculos1,obstaculos2,obstaculos3,nivel1,nivel2,nivel3;
	private Nivel siguiente;
	protected Juego juego;
	protected LinkedList<Obstaculo> obstaculos;

	public Nivel(Juego j) {
		juego = j;
		juego.getPanelJuego().getVentanaInicial().add(juego.getMapa().getPanelMapa());
		obstaculos = new LinkedList<Obstaculo>();
		crearListaObstaculos();
		nivel1=true;
		nivel2=true;
		nivel3=true;
		
	}

	private void crearListaObstaculos() {
		obstaculos.add(new Piedra(0, 0, juego.getMapa()));
		obstaculos.add(new Piedra(0, 0, juego.getMapa()));
	}

	protected abstract LinkedList<Entidad> crearHorda1();
	protected abstract LinkedList<Entidad> crearHorda2();
	protected abstract LinkedList<Entidad> crearHorda3();
	
	public abstract LinkedList<Entidad> getSigHorda();
	
	public boolean haySigHorda() {
		boolean toret=false;
		if(horda1 || horda2 || horda3)
			toret=true;
		System.out.println("*NIVEL: " + horda1+" , "+ horda2+" , "+ horda3);
		return toret;
	}


	protected abstract LinkedList<Obstaculo> crearObstaculos1();
	protected abstract LinkedList<Obstaculo> crearObstaculos2();
	protected abstract LinkedList<Obstaculo> crearObstaculos3();
	
	public abstract LinkedList<Obstaculo> getSigObstaculos();
	
	public boolean haySigObstaculos() {
		boolean toret=false;
		if(obstaculos1 || obstaculos2 || obstaculos3)
			toret=true;
		return toret;
	}
	
	
	public abstract Nivel setSigNivel();
	
	public boolean haySigNivel() {
		boolean toret=false;
		if(nivel1 || nivel2 || nivel3)
			toret=true;
		return toret;
	}

	public Juego getJuego() {
		return juego;
	}
	
}
