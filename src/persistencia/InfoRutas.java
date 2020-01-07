package persistencia;

import java.util.ArrayList;

import dominio.ConstRuta;

public class InfoRutas {
	public ArrayList<ConstRuta> getRutas() {
		ArrayList<ConstRuta> rutas = new ArrayList<ConstRuta>();
		rutas.add(new ConstRuta("Cabañeros", "3h", "22.5", "Lucia A.", "ES", "10.0", "4",
				"Conoce el gran valor del Parque Nacional de Cabañeros en un itinerario combinado, en el que a bordo de un vehículo todo terreno y recorriendo pequeños y cómodos senderos, descubriréis acompañados por un guía interprete la fauna, flora, historia y costumbres, etc.\r\n"
						+ "\r\n"
						+ "Estas visitas se realizan en el interior del Parque Nacional, por las zonas de acceso restringido.\r\n"
						+ "\r\n"
						+ "Visitaremos  zonas de bosque mediterráneo muy bien conservadas, atraviesa la impresionante Raña de la Viñuela, el quejigar del estrecho, la Casa del Labradillo, el Mancho del Portugués y el valle de la Viñuela.\r\n"
						+ "\r\n"
						+ "Observaremos un variado paisaje donde dominan, según las condiciones climáticas, las encinas, los alcornoques, los quejigos o los robles melojos, y los arbustos más abundantes son los brezos y las jaras, acompañados de plantas aromáticas como el cantueso, el romero y el tomillo. Se puede disfrutar del precioso quejigar del Estrecho, extensión cubierta por viejos quejigos, donde el matorral ha ido desapareciendo por la acción de ciervos, corzos y jabalíes que durante el verano se asientan aquí al disponer de comida, agua y agradable temperatura. Se pueden distinguir las diferencias entre las laderas frescas de umbría y las soleadas de solana, y se visitan también zonas húmedas con arroyos, así como la gran raña de Cabañeros, dominada por las plantas herbáceas, paraíso de ciervos y de distintos tipos de aves.",
				"Montaña"));
		rutas.add(new ConstRuta("Ciudad Real", "5h 30m", "7", "Sergio G.", "ES", "25.0", "1",
				"Habrá que parar a comer en el restaurante La Josefina", "Monumentos"));
		rutas.add(new ConstRuta("Villanueva de los Infantes", "3h 30m", "5.5", "Manolito R.", "EN", "15", "2",
				"Villanueva de los Infantes, destino turístico singular y único en el mundo, un destino que podemos calificar con tres Q: La Q de Quijote, la Q de Quevedo y la Q de calidad turística.\r\n"
						+ "\r\n"
						+ "Cada año, en la madrugada del 30 de abril al 1 de mayo, las rondallas recorren nuestras calles “echando” el mayo a las damas, una tradición de origen ancestral. Pero si se presta atención a la letra del mayo infanteño, en la que se van desgranando las cualidades de la dama a la que se ronda, y a continuación leemos el Capítulo XIII de la Primera Parte del Quijote, Donde se da fin al cuento de la pastora Marcela, con otros sucesos, en el que Cervantes escribe: “su calidad, por lo menos, ha de ser de princesa, …: que sus cabellos son oro, su frente campos Elíseos, sus cejas arcos del cielo, sus ojos soles, sus mejillas rosas, sus labios corales, perlas sus dientes, alabastro su cuello, mármol su pecho, marfil sus manos, su blancura nieve, …\" podemos observar que las similitudes entre la letra del mayo infanteño y las cualidades que exalta Don Quijote, son casi, casi idénticas. ¿Qué fue primero?, quizás la estancia de Miguel de Cervantes Saavedra en Villanueva de los Infantes, acaso mientras visitaba a su posible pariente Fernando Ballesteros Saavedra y allí, al escucharla, la letra del mayo infanteño le sirvió de inspiración; o quizás los infanteños hicieron suyas las palabras del Quijote y las vienen utilizando desde entonces en su mayo tradicional.",
				"Monumentos"));
		rutas.add(new ConstRuta("Almadén", "7h", "22.5", "Lucia A.", "ES", "30.0", "4",
				"La mina de Almadén se cerró en el año 2003 y el actual Parque Minero se inauguró en 2008 en este enclave declarado Patrimonio de la Humanidad por la Unesco.\r\n"
						+ "\r\n"
						+ "En tu visita de esta mina considerada la más antigua del mundo, bajarás a la planta primera de un pozo que tiene una profundidad total de hasta 700 metros.\r\n"
						+ "\r\n"
						+ "En el ascensor metálico del pozo bajarás realmente hasta 59 metros bajo el suelo y recorrerás diversos rincones de las galerías que tuvieron su mayor auge entre los siglos XV y XVIII.\r\n"
						+ "\r\n"
						+ "Finalmente subirás a otro nivel superior para salir de la mina montado en un tren minero, para luego en un pequeño tren turístico completar la visita del recinto.",
				"Playa"));

		return rutas;
	}
}
