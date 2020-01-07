package dominio;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ConstGuia {
	String nombre;
	String correo;
	String telefono;
	String sueldo;
	String foto;
	TableModel calendario;

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

	public TableModel getCalendario() {
		return calendario;
	}

	public void setCalendario(TableModel tableModel) {
		this.calendario = tableModel;
	}

	public ConstGuia(String nombre, String correo, String telefono, String sueldo, String foto) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.sueldo = sueldo;
		this.foto = foto;
		this.calendario = crearCalendario();
	}

	private TableModel crearCalendario() {
		Object[][] tableta = { { "6:00", null, null, null, null, null, null, null },
				{ "8:00", null, null, null, null, null, null, null },
				{ "10:00", null, null, null, null, null, null, null },
				{ "12:00", null, null, null, null, null, null, null },
				{ "16:30", null, null, null, null, null, null, null },
				{ "18:30", null, null, null, null, null, null, null },
				{ "20:30", null, null, null, null, null, null, null },
				{ "22:30", null, null, null, null, null, null, null } };
		rellenarTabla(tableta);
		for (int i = 0; i < tableta.length; i++) {
			for (int j = 0; j < tableta[i].length; j++) {
			}
		}
		TableModel modelo = new DefaultTableModel(tableta,
				new String[] { "Horas", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" });

		return modelo;
	}

	private void rellenarTabla(Object[][] tableta) {
		String[] rutas = { "Villanueva de los Infantes", "Ciudad Real", "Lagunas de Ruidera", };
		String[] grupos = { "Federico", "Sancho", "Antonio", "Penélope", "Sara", "Miguel", "Eva", "Lola", "Marta",
				"Victoria" };

		for (int i = 0; i < tableta.length; i++) {
			for (int j = 0; j < tableta[i].length; j++) {
				if (j != 0) {
					double random = Math.random();
					if (random > 0.8) {
						int numruta = (int) (Math.random() * rutas.length);
						int numgrupo = (int)( Math.random() * grupos.length);
						tableta[i][j] = "<htmL> Ruta: " + rutas[numruta] + "<br>Grupo:" + grupos[numgrupo];

					}

				}
			}
		}
	}
}
