package presentacion;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CeldCalendario extends DefaultTableCellRenderer {
	private String tipo = "text";

	private Font normal = new Font("Verdana", Font.PLAIN, 15);
	private Font bold = new Font("Verdana", Font.BOLD, 15);


	public CeldCalendario() {

	}

	public CeldCalendario(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused,
			int row, int column) {

		Color colorFondo = Color.WHITE;
		Color colorFondoPorDefecto = new Color(251, 227, 185);

		if (selected) {
			this.setBackground(colorFondoPorDefecto);
		}
		if (row % 2 == 0) {
			this.setBackground(Color.WHITE);
		} else {
			this.setBackground(Color.LIGHT_GRAY);
		}
		if (tipo.equals("texto")) {

			this.setHorizontalAlignment(JLabel.LEFT);
			this.setText((String) value);
			this.setFont(normal);
			this.setOpaque(true);

			return this;
		}
		if (tipo.equals("numerico")) {

			colorFondo = colorFondoPorDefecto;

			this.setHorizontalAlignment(JLabel.CENTER);
			this.setText((String) value);
			this.setFont(bold);
			return this;
		}

		return this;
	}
}
