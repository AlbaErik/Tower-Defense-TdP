package Logica.Mapa;

import java.util.LinkedList;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.*;
import Logica.Entidades.Defensores.Defensor;
import Logica.Entidades.Premios.Premio;
import Logica.Juego.Juego;
import Logica.Mapa.Niveles.Nivel;
import Logica.PowerUps.PowerUp;
import Logica.Tienda.Tienda;

public class Mapa {

	private LinkedList<Entidad> misEntidades;
	private PanelMapa mapagrafico;
	private Nivel nivel;
	private Juego juego;
	private Tienda tienda;

	public Mapa(Juego j) {
		juego = j;
		nivel = juego.getNivel();
		misEntidades = new LinkedList<Entidad>();
		mapagrafico = new PanelMapa(this);
		tienda = juego.getTienda();
	}
	
	public void perdioElJugador() {
		juego.hacerPerderAlJugador();
	}
	
	public boolean hayPremioActual() {
		return tienda.hayPremioActual();
	}

	public void notificarMuerteEnemigo() {
		juego.restarEnemigoMuerto();
	}
	
	public void agregarPowerUp(int x, int y, PowerUp power) {
		mapagrafico.agregarLabel(power.getGrafico().getGrafico());
		//mapagrafico.agregarPowerUp(x,y,power);
	}
	
	public void eliminarPowerUp(PowerUp power) {
		mapagrafico.eliminarLabel(power.getGrafico().getGrafico());
	}
	
	public void agregarPremioTienda(int c, Premio p) {
		tienda.agregarPremio(c, p);
	}
	
	public void agregarEntidadAlCampo(Entidad e) {
		mapagrafico.agregarEntidad(e);
	}

	public void agregarEntidadAlCampoEnPosActual(Entidad e) {
		setEntidad(e);
		mapagrafico.agregarLabel(e.getGrafico().getGraficoActual());
		//mapagrafico.agregarEntidadEnPosActual(e);
	}
	
	public void actualizarOroTienda(int o) {
		tienda.actualizarOro(o);
	}
	
	public boolean premioParaEntidad() {
		return tienda.premioParaEntidad();
	}
	
	public Premio getPremioActual() {
		return tienda.getPremioActual();
	}
	
	public void eliminarEntidad(Entidad e) {// Elimina al defensor de la lista de defensores
		Entidad actual = null;//misEntidades.getFirst();
		for (Entidad i : misEntidades) {
			if (i.hashCode() == e.hashCode())
				actual = i;
		}
		if(actual != null) {
			misEntidades.remove(actual);
			mapagrafico.eliminarLabel(actual.getGrafico().getGraficoActual());
		}
		
	}	

	public boolean hayEntidades() {
		return !misEntidades.isEmpty();
	}

	public boolean hayEnPos(int x, int y) {
		boolean ocupada = false;
		for (int i = 0; i < misEntidades.size() && !ocupada; i++) {
			double X = misEntidades.get(i).getPos().getX();
			double Y = misEntidades.get(i).getPos().getY();

			if ((X == (double) x) && (Y == (double) y))
				ocupada = true;
			else {
				//ocupada = hayALoAlto(misEntidades.get(i), y);
				if( (X == (double) x) && (y == misEntidades.get(i).getPos().getAlto()/2))	ocupada = true;
			}
		}
		return ocupada;
	}
	
	private boolean hayALoAlto(Entidad ent, double Y) {
		boolean hayEntidad = false;
		int yMasAlto = (int) (ent.getPos().getY() + ent.getPos().getAlto());
		if(Y < yMasAlto)
			hayEntidad = true;
		return hayEntidad;
	}
	
	public boolean tiendaGetEliminar() {
		return tienda.getEliminar();
	}
	
	public Entidad getEntidadEnPos(int x, int y) {
		Entidad toRet = null;
		for(Entidad e : misEntidades) {
			int X = (int)e.getPos().getX();
			int Y = (int)e.getPos().getY();
			if( X == x && y == Y) {
				toRet = e;
				break;
			}				
		}
		return toRet;
	}

	public PanelMapa getPanelMapa() {
		return mapagrafico;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public Juego getJuego() {
		return juego;
	}
	
	public Tienda getTienda() {
		return tienda;
	}
		
	public Defensor getPersonajeActual() {
		return tienda.getPersonajeActual();
	}	
	
	public LinkedList<Entidad> getColeccion() {
		LinkedList<Entidad> nueva = new LinkedList<Entidad>();
		for (Entidad e : misEntidades) {
			nueva.addFirst(e);
		}
		return nueva;
	}
	
	public void setEntidad(Entidad d) {
		misEntidades.addFirst(d);
	}
}
