package dominio;

public class CalendarioGuias {

	String[][] calendario = { { "6:00", null, null, null, null, null, null, null },
			{ "8:00", null, null, null, null, null, null, null }, { "10:00", null, null, null, null, null, null, null },
			{ "12:00", null, null, null, null, null, null, null },
			{ "16:30", null, null, null, null, null, null, null },
			{ "18:30", null, null, null, null, null, null, null },
			{ "20:30", null, null, null, null, null, null, null },
			{ "22:30", null, null, null, null, null, null, null },

	};
	String[] cabecera = { "Horas", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };

	public String[][] getCalendario() {
		return calendario;
	}

	public void setCalendario(String[][] calendario) {
		this.calendario = calendario;
	}

	public String[] getCabecera() {
		return cabecera;
	}

	public void setCabecera(String[] cabecera) {
		this.cabecera = cabecera;
	}

	public CalendarioGuias(String[][] calendario, String[] cabecera) {
		super();
		this.calendario = calendario;
		this.cabecera = cabecera;
	}

}
