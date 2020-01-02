package dominio;

public class ConstHistorial {
	String nombre;
	String grupo;
	String precio;
	String duracion;
	String fecha;
	String incidencias;
	String opiniones;
	String sugerencias;

	public ConstHistorial(String nombre, String grupo, String precio, String duracion, String fecha, String incidencias,
			String opiniones, String sugerencias) {
		super();
		this.nombre = nombre;
		this.grupo = grupo;
		this.precio = precio;
		this.duracion = duracion;
		this.fecha = fecha;
		this.incidencias = incidencias;
		this.opiniones = opiniones;
		this.sugerencias = sugerencias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getIncidencias() {
		return incidencias;
	}

	public void setIncidencias(String incidencias) {
		this.incidencias = incidencias;
	}

	public String getOpiniones() {
		return opiniones;
	}

	public void setOpiniones(String opiniones) {
		this.opiniones = opiniones;
	}

	public String getSugerencias() {
		return sugerencias;
	}

	public void setSugerencias(String sugerencias) {
		this.sugerencias = sugerencias;
	}

}
