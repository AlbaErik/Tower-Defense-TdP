package Grafica.Entidades.Atacantes;

import javax.swing.ImageIcon;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public class NinjaGrafico extends AtacanteGrafico {
	private String palabras[] = { "NinjaStanding", "NinjaRunning", "NinjaAttacking", "NinjaDying" };

	public NinjaGrafico(int x, int y, PanelMapa m, Entidad e) {
		super(x, y, m, e);
		graficos = new ImageIcon[4];

		for (int i = 0; i < palabras.length; i++) {
			graficos[i] = new ImageIcon("Sprites/Personajes/Atacantes/" + palabras[i] + ".gif");
		}
		graficos[3] = new ImageIcon("Sprites/Personajes/Atacantes/NinjaStanding.png");
		setGraficoInicio(x, y);
	}

	public void setGraficoInicio(int x, int y) {// Tiene que estar si o si en cada clase
		graficoActual.setIcon(graficos[0]);
		graficoActual.setBounds(x, y, 100, 65);
	}

	public void cambiarPos(int x, int y) {// Tiene que estar si o si en cada clase
		pos.setLocation(x, y);
		graficoActual.setBounds(x, y, 100, 65);// 80
	}

	public void standing() {
		getGraficoActual().setIcon(graficos[0]);
	}
	
	public void running() {
		getGraficoActual().setIcon(graficos[1]);
	}
	
	public void atack() {
		getGraficoActual().setIcon(graficos[2]);
	}

	public void death() {
		getGraficoActual().setIcon(graficos[3]);
	}
	
}