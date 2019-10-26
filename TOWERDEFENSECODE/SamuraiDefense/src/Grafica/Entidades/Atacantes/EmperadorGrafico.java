package Grafica.Entidades.Atacantes;

import javax.swing.ImageIcon;

import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;
import Logica.Mapa.Posicion;

public class EmperadorGrafico extends AtacanteGrafico {
	private String palabras[] = { "EmperadorStanding","EmperadorRunning", "EmperadorAttacking", "EmperadorDying" };

	public EmperadorGrafico(int x, int y, PanelMapa m, Entidad e) {
		super(x, y, m, e);
		graficos = new ImageIcon[4];

		for (int i = 0; i < palabras.length; i++) {
			graficos[i] = new ImageIcon("Sprites/Personajes/Atacantes/" + palabras[i] + ".gif");
		}
		setGraficoInicio(x, y);
	}

	public void setGraficoInicio(int x,int y) {//Tiene que estar si o si en cada clase
		graficoActual.setIcon(graficos[0]);
		graficoActual.setBounds(x, y, 120, 120);//80
	}
	
	public void cambiarPos(double x,int y) {//Tiene que estar si o si en cada clase
		Posicion p = new Posicion(x, y);
		mientidad.setPos(p);
		
		pos.setLocation(x,y);
		graficoActual.setBounds((int)x,y, 120, 120);//80	
	}
}