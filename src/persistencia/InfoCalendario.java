package persistencia;

import java.util.ArrayList;

public class InfoCalendario {

	public static ArrayList<Object[][]> getCalendario() {
		ArrayList<Object[][]> calendarios = new ArrayList<Object[][]>();

		calendarios.add(new Object[][] {
				{ "6:00", null, null, "<htmL>Alcázar de San Juan<br> Grupo: Lucía A.", null, null, null, null },
				{ "8:00", null, null, null, null, null, null, null },
				{ "10:00", null, null, null, null, null, null, null },
				{ "12:00", null, null, null, null, null, null, null },
				{ "16:30", "<htmL>Lagunas de Ruidera <br> Grupo:Eva", null, null, null, null, null, null },
				{ "18:30", null, null, null, null, null, null, null },
				{ "20:30", null, null, null, null, null, null, null },
				{ "22:30", null, null, null, null, null, null, null } });

		calendarios.add(new Object[][] { { "6:00", null, null, null, null, null, null, null },
				{ "8:00", null, null, null, null, "<thmL>Cabañeros<br> Grupo Federico", null, null },
				{ "10:00", null, null, null, null, null, null, null },
				{ "12:00", null, null, null, null, null, null, null },
				{ "16:30", "<htmL>Lagunas de Ruidera <br> Grupo:5432", null, null, null, null, null, null },
				{ "18:30", null, null, null, null, null, null, null },
				{ "20:30", null, null, null, null, null, null, null },
				{ "22:30", null, null, "<thmL>Cabañeros<br>Penélope", null, null, null, null } });

		calendarios.add(new Object[][] {
				{ "6:00", null, null, "<htmL>Alcázar de San Juan<br> Grupo: Lucía A.", null, null, null, null },
				{ "8:00", null, "<htmL>Lagunas de Ruidera <br> Grupo:Lola", null, null, null, null, null },
				{ "10:00", null, null, null, null, null, null, null },
				{ "12:00", null, null, null, null, null, null, null },
				{ "16:30", "<htmL>Lagunas de Ruidera <br> Grupo:Sara", null, null, null, null,
						"<htmL>Lagunas de Ruidera <br> Grupo:Victoria", null },
				{ "18:30", null, null, null, null, null, null, null },
				{ "20:30", null, null, null, null, null, null, null },
				{ "22:30", null, null, null, null, "<htmL>Lagunas de Ruidera <br> Grupo: Eva", null, null } });

		calendarios.add(new Object[][] { { "6:00", null, null, null, null, null, null, null },
				{ "8:00", null, null, null, null, null, null, null },
				{ "10:00", null, null, null, null, null, null, null },
				{ "12:00", null, null, null, null, null, null, null },
				{ "16:30", null, null, "<html> Almadén <br> Grupo: Antonio", null, null, null, null },
				{ "18:30", null, null, null, null, null, null, null },
				{ "20:30", null, null, null, null, null, null, null },
				{ "22:30", null, null, null, null, null, null, null } });

		return calendarios;
	}
}
