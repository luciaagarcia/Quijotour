package dominio;

public class ConstGuia {
	String nombre;
	String Correo;
	String Telefono;
	String Sueldo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getSueldo() {
		return Sueldo;
	}

	public void setSueldo(String sueldo) {
		Sueldo = sueldo;
	}

	public ConstGuia(String nombre, String correo, String telefono, String sueldo) {
		super();
		this.nombre = nombre;
		Correo = correo;
		Telefono = telefono;
		Sueldo = sueldo;
	}

}
