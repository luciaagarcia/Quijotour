package dominio;

public class ConstTurista {

	String nombreTurista;
	String apellidosTurista;
	String edad;
	String contacto;
	String foto;

	public ConstTurista(String nombreTurista, String apellidosTurista, String edad, String contacto, String foto) {
		super();
		this.nombreTurista = nombreTurista;
		this.apellidosTurista = apellidosTurista;
		this.edad = edad;
		this.contacto = contacto;
		this.foto = foto;
	}

	public String getNombreTurista() {
		return nombreTurista;
	}

	public void setNombreTurista(String nombreTurista) {
		this.nombreTurista = nombreTurista;
	}

	public String getApellidosTurista() {
		return apellidosTurista;
	}

	public void setApellidosTurista(String apellidosTurista) {
		this.apellidosTurista = apellidosTurista;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
}
