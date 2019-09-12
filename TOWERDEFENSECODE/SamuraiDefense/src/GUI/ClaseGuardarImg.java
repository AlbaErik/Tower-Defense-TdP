package GUI;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ClaseGuardarImg {
	private ImageIcon img;
	private static ClaseGuardarImg inst = new ClaseGuardarImg();
	
	private ClaseGuardarImg() {
		this.img=null;
	}
	
	public static ClaseGuardarImg getIntance() {
		return inst;
	}
	
	public boolean tieneImg() {
		return img!=null;
	}
	
	/**private void ModificarImg() {
	}**/
	
	public ImageIcon getImg() {
		ImageIcon i=img;
		img=null;
		return i;
	}
	
	public void setImg(ImageIcon i) {
		img=i;
	}

}
