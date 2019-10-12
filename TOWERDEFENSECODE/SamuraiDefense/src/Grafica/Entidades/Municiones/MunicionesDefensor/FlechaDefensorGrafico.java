package Grafica.Entidades.Municiones.MunicionesDefensor;

import javax.swing.ImageIcon;

import Grafica.Entidades.EntidadGrafica;
import Grafica.Mapa.PanelMapa;
import Logica.Entidades.Entidad;

public class FlechaDefensorGrafico extends EntidadGrafica {

	public FlechaDefensorGrafico(int x, int y, PanelMapa m, Entidad e) {
		super(x, y, m, e);
        graficos=new ImageIcon[1];
		
		graficos[0]=new ImageIcon("Sprites/Objetos/FlechaDefensor.png");
		
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
