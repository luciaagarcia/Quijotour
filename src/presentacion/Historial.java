package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;


public class Historial extends JPanel {
	private JScrollPane scrollPane;
	private JTable tableHistorial;
	private JPanel panel_Incidencias;
	private JTextPane textIncidencia;
	private JPanel panel_Opiniones;
	private JPanel panel_Sugerencias;
	private JTextPane textSugerencias;
	private JTextPane textOpiniones;
	/*
	 * -----------------------------------------------------------------------
	 * QUITAR DE AQUÍ
	 * 
	 */
	/** Sitio web 1 */
    private static final String SITIO_2 = "www.sitio1.com";

    /** Sitio web 2 */
    private static final String SITIO_1 = "www.sitio2.com";
	/**
	 * -----------------------------------------------------------------------
	 */
	public Historial() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{33, 500, 500, 700, 10, 0};
		gridBagLayout.rowHeights = new int[]{10, 430, 300, 200, 10, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		tableHistorial.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(tableHistorial);
		
		
		
		panel_Incidencias = new JPanel();
		panel_Incidencias.setAutoscrolls(true);
		panel_Incidencias.setBorder(new TitledBorder(null, "Incidencias", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_Incidencias = new GridBagConstraints();
		gbc_panel_Incidencias.insets = new Insets(0, 0, 5, 5);
		gbc_panel_Incidencias.fill = GridBagConstraints.BOTH;
		gbc_panel_Incidencias.gridx = 1;
		gbc_panel_Incidencias.gridy = 2;
		add(panel_Incidencias, gbc_panel_Incidencias);
		panel_Incidencias.setLayout(new BorderLayout(0, 0));
		
		textIncidencia = new JTextPane();
		panel_Incidencias.add(textIncidencia, BorderLayout.CENTER);
		
		panel_Opiniones = new JPanel();
		panel_Opiniones.setBorder(new TitledBorder(null, "Opiniones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_Opiniones = new GridBagConstraints();
		gbc_panel_Opiniones.insets = new Insets(0, 0, 5, 5);
		gbc_panel_Opiniones.fill = GridBagConstraints.BOTH;
		gbc_panel_Opiniones.gridx = 2;
		gbc_panel_Opiniones.gridy = 2;
		add(panel_Opiniones, gbc_panel_Opiniones);
		panel_Opiniones.setLayout(new BorderLayout(0, 0));
		
		textOpiniones = new JTextPane();
		panel_Opiniones.add(textOpiniones);
		
		panel_Sugerencias = new JPanel();
		panel_Sugerencias.setBorder(new TitledBorder(null, "Sugerencias", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_Sugerencias = new GridBagConstraints();
		gbc_panel_Sugerencias.gridwidth = 2;
		gbc_panel_Sugerencias.insets = new Insets(0, 0, 5, 5);
		gbc_panel_Sugerencias.fill = GridBagConstraints.BOTH;
		gbc_panel_Sugerencias.gridx = 1;
		gbc_panel_Sugerencias.gridy = 3;
		add(panel_Sugerencias, gbc_panel_Sugerencias);
		panel_Sugerencias.setLayout(new BorderLayout(0, 0));
		
		textSugerencias = new JTextPane();
		panel_Sugerencias.add(textSugerencias);
		
/* 
 * --------------------------------
 * DATOS DEL GRÁFICO
 * --------------------------------
 */
	    
	 // Creamos y rellenamos el modelo de datos
	    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

	    // Visitas del sitio web 1
	    dataset.setValue(100, SITIO_1, "Lunes");
	    dataset.setValue(120, SITIO_1, "Martes");
	    dataset.setValue(110, SITIO_1, "Miércoles");
	    dataset.setValue(103, SITIO_1, "Jueves");
	    dataset.setValue(106, SITIO_1, "Viernes");

	    // Visitas del sitio web 2
	    dataset.setValue(60, SITIO_2, "Lunes");
	    dataset.setValue(62, SITIO_2, "Martes");
	    dataset.setValue(61, SITIO_2, "Miércoles");
	    dataset.setValue(63, SITIO_2, "Jueves");
	    dataset.setValue(66, SITIO_2, "Viernes");
	    
/* 
 * --------------------------------
 * 				FIN
 * --------------------------------
 */
	    JFreeChart chart = ChartFactory.createLineChart("Visitas", "día",
	    		   "Número visitas", dataset, PlotOrientation.VERTICAL, true,
	    		   true, false);
	    
	    ChartPanel panel_Grafico = new ChartPanel(chart);
		GridBagConstraints gbc_panel_Grafico = new GridBagConstraints();
		gbc_panel_Grafico.insets = new Insets(0, 0, 5, 5);
		gbc_panel_Grafico.fill = GridBagConstraints.BOTH;
		gbc_panel_Grafico.gridx = 3;
		gbc_panel_Grafico.gridy = 1;
		add(panel_Grafico, gbc_panel_Grafico);
		
		
	}

}
