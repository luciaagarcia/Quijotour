package presentacion;

import java.awt.Image;
import java.io.Serializable;

public class Imagen extends ObjetoGraf implements Serializable {
	private Image imagen;

	public Imagen(int x, int y, Image imagen) {
	    super(x, y);
	    this.imagen = imagen;
	}

	public void setImagen(Image imagen) {
	    this.imagen = imagen;
	}

	public Image getImagen() {
	    return imagen;
	}

   }