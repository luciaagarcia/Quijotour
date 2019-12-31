package persistencia;

import java.util.ArrayList;

import dominio.ConstRuta;

public class InfoRutas {
	public ArrayList<ConstRuta> getRutas() {
		ArrayList<ConstRuta> rutas = new ArrayList<ConstRuta>();
		rutas.add(new ConstRuta("Cabañeros", "3h", "22.5", "Lucia A.", "ES", "10.0", "4", "", "Montaña"));
		rutas.add(new ConstRuta("Ciudad Real", "5h 30m", "7", "Sergio G.", "ES", "25.0", "1",
				"Habrá que parar a comer en el restaurante La Josefina", "Monumentos"));
		rutas.add(new ConstRuta("Villanueva de los Infantes", "3h 30m", "5.5", "Manolito R.", "EN", "15", "2", "", "Monumentos"));
		rutas.add(new ConstRuta("Almadén", "7h", "22.5", "Lucia A.", "ES", "30.0", "4",
				"La mina de Almadén se cerró en el año 2003 y el actual Parque Minero se inauguró en 2008 en este enclave declarado Patrimonio de la Humanidad por la Unesco.\r\n"
						+ "\r\n"
						+ "En tu visita de esta mina considerada la más antigua del mundo, bajarás a la planta primera de un pozo que tiene una profundidad total de hasta 700 metros.\r\n"
						+ "\r\n"
						+ "En el ascensor metálico del pozo bajarás realmente hasta 59 metros bajo el suelo y recorrerás diversos rincones de las galerías que tuvieron su mayor auge entre los siglos XV y XVIII.\r\n"
						+ "\r\n"
						+ "Finalmente subirás a otro nivel superior para salir de la mina montado en un tren minero, para luego en un pequeño tren turístico completar la visita del recinto.", "Playa"));

		return rutas;
	}
}
