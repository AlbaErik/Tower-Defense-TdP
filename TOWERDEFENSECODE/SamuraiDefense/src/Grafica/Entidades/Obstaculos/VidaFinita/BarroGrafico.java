package Grafica.Entidades.Obstaculos.VidaFinita;

import javax.swing.ImageIcon;

import Grafica.Entidades.EntidadGrafica;
import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public class BarroGrafico extends EntidadGrafica{

	public BarroGrafico(int x, int y, PanelMapa m, Entidad e) {
		super(x, y, m, e);
		graficos = new ImageIcon[1];

		graficos[0] = new ImageIcon("Sprites/Objetos/Barro.png");

		setGraficoInicio(x, y);
	}

	public void setGraficoInicio(int x, int y) {
		graficoActual.setIcon(graficos[0]);
		graficoActual.setBounds(x, y, 120, 120);
	}
}
