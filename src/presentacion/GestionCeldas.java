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
	private Font bold = new Font("Verdana", Font.BOLD, 15);

	public GestionCeldas() {

	}

	public GestionCeldas(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused,
			int row, int column) {

		Color colorFondo = Color.WHITE;
		Color colorFondoPorDefecto = new Color(192, 192, 192);
		Color colorFondoSeleccion = new Color(140, 140, 140);

		if (selected) {
			this.setBackground(colorFondoPorDefecto);
		} else {
			this.setBackground(Color.white);
		}

		if (tipo.equals("texto")) {
			if (focused) {
				colorFondo = colorFondoSeleccion;
			} else {
				colorFondo = colorFondoPorDefecto;
			}
			this.setHorizontalAlignment(JLabel.LEFT);
			this.setText((String) value);
			this.setBackground((selected) ? colorFondo : Color.WHITE);
			this.setFont(normal);

			return this;
		}
		if (tipo.equals("numerico")) {
			if (focused) {
				colorFondo = colorFondoSeleccion;
			} else {
				colorFondo = colorFondoPorDefecto;
			}
			// System.out.println(value);
			this.setHorizontalAlignment(JLabel.CENTER);
			this.setText((String) value);
			this.setForeground((selected) ? new Color(45, 51, 74) : new Color(32, 117, 32));
			this.setBackground((selected) ? colorFondo : Color.WHITE);
			// this.setBackground( (selected)? colorFondo :Color.MAGENTA);
			this.setFont(bold);
			return this;
		}

		return this;
	}
}
