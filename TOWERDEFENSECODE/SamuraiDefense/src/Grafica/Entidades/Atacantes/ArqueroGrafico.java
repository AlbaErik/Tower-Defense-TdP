package Grafica.Entidades.Atacantes;

import javax.swing.ImageIcon;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public class ArqueroGrafico extends AtacanteGrafico {
	private String palabras[] = { "ArqueroRunning", "ArqueroAttacking", "ArqueroDying" };

	public ArqueroGrafico(int x, int y, PanelMapa m, Entidad e) {
		super(x, y, m, e);
		graficos = new ImageIcon[3];

		for (int i = 0; i < palabras.length; i++) {
			graficos[i] = new ImageIcon("Sprites/Personajes/Atacantes/" + palabras[i] + ".gif");
		}
		setGraficoInicio(x, y);
	}

	public void setGraficoInicio(int x, int y) {// Tiene que estar si o si en cada clase
		graficoActual.setIcon(graficos[0]);
		graficoActual.setBounds(x, y, 120, 80);
	}

	public void cambiarPos(int x, int y) {// Tiene que estar si o si en cada clase
		pos.setLocation(x, y);
		graficoActual.setBounds(x, y, 120, 80);// 80
	}

}

