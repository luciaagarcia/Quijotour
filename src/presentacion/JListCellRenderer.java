package presentacion;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;

public class JListCellRenderer extends JLabel implements ListCellRenderer {

	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		if (isSelected) {
			setBackground(new Color(251, 227, 185));
		} else {
			setBackground(Color.WHITE);
		}
		setForeground(Color.BLACK);
		setText(value.toString());
		setOpaque(true);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		setFont(new Font("Verdana", Font.PLAIN, 14));
		setMinimumSize(new Dimension(200, 50));
		setPreferredSize(new Dimension(200, 50));
		setMaximumSize(new Dimension(200, 50));
		return this;
	}
 
}
