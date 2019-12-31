package dominio;

public class ConstParada {

	String nombreParada;
	String imgParada;

	public String getNombreParada() {
		return nombreParada;
	}

	public void setNombreParada(String nombreParada) {
		this.nombreParada = nombreParada;
	}

	public String getImgParada() {
		return imgParada;
	}

	public void setImgParada(String imgParada) {
		this.imgParada = imgParada;
	}

	public ConstParada(String nombreParada, String imgParada) {
		super();
		this.nombreParada = nombreParada;
		this.imgParada = imgParada;
	}

}
