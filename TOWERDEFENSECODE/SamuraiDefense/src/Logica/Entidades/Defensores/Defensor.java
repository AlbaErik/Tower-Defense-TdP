package Logica.Entidades.Defensores;

import javax.swing.JLabel;

import Grafica.Entidades.EntidadGrafica;
import Grafica.Entidades.Defensores.DefensorGrafico;
import Logica.Colisionadores.ColisionadorDefensor;
import Logica.Colisionadores.Adistancia.ColCaminoLibreDef;
import Logica.Colisionadores.VisitorsDeEstados.VisitorDeEstados;
import Logica.Colisionadores.VisitorsDeEstados.VisitorEstadoAtaque;
import Logica.Colisionadores.VisitorsDeEstados.VisitorEstadoFuerza;
import Logica.Entidades.Personaje;
import Logica.Estados.Personajes.Defensor.ReposoDefensor;
import Logica.Inteligencia.InteligenciaDefensor;
import Logica.Mapa.Mapa;

public abstract class Defensor extends Personaje {
	protected int cost;
	protected int vida;
	protected VisitorDeEstados visitorFuerza;
	protected VisitorDeEstados visitorAtaque;
	protected DefensorGrafico grafico;

	protected Defensor(int x, int y, Mapa m) {
		super(x, y, m);

		visitorCaminoLibre = new ColCaminoLibreDef(this);
		intel = new InteligenciaDefensor(this);
		estado = new ReposoDefensor(this);
		col = new ColisionadorDefensor(this);
		visitorFuerza = new VisitorEstadoFuerza();
		visitorAtaque = new VisitorEstadoAtaque();
	}
	
	public DefensorGrafico getGrafico() {
		return grafico;
	}

	public void cambiarPosLogica(double x, int y){
		miCelda.setPos(x, y);
		grafico.cambiarPos(x, y);
		mapa.getPanelMapa().repaint();
	}

	public JLabel getJLabel() {
		return grafico.getGraficoActual();
	}
	
	@Override
	public void ejecutarEstado() {
		estado.ejecutar();
	}

	/*
	 * Sirve para cambiar a un estado ataque independientemente del actual
	 */
	public void cambiarAEstadoAtaque() {
		if (permisoCambiarEstado) {
			estado.aceptarVisitorEstados(visitorAtaque);
		}
	}

	/*
	 * Sirve para cambiar de cualquier estado a uno SUPER cuando se usa la Pocion de Fuerza
	 */
	public void cambiarASuperEstado() {
		if (permisoCambiarEstado) {
			estado.aceptarVisitorEstados(visitorFuerza);
		}			
	}

	public int getDireccion() {
		return 1;
	}

	public int getCost() {
		return cost;
	}
	public int getVida() {
		return vida;
	}
}
