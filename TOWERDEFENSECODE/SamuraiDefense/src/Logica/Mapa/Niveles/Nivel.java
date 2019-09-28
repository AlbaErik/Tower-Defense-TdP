package Logica.Mapa.Niveles;

import Logica.Juego.Juego;
import Logica.Mapa.Mapa;

public abstract class Nivel {
  private int presupuesto;
  private Horda[] horda;
  private Nivel siguiente;
  private Juego juego;
  
  public Nivel(Juego j) {
	  juego=j;
	  horda=new Horda[3];
	  for(int i=0;i<horda.length;i++) {
		  horda[i]=new Horda();
	  }
	  juego.getPanelJuego().getVentanaInicial().add(juego.getMapa().getPanelMapa());	  
  }
  
  public abstract void crearHorda();
  
  public abstract void getSigNivel();
  
  public Juego getJuego() {
	  return juego;
  }
}
