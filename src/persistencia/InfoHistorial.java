package persistencia;

import java.util.ArrayList;

import dominio.ConstHistorial;
import dominio.ConstParada;

public class InfoHistorial {
	public ArrayList<ConstHistorial> getHistorial() {
		ArrayList<ConstHistorial> historial = new ArrayList<ConstHistorial>();
		historial.add(new ConstHistorial("Cabañeros", "Federico", "10.0", "3h", "25-06-2019", "", "", "asdrtyuikjhgdsxcvhjkjhsxcvasdfghjhbgvcxzxcvb"));
		historial.add(new ConstHistorial("Almadén", "Penélope", "30.0", "7h", "15-02-2020", "", "asdfghjqwertyujikjnhbvcxzxcvbhjgf", ""));
		historial.add(new ConstHistorial("Cabañeros", "Marta", "8.0", "3h", "01-01-2020", "asdfghjklñasdrtyuikolñasdfg", "", ""));
		
		return historial;
	}
}
