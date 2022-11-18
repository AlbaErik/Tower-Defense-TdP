package Grafica.Entidades.Premios;

import javax.swing.ImageIcon;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Premios.Premio;

public class EscudoGrafico extends PremioGrafico{

	public EscudoGrafico(int x, int y, PanelMapa m, Premio e) {
		super(x, y, m, e);
		graficos = new ImageIcon[1];

		graficos[0] = new ImageIcon("Sprites/Objetos/CampoDeFuerza.png");

		setGraficoInicio(x, y);
	}

	public void setGraficoInicio(int x, int y) {// Tiene que estar si o si en cada clase
		graficoActual.setIcon(graficos[0]);
		graficoActual.setBounds(x, y, 120, 120);
	}

}
