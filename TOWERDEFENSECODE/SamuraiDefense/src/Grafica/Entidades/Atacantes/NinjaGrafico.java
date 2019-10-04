package Grafica.Entidades.Atacantes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public class NinjaGrafico extends AtacanteGrafico {
	private String palabras[] = { "NinjaRunning", "NinjaAttacking", "NinjaDying" };

	public NinjaGrafico(int x, int y, PanelMapa m, Entidad e) {
		super(x, y, m, e);
		graficos = new ImageIcon[3];

		for (int i = 0; i < palabras.length; i++) {
			graficos[i] = new ImageIcon("Sprites/Personajes/Atacantes/" + palabras[i] + ".gif");
		}
		setGraficoInicio(x, y);
	}

	public void setGraficoInicio(int x, int y) {// Tiene que estar si o si en cada clase
		graficoActual.setIcon(graficos[0]);
		graficoActual.setBounds(x, y, ancho, 65);
	}

	public void cambiarPos(int x, int y) {// Tiene que estar si o si en cada clase
		pos.setLocation(x, y);
		graficoActual.setBounds(x, y, ancho, 65);// 80
	}

}