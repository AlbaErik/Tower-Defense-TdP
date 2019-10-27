package Logica.Juego;

import java.util.LinkedList;
import java.util.Random;

import GUI.Paneles.PanelJuego;
import Logica.Entidades.Entidad;
import Logica.Entidades.Atacantes.Atacante;
import Logica.Entidades.Obstaculos.Obstaculo;
import Logica.Mapa.Mapa;
import Logica.Mapa.Niveles.Nivel;
import Logica.Mapa.Niveles.Nivel1;
import Logica.Tienda.Tienda;

public class Juego {
	private PanelJuego Gui;
	private Tienda tienda;
	private Nivel nivel;
	private Mapa mapa;
	private LinkedList<Atacante> misAtacantes;
	private LinkedList<Entidad> miHorda;
	private LinkedList<Obstaculo> misObstaculos;

	public Juego(PanelJuego g) {
		Gui = g;
		tienda = new Tienda(this);
		mapa = new Mapa(this);
		misAtacantes = new LinkedList<Atacante>();
	}

	public void crearNivel() {
		nivel = new Nivel1(this);
	}

	public void iniciar() {

	}

	public void inicializarHorda() {
		miHorda = nivel.getSigHorda();
	}
	
	public void generarObstaculos() {
		misObstaculos = nivel.getSigObstaculos();
		while(!misObstaculos.isEmpty()) {
			double x = randomX();
			int y = randomY();
			Obstaculo obs = misObstaculos.getFirst();
			obs.cambiarPosLogica(x, y);
			mapa.agregarEntidadAlCampoEnPosActual(obs);
			misObstaculos.remove(misObstaculos.getFirst());
		}
		
	}

	public void agregarEntidades() { // cambiar, que agregue de a uno y que lo mueva
		if(!misObstaculos.isEmpty()) {
			int x = randomX();
			int y = randomY();
			while(!verificarLugarEnMapa(x,y)) { //Si no se puede colocar, devuelve false
				x = randomX();
				y = randomY();
			}
			System.out.println("JUEGO: Se seteo un obstaculo en el X:"+x+" Y:"+y);
			Obstaculo obs = misObstaculos.getFirst();
			obs.cambiarPosLogica(x, y);
			mapa.agregarEntidadAlCampoEnPosActual(obs);
			misObstaculos.remove(misObstaculos.getFirst());
		}else if (!miHorda.isEmpty()) {
			Entidad atacante = miHorda.getFirst();
			mapa.agregarEntidadAlCampo(atacante);
			miHorda.remove(miHorda.getFirst());
		}
			
		if(miHorda.isEmpty() && misObstaculos.isEmpty()) {//Si ya se vencio a la horda y ya se pusieron los obstaculos
			
			if(nivel.haySigHorda()) { 
				miHorda=nivel.getSigHorda();
				System.out.println("JUEGO: Se seteo la siguiente horda");
			}
			if(nivel.haySigObstaculos()) {
				misObstaculos=nivel.getSigObstaculos();
				System.out.println("JUEGO: Se setearon los siguientes obstaculos");
			}
		}
		
	}
	
	public boolean nivelTerminado() {
		return miHorda.isEmpty() && misObstaculos.isEmpty() && nivel.haySigNivel();			
	}
	
	private int randomY() {
		Random rand = new Random();
		int fila = rand.nextInt(5);
		fila = fila * 66 + 183;
		return fila;
	}

	private int randomX() {
		Random rand = new Random();
		int x = rand.nextInt(3);
		x=x*100;
		return x+500;
	}
	
	private boolean verificarLugarEnMapa(int x,int y) {//Verifica si se puede colocar una entidad en ese lugar
		boolean sepuedecolocar=false;
		int i=x;
		while(i<x+50 && !sepuedecolocar){
			if(!mapa.hayEnPos(x, y)) {
				sepuedecolocar=true;
			}else {
				sepuedecolocar=false;
			}
			i++;
		}
		i=x;
		while(i>x-50 && !sepuedecolocar){
			if(!mapa.hayEnPos(x, y)) {
				sepuedecolocar=true;
			}else {
				sepuedecolocar=false;
			}
			i--;
		}	
		return sepuedecolocar;
	}

	public void accionarEstados() {
		for(Entidad e : mapa.getColeccion())
			e.ejecutarEstado();
	}
	
	public void reanudar() {
		// TODO Auto-generated method stub
	}

	public Tienda getTienda() {
		return tienda;
	}

	public PanelJuego getPanelJuego() {
		return Gui;
	}

	public Nivel getNivel() {
		return nivel;
	}
	
	public void setSigNivel() {
			nivel=nivel.setSigNivel(); //Controlo que haya siguiente nivel en el metodo nivelTerminado en la clase juego
	}

	public Mapa getMapa() {
		return mapa;
	}

	

}
