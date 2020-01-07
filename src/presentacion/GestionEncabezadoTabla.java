package presentacion;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

public class GestionEncabezadoTabla implements TableCellRenderer {
	public Font grande = new Font("Verdana", Font.BOLD, 20);

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		JComponent jcomponent = null;

		if (value instanceof String) {
			jcomponent = new JLabel((String) value);
			((JLabel) jcomponent).setHorizontalAlignment(SwingConstants.CENTER);
			((JLabel) jcomponent).setSize(30, jcomponent.getWidth());
			((JLabel) jcomponent).setPreferredSize(new Dimension(50, jcomponent.getWidth()));
		}
		jcomponent
				.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(255, 255, 255)));
		jcomponent.setOpaque(true);
		jcomponent.setSize(50, jcomponent.getWidth());
		jcomponent.setPreferredSize(new Dimension(6, jcomponent.getWidth()));
		jcomponent.setFont(grande);
		jcomponent.setBackground(new Color(45, 51, 74));
		jcomponent.setToolTipText("Tabla grupo turistas");
		jcomponent.setForeground(Color.white);

		return jcomponent;
	}
}