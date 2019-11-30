package Grafica.Entidades.Municiones.MunicionesDefensor;

import javax.swing.ImageIcon;

import Grafica.Entidades.Municiones.MunicionGrafica;
import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Municiones.Municion;

public class ShurikenDefensorGrafico extends MunicionGrafica{
	
	public ShurikenDefensorGrafico(int x, int y, PanelMapa m, Municion e) {
		super(x, y, m, e);
		graficos = new ImageIcon[1];

		graficos[0] = new ImageIcon("Sprites/Objetos/ShurikenAliado.png");

		setGraficoInicio(x, y);
	}

	public void setGraficoInicio(int x, int y) {// Tiene que estar si o si en cada clase
		graficoActual.setIcon(graficos[0]);
		graficoActual.setBounds(x, y, 120, 120);
	}



}
