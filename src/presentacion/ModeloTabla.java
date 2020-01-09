package presentacion;

import java.awt.Font;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ModeloTabla extends DefaultTableModel {

	String[] titulos;
	Object[][] datos;
	private boolean[][] editable_cells;

	public ModeloTabla(Object[][] datos, String[] titulos) {
		super();
		this.titulos = titulos;
		this.datos = datos;
		this.editable_cells=new boolean[datos.length][datos[0].length];
		setDataVector(datos, titulos);
		CambiarTabla(datos.length, datos[0].length, false);
	}

	public ModeloTabla() {

	}

	@Override
	public boolean isCellEditable(int row, int column) {
		return this.editable_cells[row][column];
	}

	public void setCellEditable(int row, int column, boolean activo) {
		this.editable_cells[row][column] = activo;
		this.fireTableCellUpdated(row, column);
	}

	public void CambiarTabla(int rows, int columns, boolean activo) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				this.editable_cells[i][j] = activo;
			}
		}
	}
}
