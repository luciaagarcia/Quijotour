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
		setLayout(new BorderLayout(0, 0));
		
		panelBotonesRuta = new JPanel();
		panelBotonesRuta.setPreferredSize(new Dimension(100, 100));
		panelBotonesRuta.setMinimumSize(new Dimension(50, 50));
		add(panelBotonesRuta, BorderLayout.NORTH);
		
		btnAadirruta = new JButton("Añadir ruta");
		btnAadirruta.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelBotonesRuta.add(btnAadirruta);
		
		btnEliminarruta = new JButton("Eliminar ruta");
		btnEliminarruta.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelBotonesRuta.add(btnEliminarruta);
		
		btnModificarruta = new JButton("Modificar ruta");
		btnModificarruta.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelBotonesRuta.add(btnModificarruta);
		
		btnEnviarruta = new JButton("Enviar ruta");
		btnEnviarruta.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelBotonesRuta.add(btnEnviarruta);
		
		btnReservarruta = new JButton("Reservar ruta");
		btnReservarruta.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelBotonesRuta.add(btnReservarruta);
		
		GridBagConstraints gbc_tableRutasHeader = new GridBagConstraints();
		gbc_tableRutasHeader.gridwidth = 10;
		gbc_tableRutasHeader.insets = new Insets(0, 0, 5, 5);
		gbc_tableRutasHeader.fill = GridBagConstraints.BOTH;
		gbc_tableRutasHeader.gridx = 1;
		gbc_tableRutasHeader.gridy = 2;
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		tableRutas = new JTable();
		tableRutas.setIntercellSpacing(new Dimension(1, 5));
		tableRutas.setModel(new DefaultTableModel(
			new Object[][] {
				{"Caba\u00F1eros", "2h 10m", "30", "Francisco L.", "ES", "20", "2.5"},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Nombre de la ruta", "Duraci\u00F3n", "Km", "Guia", "Idioma", "Precio (\u20AC)", "Complejidad"
			}
		));
		scrollPane.setViewportView(tableRutas);
		
		splitPane = new JSplitPane();
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
		txtpnComentariosruta.setText("ComentariosRuta\r\nEsto es una prueba\r\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALDSJFAHSLDFJASHLDA\r\nno, no me he dado\r\n1230948713$!·\"$!·\"$!+`´ ");
		scrollPane_1.setViewportView(txtpnComentariosruta);
		
	}
}
