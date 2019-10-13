package Logica.Juego;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

//import sun.applet.Main;

public class Audio {
	public static void reproducirAudio(String nombre) {
		try {
			File archivo = new File("Audio/musica.mp3");
	        Clip clip = AudioSystem.getClip();
	        AudioInputStream inputStream = AudioSystem.getAudioInputStream(archivo);
	        clip.open(inputStream);
	        clip.start(); 
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}
}
