package persistencia;

import java.util.ArrayList;

import dominio.ConstTurista;

public class InfoTuristas {
	public ArrayList<ConstTurista> getTuristas() {
		ArrayList<ConstTurista> turista = new ArrayList<ConstTurista>();
		turista.add(new ConstTurista("Federico", "Garcia Lorca", "27", "6622448855", ""));
		turista.add(new ConstTurista("Sancho", "Panza", "45", "678465123", ""));
		turista.add(new ConstTurista("Antonio", "Banderas", "27", "6622448855", ""));
		turista.add(new ConstTurista("Penélope", "Cruz", "45", "678465123", ""));
		turista.add(new ConstTurista("Sara", "Baras", "27", "6622448855", ""));
		turista.add(new ConstTurista("Miguel", "Bosé", "45", "678465123", ""));
		turista.add(new ConstTurista("Eva", "Hache", "27", "6622448855", ""));
		turista.add(new ConstTurista("Lola", "Flores", "45", "678465123", ""));
		turista.add(new ConstTurista("Marta", "Sánchez", "27", "6622448855", ""));
		turista.add(new ConstTurista("Victoria", "Sánchez", "45", "678465123", ""));

		return turista;
	}

}
