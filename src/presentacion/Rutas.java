package presentacion;

import javax.swing.JPanel;

import javax.swing.JTable;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.table.DefaultTableModel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import java.awt.Rectangle;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import java.awt.GridBagLayout;

public class Rutas extends JPanel {
	private JPanel panelBotonesRuta;
	private JButton btnAadirruta;
	private JButton btnEliminarruta;
	private JButton btnModificarruta;
	private JButton btnEnviarruta;
	private JButton btnReservarruta;
	private JScrollPane scrollPane;
	private JTable tableRutas;
	private JSplitPane splitPane;
	private JLabel lblMapa;
	private JScrollPane scrollPane_1;
	private JTextPane txtpnComentariosruta;

	/**
	 * Create the panel.
	 */
	public Rutas() {
		setOpaque(false);
		setLayout(new BorderLayout(0, 0));
		panelBotonesRuta = new JPanel();
		panelBotonesRuta.setOpaque(false);
		panelBotonesRuta.setPreferredSize(new Dimension(100, 100));
		panelBotonesRuta.setMinimumSize(new Dimension(50, 50));
		add(panelBotonesRuta, BorderLayout.NORTH);
		GridBagLayout gbl_panelBotonesRuta = new GridBagLayout();
		gbl_panelBotonesRuta.columnWidths = new int[]{20, 150, 150, 30, 150, 30, 150, 150, 20, 0};
		gbl_panelBotonesRuta.rowHeights = new int[]{30, 50, 65, 0};
		gbl_panelBotonesRuta.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelBotonesRuta.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelBotonesRuta.setLayout(gbl_panelBotonesRuta);
		
		btnReservarruta = new JButton("Reservar ruta");
		btnReservarruta.setIcon(new ImageIcon(Rutas.class.getResource("/res/icons8-billete-de-tren-24.png")));
		btnReservarruta.setAlignmentX(Component.CENTER_ALIGNMENT);
		GridBagConstraints gbc_btnReservarruta = new GridBagConstraints();
		gbc_btnReservarruta.fill = GridBagConstraints.BOTH;
		gbc_btnReservarruta.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservarruta.gridx = 1;
		gbc_btnReservarruta.gridy = 1;
		panelBotonesRuta.add(btnReservarruta, gbc_btnReservarruta);
		
		btnEnviarruta = new JButton("Enviar ruta");
		btnEnviarruta.setIcon(new ImageIcon(Rutas.class.getResource("/res/icons8-enviar-24.png")));
		btnEnviarruta.setAlignmentX(Component.CENTER_ALIGNMENT);
		GridBagConstraints gbc_btnEnviarruta = new GridBagConstraints();
		gbc_btnEnviarruta.fill = GridBagConstraints.BOTH;
		gbc_btnEnviarruta.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnviarruta.gridx = 2;
		gbc_btnEnviarruta.gridy = 1;
		panelBotonesRuta.add(btnEnviarruta, gbc_btnEnviarruta);
		
		btnAadirruta = new JButton("Añadir ruta");
		btnAadirruta.setIcon(new ImageIcon(Rutas.class.getResource("/res/icons8-añadir-24.png")));
		btnAadirruta.setAlignmentX(Component.CENTER_ALIGNMENT);
		GridBagConstraints gbc_btnAadirruta = new GridBagConstraints();
		gbc_btnAadirruta.fill = GridBagConstraints.BOTH;
		gbc_btnAadirruta.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadirruta.gridx = 4;
		gbc_btnAadirruta.gridy = 1;
		panelBotonesRuta.add(btnAadirruta, gbc_btnAadirruta);
		
		btnModificarruta = new JButton("Modificar ruta");
		btnModificarruta.setIcon(new ImageIcon(Rutas.class.getResource("/res/icons8-editar-24.png")));
		btnModificarruta.setAlignmentX(Component.CENTER_ALIGNMENT);
		GridBagConstraints gbc_btnModificarruta = new GridBagConstraints();
		gbc_btnModificarruta.fill = GridBagConstraints.BOTH;
		gbc_btnModificarruta.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarruta.gridx = 6;
		gbc_btnModificarruta.gridy = 1;
		panelBotonesRuta.add(btnModificarruta, gbc_btnModificarruta);
		
		btnEliminarruta = new JButton("Eliminar ruta");
		btnEliminarruta.setIcon(new ImageIcon(Rutas.class.getResource("/res/icons8-eliminar-24.png")));
		btnEliminarruta.setAlignmentX(Component.CENTER_ALIGNMENT);
		GridBagConstraints gbc_btnEliminarruta = new GridBagConstraints();
		gbc_btnEliminarruta.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminarruta.fill = GridBagConstraints.BOTH;
		gbc_btnEliminarruta.gridx = 7;
		gbc_btnEliminarruta.gridy = 1;
		panelBotonesRuta.add(btnEliminarruta, gbc_btnEliminarruta);
		
		GridBagConstraints gbc_tableRutasHeader = new GridBagConstraints();
		gbc_tableRutasHeader.gridwidth = 10;
		gbc_tableRutasHeader.insets = new Insets(0, 0, 5, 5);
		gbc_tableRutasHeader.fill = GridBagConstraints.BOTH;
		gbc_tableRutasHeader.gridx = 1;
		gbc_tableRutasHeader.gridy = 2;
		
		scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		add(scrollPane, BorderLayout.CENTER);
		
		tableRutas = new JTable();
		tableRutas.setIntercellSpacing(new Dimension(1, 5));
		tableRutas.setModel(new DefaultTableModel(
			new Object[][] {
				{"Caba\u00F1eros", "02-01-20", "2h 10m", "30", "Francisco L.", "ES", "20", "2.5"},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Nombre de la ruta", "Fecha", "Duraci\u00F3n", "Km", "Guia", "Idioma", "Precio (\u20AC)", "Complejidad"
			}
		));
		scrollPane.setViewportView(tableRutas);
		
		splitPane = new JSplitPane();
		splitPane.setOpaque(false);
		splitPane.setEnabled(false);
		splitPane.setResizeWeight(1.0);
		add(splitPane, BorderLayout.SOUTH);
		
		lblMapa = new JLabel("");
		lblMapa.setBounds(new Rectangle(0, 0, 50, 50));
		lblMapa.setMaximumSize(new Dimension(50, 50));
		lblMapa.setIcon(new ImageIcon(Rutas.class.getResource("/presentacion/recursos/imagen-callejero-madrid.gif")));
		splitPane.setRightComponent(lblMapa);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setMinimumSize(new Dimension(500, 1000));
		splitPane.setLeftComponent(scrollPane_1);
		
		txtpnComentariosruta = new JTextPane();
		txtpnComentariosruta.setBorder(new TitledBorder(null, "Informaci\u00F3n adicional", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txtpnComentariosruta.setText("ComentariosRuta\r\nEsto es una prueba\r\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALDSJFAHSLDFJASHLDA\r\nno, no me he dado\r\n1230948713$!·\"$!·\"$!+`´ ");
		scrollPane_1.setViewportView(txtpnComentariosruta);
		
	}
}
