package Grafica;

import javax.swing.Icon;
import javax.swing.JLabel;

import Mapa.Celda;

public abstract class EntidadGrafica {
	protected JLabel grafico;
	protected Icon image[];
	protected Celda celda;
	
	protected EntidadGrafica(Celda c) {
		celda= c;
		this.image = new Icon[5];
	}

	public Celda getcelda() {
		return celda;
	}
	
	public void changeIcon(char c) {
		int d=0;
		if (c=='w')
			d=0;
		else
			if (c=='s')
				d=1;
			else
				if(c=='d')
					d=2;
				else
					if(c=='a')
						d=3;
					else
						if (c==' ')
							d=4;
		this.grafico.setIcon(this.image[d]);
		grafico.repaint();
	}
	
	public void actualizar() {
		grafico.setBounds(celda.getx(), celda.gety(), celda.getAncho(), celda.getAlto());
		grafico.repaint();
	}
		
	public JLabel getGrafico() {
		if(grafico == null) {
			grafico = new JLabel(image[0]);
			grafico.setBounds(celda.getx(), celda.gety(), celda.getAncho(), celda.getAlto());
		}
		
		return grafico;
	}
}
