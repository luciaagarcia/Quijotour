package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import dominio.ConstHistorial;
import persistencia.InfoHistorial;

import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Historial extends JPanel {
	private JScrollPane scrollPane;
	private JTable tableHistorial;
	private JPanel panel_Incidencias;
	private JTextPane textIncidencia;
	private JPanel panel_Opiniones;
	private JPanel panel_Sugerencias;
	private JTextPane textSugerencias;
	private JTextPane textOpiniones;

	InfoHistorial infohistorial = new InfoHistorial();
	ArrayList<ConstHistorial> historial = infohistorial.getHistorial();

	private static final String PRECIO = "Precio";
	private static final String PERSONAS = "Personas";
	private static Color COLOR_PRECIO = new Color(251, 227, 185);
	private static Color COLOR_PERSONAS = new Color(45, 51, 74);
	DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	JFreeChart chart = ChartFactory.createLineChart("Visitas", "Mes", "Número visitas", dataset,
			PlotOrientation.VERTICAL, true, true, false);

	public Historial() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 33, 500, 500, 41, 0, 700, 10, 0 };
		gridBagLayout.rowHeights = new int[] { 10, 430, 202, 77, 74, 0, 200, 10, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);

		tableHistorial = new JTable();
		tableHistorial.addMouseListener(new TableHistorialMouseListener());

		DefaultTableModel modeloTablaHistorial = new DefaultTableModel();
		modeloTablaHistorial.addColumn("Nombre");
		modeloTablaHistorial.addColumn("Grupo");
		modeloTablaHistorial.addColumn("Precio");
		modeloTablaHistorial.addColumn("Duración");
		modeloTablaHistorial.addColumn("Fecha");

		for (int i = 0; i < historial.size(); i++) {
			Object[] fila = new Object[5];
			fila[0] = historial.get(i).getNombre();
			fila[1] = historial.get(i).getGrupo();
			fila[2] = historial.get(i).getPrecio();
			fila[3] = historial.get(i).getDuracion();
			fila[4] = historial.get(i).getFecha();
			modeloTablaHistorial.addRow(fila);

		}
		tableHistorial.setModel(modeloTablaHistorial);
		scrollPane.setViewportView(tableHistorial);

		panel_Incidencias = new JPanel();
		panel_Incidencias.setAutoscrolls(true);
		panel_Incidencias
				.setBorder(new TitledBorder(null, "Incidencias", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_Incidencias = new GridBagConstraints();
		gbc_panel_Incidencias.gridheight = 3;
		gbc_panel_Incidencias.insets = new Insets(0, 0, 5, 5);
		gbc_panel_Incidencias.fill = GridBagConstraints.BOTH;
		gbc_panel_Incidencias.gridx = 1;
		gbc_panel_Incidencias.gridy = 2;
		add(panel_Incidencias, gbc_panel_Incidencias);
		panel_Incidencias.setLayout(new BorderLayout(0, 0));

		textIncidencia = new JTextPane();
		panel_Incidencias.add(textIncidencia, BorderLayout.CENTER);

		panel_Opiniones = new JPanel();
		panel_Opiniones
				.setBorder(new TitledBorder(null, "Opiniones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_Opiniones = new GridBagConstraints();
		gbc_panel_Opiniones.gridheight = 3;
		gbc_panel_Opiniones.insets = new Insets(0, 0, 5, 5);
		gbc_panel_Opiniones.fill = GridBagConstraints.BOTH;
		gbc_panel_Opiniones.gridx = 2;
		gbc_panel_Opiniones.gridy = 2;
		add(panel_Opiniones, gbc_panel_Opiniones);
		panel_Opiniones.setLayout(new BorderLayout(0, 0));

		textOpiniones = new JTextPane();
		panel_Opiniones.add(textOpiniones);

		panel_Sugerencias = new JPanel();
		panel_Sugerencias
				.setBorder(new TitledBorder(null, "Sugerencias", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_Sugerencias = new GridBagConstraints();
		gbc_panel_Sugerencias.gridwidth = 2;
		gbc_panel_Sugerencias.insets = new Insets(0, 0, 5, 5);
		gbc_panel_Sugerencias.fill = GridBagConstraints.BOTH;
		gbc_panel_Sugerencias.gridx = 1;
		gbc_panel_Sugerencias.gridy = 6;
		add(panel_Sugerencias, gbc_panel_Sugerencias);
		panel_Sugerencias.setLayout(new BorderLayout(0, 0));

		textSugerencias = new JTextPane();
		panel_Sugerencias.add(textSugerencias);

		ChartPanel panel_Grafico = new ChartPanel(chart);
		panel_Grafico.setZoomTriggerDistance(0);
		panel_Grafico.setZoomOutFactor(0.0);
		panel_Grafico.setZoomInFactor(0.0);
		panel_Grafico.setZoomAroundAnchor(true);
		GridBagConstraints gbc_panel_Grafico = new GridBagConstraints();
		gbc_panel_Grafico.gridwidth = 3;
		gbc_panel_Grafico.insets = new Insets(0, 0, 5, 5);
		gbc_panel_Grafico.fill = GridBagConstraints.BOTH;
		gbc_panel_Grafico.gridx = 3;
		gbc_panel_Grafico.gridy = 1;
		
		chart.setBackgroundPaint(Color.WHITE);
		chart.getCategoryPlot().setBackgroundPaint(new Color(45, 51, 74));
		chart.getCategoryPlot().getRangeAxis().setAutoRange(false);
		chart.getCategoryPlot().getRangeAxis().setRange(0,400);
		add(panel_Grafico, gbc_panel_Grafico);

	}

	public void GenerarGrafico() {

		// Visitas del sitio web 1
		dataset.setValue((int) (Math.random() * 300), PRECIO, "Ene");
		dataset.setValue((int) (Math.random() * 300), PRECIO, "Feb");
		dataset.setValue((int) (Math.random() * 300), PRECIO, "Mar");
		dataset.setValue((int) (Math.random() * 300), PRECIO, "Abr");
		dataset.setValue((int) (Math.random() * 300), PRECIO, "May");
		dataset.setValue((int) (Math.random() * 300), PRECIO, "Jun");
		dataset.setValue((int) (Math.random() * 300), PRECIO, "Jul");
		dataset.setValue((int) (Math.random() * 300), PRECIO, "Ago");
		dataset.setValue((int) (Math.random() * 300), PRECIO, "Sep");
		dataset.setValue((int) (Math.random() * 300), PRECIO, "Oct");
		dataset.setValue((int) (Math.random() * 300), PRECIO, "Nov");
		dataset.setValue((int) (Math.random() * 300), PRECIO, "Dic");

		// Visitas del sitio web 2
		dataset.setValue((int) (Math.random() * 50), PERSONAS, "Ene");
		dataset.setValue((int) (Math.random() * 50), PERSONAS, "Feb");
		dataset.setValue((int) (Math.random() * 50), PERSONAS, "Mar");
		dataset.setValue((int) (Math.random() * 50), PERSONAS, "Abr");
		dataset.setValue((int) (Math.random() * 50), PERSONAS, "May");
		dataset.setValue((int) (Math.random() * 50), PERSONAS, "Jun");
		dataset.setValue((int) (Math.random() * 50), PERSONAS, "Jul");
		dataset.setValue((int) (Math.random() * 50), PERSONAS, "Ago");
		dataset.setValue((int) (Math.random() * 50), PERSONAS, "Sep");
		dataset.setValue((int) (Math.random() * 50), PERSONAS, "Oct");
		dataset.setValue((int) (Math.random() * 50), PERSONAS, "Nov");
		dataset.setValue((int) (Math.random() * 50), PERSONAS, "Dic");


	}

	private class TableHistorialMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			GenerarGrafico();
			int rutaSeleccionada = tableHistorial.getSelectedRow();
			textIncidencia.setText(historial.get(rutaSeleccionada).getIncidencias());
			textOpiniones.setText(historial.get(rutaSeleccionada).getOpiniones());
			textSugerencias.setText(historial.get(rutaSeleccionada).getSugerencias());
		}
	}
}
