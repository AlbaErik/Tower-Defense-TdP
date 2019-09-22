package Grafica.Entidades.Defensores;

import javax.swing.Icon;
import javax.swing.JLabel;

import Grafica.Entidades.PersonajeGrafico;

public class DefensorGrafico extends PersonajeGrafico {
	protected JLabel grafico;
	protected Icon img[];

	protected DefensorGrafico(int x,int y) {
		super(x,y);
		img=new Icon[2];
	}
	
	

}