package presentacion;

import java.awt.Font;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ModeloTabla {
	protected JTable crearModelo() {
		JTable modelo = new JTable();
		modelo.setModel(
				new DefaultTableModel(
						new Object[][] {
								{ "6:00", null, null, "<htmL>Alcázar de San Juan<br> Grupo: Lucía A.", null, null, null,
										null },
								{ "8:00", null, null, null, null, null, null, null },
								{ "10:00", null, null, null, null, null, null, null },
								{ "12:00", null, null, null, null, null, null, null },
								{ "16:30", "<htmL>Lagunas de Ruidera <br> Grupo:5432", null, null, null, null, null,
										null },
								{ "18:30", null, null, null, null, null, null, null },
								{ "20:30", null, null, null, null, null, null, null },
								{ "22:30", null, null, null, null, null, null, null }, },
						new String[] { "Horas", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado",
								"Domingo" }));
		modelo.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		modelo.setFont(new Font("SansSerif", Font.PLAIN, 15));
		modelo.setSurrendersFocusOnKeystroke(false);
		modelo.setShowVerticalLines(true);
		modelo.setShowHorizontalLines(false);
		modelo.setRowSelectionAllowed(true);
		modelo.setEnabled(true);
		modelo.setFillsViewportHeight(false);
		modelo.setColumnSelectionAllowed(false);
		modelo.setCellSelectionEnabled(false);
		modelo.setRowHeight(28);
		
		return modelo;
	}

}
