package dominio;

public class ConstRuta {
	String nombreRuta;
	String duracionRuta;
	String kmRuta;
	String nombreGuia;
	String idiomaRuta;
	String precioRuta;
	String complejidadRuta;
	String comentarioRuta;
	String tipoRuta;

	public ConstRuta(String nombreRuta, String duracionRuta, String kmRuta, String nombreGuia, String idiomaRuta,
			String precioRuta, String complejidadRuta, String comentarioRuta, String tipoRuta) {
		super();
		this.nombreRuta = nombreRuta;
		this.duracionRuta = duracionRuta;
		this.kmRuta = kmRuta;
		this.nombreGuia = nombreGuia;
		this.idiomaRuta = idiomaRuta;
		this.precioRuta = precioRuta;
		this.complejidadRuta = complejidadRuta;
		this.comentarioRuta = comentarioRuta;
		this.tipoRuta = tipoRuta;
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

	public String getKmRuta() {
		return kmRuta;
	}

	public void setKmRuta(String kmRuta) {
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

	public String getPrecioRuta() {
		return precioRuta;
	}

	public void setPrecioRuta(String precioRuta) {
		this.precioRuta = precioRuta;
	}

	public String getComplejidadRuta() {
		return complejidadRuta;
	}

	public void setComplejidadRuta(String complejidadRuta) {
		this.complejidadRuta = complejidadRuta;
	}

	public String getComentarioRuta() {
		return comentarioRuta;
	}

	public void setComentarioRuta(String comentarioRuta) {
		this.comentarioRuta = comentarioRuta;
	}

	public String getTipoRuta() {
		return tipoRuta;
	}

	public void setTipoRuta(String tipoRuta) {
		this.tipoRuta = tipoRuta;
	}

}