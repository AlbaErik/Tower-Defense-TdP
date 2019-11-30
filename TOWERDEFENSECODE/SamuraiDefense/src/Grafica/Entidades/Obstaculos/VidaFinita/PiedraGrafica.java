package Grafica.Entidades.Obstaculos.VidaFinita;

import javax.swing.ImageIcon;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Obstaculos.Obstaculo;

public class PiedraGrafica extends ObstaculoGraficoFinito {
	private String palabras[] = { "PiedraVidaAlta", "PiedraVidaMedia", "PiedraVidaBaja" };

	public PiedraGrafica(int x, int y, PanelMapa m, Obstaculo e) {
		super(x, y, m, e);
		graficos = new ImageIcon[3];
		for (int i = 0; i < palabras.length; i++) {
			graficos[i] = new ImageIcon("Sprites/Objetos/" + palabras[i] + ".png");
		}
		setGraficoInicio(x, y);
	}

	public void setGraficoInicio(int x, int y) {// Tiene que estar si o si en cada clase
		graficoActual.setIcon(graficos[0]);
		graficoActual.setBounds(x, y, 120, 120);
	}

	public void vidaAlta() {
		this.getGraficoActual().setIcon(this.graficos[0]);
	}

	public void vidaMedia() {
		this.getGraficoActual().setIcon(this.graficos[1]);

	}

	public void vidaBaja() {
		this.getGraficoActual().setIcon(this.graficos[2]);

	}

}
