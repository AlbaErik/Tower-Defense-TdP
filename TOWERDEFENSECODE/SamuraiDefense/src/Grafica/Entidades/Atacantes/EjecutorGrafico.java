package Grafica.Entidades.Atacantes;

import javax.swing.ImageIcon;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public class EjecutorGrafico extends AtacanteGrafico {
	private String palabras[] = { "EjecutorStanding", "EjecutorRunning", "EjecutorAttacking", "EjecutorDying" };

	public EjecutorGrafico(int x, int y, PanelMapa m, Entidad e) {
		super(x, y, m, e);
		graficos = new ImageIcon[4];

		for (int i = 0; i < palabras.length; i++) {
			graficos[i] = new ImageIcon("Sprites/Personajes/Atacantes/" + palabras[i] + ".gif");
		}
		//graficos[3] = new ImageIcon("Sprites/Personajes/Atacantes/EjecutorStanding.png");
		setGraficoInicio(x, y);
	}

	public void setGraficoInicio(int x, int y) {// Tiene que estar si o si en cada clase
		graficoActual.setIcon(graficos[0]);
		graficoActual.setBounds(x, y, 120, 120);
	}

}
