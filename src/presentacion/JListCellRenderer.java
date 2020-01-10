package presentacion;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;

import dominio.ConstRuta;

public class JListCellRenderer extends JLabel implements ListCellRenderer {
	private ImageIcon icon;
	boolean descuento;
	ArrayList<ConstRuta> rutas = new ArrayList<ConstRuta>();

	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		if (isSelected) {
			setBackground(new Color(251, 227, 185));
		} else {
			setBackground(Color.WHITE);
		}
		if (rutas.size() > 0) {

			if (rutas.get(index).isOferta()) {
				icon = new ImageIcon(Rutas.class.getResource("/res/icons8-descuento-50.png"));
				setIcon(icon);
			} else {
				setIcon(null);
			}
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

	public JListCellRenderer(boolean descuento) {
		this.descuento = descuento;

	}

	public JListCellRenderer() {

	}

	public void setRuta(ArrayList<ConstRuta> rutas) {
		this.rutas = rutas;

	}
}
