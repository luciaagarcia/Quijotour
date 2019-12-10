package dominio;

public class Rutas {
	String nombreRuta;
	String duracionRuta;
	double kmRuta;
	String nombreGuia;
	String idiomaRuta;
	double precioRuta;
	double complejidadRuta;
	String comentarioRuta;
	
	
	public Rutas(String nombreRuta, String duracionRuta, double kmRuta, String nombreGuia, String idiomaRuta,
			double precioRuta, double complejidadRuta, String comentarioRuta) {
		super();
		this.nombreRuta = nombreRuta;
		this.duracionRuta = duracionRuta;
		this.kmRuta = kmRuta;
		this.nombreGuia = nombreGuia;
		this.idiomaRuta = idiomaRuta;
		this.precioRuta = precioRuta;
		this.complejidadRuta = complejidadRuta;
		this.comentarioRuta = comentarioRuta;
	}
	public String getNombreRuta() {
		return nombreRuta;
	}
	public void setNombreRuta(String nombreRuta) {
		this.nombreRuta = nombreRuta;
	}
	public String getDuracionRuta() {
		return duracionRuta;
	}
	public void setDuracionRuta(String duracionRuta) {
		this.duracionRuta = duracionRuta;
	}
	public double getKmRuta() {
		return kmRuta;
	}
	public void setKmRuta(double kmRuta) {
		this.kmRuta = kmRuta;
	}
	public String getNombreGuia() {
		return nombreGuia;
	}
	public void setNombreGuia(String nombreGuia) {
		this.nombreGuia = nombreGuia;
	}
	public String getIdiomaRuta() {
		return idiomaRuta;
	}
	public void setIdiomaRuta(String idiomaRuta) {
		this.idiomaRuta = idiomaRuta;
	}
	public double getPrecioRuta() {
		return precioRuta;
	}
	public void setPrecioRuta(double precioRuta) {
		this.precioRuta = precioRuta;
	}
	public double getComplejidadRuta() {
		return complejidadRuta;
	}
	public void setComplejidadRuta(double complejidadRuta) {
		this.complejidadRuta = complejidadRuta;
	}
	public String getComentarioRuta() {
		return comentarioRuta;
	}
	public void setComentarioRuta(String comentarioRuta) {
		this.comentarioRuta = comentarioRuta;
	}
}
