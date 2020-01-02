package dominio;

public class ConstGuia {
	String nombre;
	String correo;
	String telefono;
	String sueldo;
	String foto;
	public ConstGuia(String nombre, String correo, String telefono, String sueldo, String foto) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.sueldo = sueldo;
		this.foto = foto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getSueldo() {
		return sueldo;
	}
	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}

	
}
