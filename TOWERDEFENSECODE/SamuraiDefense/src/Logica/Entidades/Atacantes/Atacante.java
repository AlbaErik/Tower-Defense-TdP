package Logica.Entidades.Atacantes;

import java.util.Random;
import Logica.Colisionadores.ColisionadorAtacante;
import Logica.Colisionadores.Adistancia.ColCaminoLibreEnem;
import Logica.Entidades.Contador;
import Logica.Entidades.Personaje;
import Logica.Entidades.Premios.EscudoEnemigo;
import Logica.Estados.Personajes.Atacante.Avanzar;
import Logica.Inteligencia.Inteligencia;
import Logica.Inteligencia.InteligenciaAtacante;
import Logica.Inteligencia.InteligenciaAtacanteLento;
import Logica.Mapa.Mapa;
import Logica.PowerUps.PowerUp;
import Logica.PowerUps.TiendaPowerUp;

public abstract class Atacante extends Personaje {
	protected double movementSpeed;
	protected double backupVel;
	
	protected InteligenciaAtacante intel;
	protected TiendaPowerUp tiendaPowerUp;
	protected EscudoEnemigo escudo = null;
	protected Contador contLentitud = new Contador();

	protected Atacante(int x, int y, Mapa m) {
		super(x, y, m);

		visitorCaminoLibre = new ColCaminoLibreEnem(this);
		tiendaPowerUp = new TiendaPowerUp(m);
		intel = new InteligenciaAtacante(this);
		estado = new Avanzar(this);
		col = new ColisionadorAtacante(this);
	}

	@Override
	public void ejecutarEstado() {
		estado.ejecutar();
	}
	
	public EscudoEnemigo getEscudo() {
		return escudo;
	}

	public void setEscudo(EscudoEnemigo esc) {
		escudo = esc;
	}
	
	public void devolverVelocidad() {		
		intel = new InteligenciaAtacante(this);	
	}
	
	private void cambiarInteligenciaLenta() {
		intel = new InteligenciaAtacanteLento(this);
	}

	public void realentizarPersonaje() {		
		cambiarInteligenciaLenta();		
	}

	public void morir() {
		if(escudo != null)
			escudo.morir();
		
		devolverPowerUp();
		int dinero = this.dineroDropeado();
		mapa.actualizarOroTienda(dinero);
		
		mapa.notificarMuerteEnemigo();
		mapa.eliminarEntidad(this);
	}

	protected void devolverPowerUp() {
		PowerUp aleatorio = null;
		Random ran = new Random();
		int i = ran.nextInt(10);
		if (i % 1 == 0)
			aleatorio = tiendaPowerUp.getRandom();

		if (aleatorio != null) {
			
			int x = (int) this.getPos().getX();
			int y = (int) this.getPos().getY();
			aleatorio.getGrafico().setBounds(x, y, 120, 120);
			mapa.agregarPowerUp(x, y, aleatorio);
		}
	}

	public int getContadorLentitud() {
		return contLentitud.getContador();
	}

	public void resetContadorLentitud() {
		contLentitud.resetContador();
	}

	public void incrementarContadorLentitud() {
		contLentitud.incrementarContador();
	}

	public int getDireccion() {
		return -1;
	}

	public double getVelocidadMov() {
		return movementSpeed;
	}

	public Inteligencia getInteligencia() {
		return intel;
	}

	public int dineroDropeado() {
		return (int) ((Math.random() * ((100 - 40) + 1)) + 40);
	}

}
