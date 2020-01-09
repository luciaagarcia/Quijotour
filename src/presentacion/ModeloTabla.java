package presentacion;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ModeloTabla extends DefaultTableModel {

	String[] titulos;
	Object[][] datos;
	boolean[][] editable_cells;

	public ModeloTabla(Object[][] datos, String[] titulos) {
		super();
		this.titulos = titulos;
		this.datos = datos;
		this.editable_cells = new boolean[datos.length][datos[0].length];
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

	public Object[] getFila(int fila) {
		Object[] simplefila = new Object[4];
		for (int i = 0; i < this.datos[fila].length; i++) {
			simplefila[i] = this.datos[fila][i];
		}
		return simplefila;
	}

	public void setDatos(int columna, int fila, Object valor) {
		this.datos[fila][columna] = valor;
	}

	public void vaciarDatos() {
		for (int i = 0; i < this.datos.length; i++) {
			for (int j = 0; j < this.datos[i].length; j++) {
				this.datos[i][j] = "";
			}

		}
	}

	public void setDatosMatriz() {
		ArrayList<Object[]> temp = new ArrayList<Object[]>();
		for (int i = 0; i < this.datos.length; i++) {
			temp.add(datos[i]);
		}
		temp.add(new Object[] { "", "", "", "" });
		this.datos = new Object[temp.size()][4];
		for (int i = 0; i < this.datos.length; i++) {
			this.datos[i] = temp.get(i);
		}

		ArrayList<boolean[]> edit = new ArrayList<boolean[]>();
		for (int i = 0; i < this.editable_cells.length; i++) {
			edit.add(editable_cells[i]);
		}

		edit.add(new boolean[] { true, true, true, true });
		this.editable_cells = new boolean[edit.size()][4];
		for (int i = 0; i < this.editable_cells.length; i++) {
			this.editable_cells[i] = edit.get(i);
		}

	}

	public void CambiarTabla(int rows, int columns, boolean activo) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				this.editable_cells[i][j] = activo;
			}
		}
	}
}
