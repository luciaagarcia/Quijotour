package persistencia;

import java.util.ArrayList;

import dominio.ConstGuia;

public class InfoGuias {
	public ArrayList<ConstGuia> getGuias() {
		ArrayList<ConstGuia> guias = new ArrayList<ConstGuia>();
		guias.add(new ConstGuia("Lucía Alfonso", "Lucia.Alfonso@alu.uclm.es", "622116645", "8.5", ""));
		guias.add(new ConstGuia("Sergio García", "Sergio.Garcia16@gmail.com", "672448875", "8.5", ""));
		guias.add(new ConstGuia("Manolito Rodriguez", "Manolito.Elguia@yahoo.com", "644778812", "6", ""));
		guias.add(new ConstGuia("Bill Gates", "BillGates@Microsoft.com", "644523148", "6", ""));
		guias.add(new ConstGuia("Ada Lovelace", "AdaLov@ace.com", "6300487512", "7", ""));
		guias.add(new ConstGuia("Grace Murray", "Murray@yahoo.com", "699124852", "9.5", ""));
		guias.add(new ConstGuia("Blaise Pascal", "Blaise@pascal.es", "623487512", "8.7", ""));

		return guias;
	}
}
