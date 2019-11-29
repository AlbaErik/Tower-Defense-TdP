package Grafica.Entidades.Defensores;

import javax.swing.ImageIcon;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public class LanceroEliteGrafico extends DefensorGrafico {
	private String palabras[] = { "LanceroEliteStanding", "LanceroEliteAttacking", "LanceroEliteDying","LanceroEliteStandingFuerza", "LanceroEliteAttackingFuerza"};

	public LanceroEliteGrafico(int x, int y, PanelMapa m, Entidad e) {
		super(x, y, m, e);
		graficos = new ImageIcon[5];

		for (int i = 0; i < palabras.length; i++) {
			graficos[i] = new ImageIcon("Sprites/Personajes/Defensores/" + palabras[i] + ".gif");
		}
		setGraficoInicio(x, y);
	}

	public void setGraficoInicio(int x, int y) {// Tiene que estar si o si en cada clase
		graficoActual.setIcon(graficos[0]);
		graficoActual.setBounds(x, y, 120, 120);// 80
	}


}
