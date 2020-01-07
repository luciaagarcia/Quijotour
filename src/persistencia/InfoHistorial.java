package persistencia;

import java.util.ArrayList;

import dominio.ConstHistorial;
import dominio.ConstParada;

public class InfoHistorial {
	public ArrayList<ConstHistorial> getHistorial() {
		ArrayList<ConstHistorial> historial = new ArrayList<ConstHistorial>();
		historial.add(new ConstHistorial("Cabañeros", "Federico", "Bill Gates", "3h", "25-06-2019", "", "",
				"asdrtyuikjhgdsxcvhjkjhsxcvasdfghjhbgvcxzxcvb"));
		historial.add(new ConstHistorial("Almadén", "Penélope", "Ada Lovelace", "7h", "15-02-2020", "",
				"asdfghjqwertyujikjnhbvcxzxcvbhjgf", ""));
		historial.add(new ConstHistorial("Cabañeros", "Marta", "Blaise Pascal", "3h", "01-01-2020",
				"asdfghjklñasdrtyuikolñasdfg", "", ""));

		return historial;
	}
}
