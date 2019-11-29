package GUI.Paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import GUI.VentanaInicial;

public class PanelPerder extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel fondo,texto;
	private VentanaInicial ventana;
	
	public PanelPerder(VentanaInicial v){
		ventana=v;
		setLayout(null);
		setBounds(0,0,v.getAncho(),v.getAlto());	
		
		texto=new JLabel();
		texto.setText("CLICK PARA VOLVER A VENTANA DE INICIO");
		texto.setBounds(0,0,500,50);
		texto.setHorizontalAlignment(JLabel.CENTER);
		texto.setVerticalAlignment(JLabel.CENTER);
		texto.setForeground(Color.WHITE);
		texto.setFont(new Font("Arial", Font.BOLD, 20));
		add(texto);
		
		fondo = new JLabel(new ImageIcon("Sprites/Otros/GameOver.png"));
		fondo.setOpaque(true);
		fondo.setBackground(Color.black);
		fondo.setBounds(0,0,v.getAncho(),v.getAlto());
		add(fondo);
		
		
		
		
		addMouseListener(new MouseAdapter() {
            private Color background;

            @Override
            public void mousePressed(MouseEvent e) {
               cambiar();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(background);
            }
        });
	}
	private void cambiar(){
		ventana.cambiarPanel(this, ventana.getInicio());
	}

}
