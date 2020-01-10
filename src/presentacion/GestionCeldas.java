package presentacion;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class GestionCeldas extends DefaultTableCellRenderer {
	private String tipo = "text";

	private Font normal = new Font("Verdana", Font.PLAIN, 15);

	public GestionCeldas() {

	}

	public GestionCeldas(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused,
			int row, int column) {

		Color colorFondo = Color.WHITE;
		Color colorFondoPorDefecto = new Color(251, 227, 185);

		if (selected) {
			this.setBackground(colorFondoPorDefecto);
		} else {
			this.setBackground(Color.white);
		}

		if (tipo.equals("texto")) {

			colorFondo = colorFondoPorDefecto;

			this.setHorizontalAlignment(JLabel.LEFT);
			this.setText((String) value);
			this.setBackground((selected) ? colorFondo : Color.WHITE);
			this.setFont(normal);

			return this;
		}
		if (tipo.equals("numerico")) {

			colorFondo = colorFondoPorDefecto;

			this.setHorizontalAlignment(JLabel.CENTER);
			this.setText((String) value);
			this.setBackground((selected) ? colorFondo : Color.WHITE);
			this.setFont(normal);
			return this;
		}
		

		return this;
	}
}
