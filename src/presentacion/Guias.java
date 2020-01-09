package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.text.MaskFormatter;

import dominio.ConstGuia;
import dominio.ConstHistorial;
import persistencia.InfoCalendario;
import persistencia.InfoGuias;
import persistencia.InfoHistorial;

public class Guias extends JPanel {
	private JPanel pnlListaGuias;
	private JPanel panel_principal;
	private JScrollPane scrollPaneBotones;
	private JButton btnGuia;
	private JButton btnGuia_1;
	private JButton btnAadirGuia;
	private JButton btnEliminarGuia;
	private JPanel panel_informacion;
	private JLabel lblFoto;
	private JTextField txtNombre;
	private JTextField txtCorreo;
	private JFormattedTextField lblTelefono;
	private JTextField txtSueldo;
	private JButton btnCambiarFoto;
	private JPanel panel_horario;
	private JScrollPane scrollPane_1;
	private JTable table;
	private JScrollPane scrollPane_2;
	private JTable table_historial;
	private JButton btnModificarDatos;
	private JButton btnModificarCalendario;
	private JList lista_guias;
	InfoGuias infoguias = new InfoGuias();
	SeleccionarImagen selim = new SeleccionarImagen();
	ArrayList<ConstGuia> guias = infoguias.getGuias();
	ArrayList<Object[][]> calen = InfoCalendario.getCalendario();
	DefaultTableModel modeloCalendario = new DefaultTableModel();

	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblCorreo_1;
	private JLabel lblSueldo;
	private JLabel lblTelfono;
	private JButton btnAceptarCambios;
	private JButton btnCancelar;

	/**
	 * Create the panel.
	 * 
	 * @throws ParseException
	 */
	public Guias() {
		setOpaque(false);
		setAutoscrolls(true);
		setLayout(new BorderLayout(0, 0));

		pnlListaGuias = new JPanel();
		pnlListaGuias.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlListaGuias.setOpaque(false);
		add(pnlListaGuias, BorderLayout.WEST);
		GridBagLayout gbl_pnlListaGuias = new GridBagLayout();
		gbl_pnlListaGuias.columnWidths = new int[] { 200, 0 };
		gbl_pnlListaGuias.rowHeights = new int[] { 40, 20, 20, 10, 777, 0 };
		gbl_pnlListaGuias.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_pnlListaGuias.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		pnlListaGuias.setLayout(gbl_pnlListaGuias);

		DefaultListModel<String> modelo = new DefaultListModel();
		for (int i = 0; i < guias.size(); i++) {
			modelo.add(i, guias.get(i).getNombre()); // button[i].setUI(buttonUI);
		}

		scrollPaneBotones = new JScrollPane();
		scrollPaneBotones.setViewportBorder(null);
		scrollPaneBotones.setOpaque(false);
		scrollPaneBotones.getVerticalScrollBar().setUnitIncrement(16);

		btnAadirGuia = new JButton(" Añadir guia ");
		btnAadirGuia.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_btnAadirGuia = new GridBagConstraints();
		gbc_btnAadirGuia.fill = GridBagConstraints.BOTH;
		gbc_btnAadirGuia.insets = new Insets(0, 0, 5, 0);
		gbc_btnAadirGuia.gridx = 0;
		gbc_btnAadirGuia.gridy = 1;
		pnlListaGuias.add(btnAadirGuia, gbc_btnAadirGuia);
		btnAadirGuia.setIcon(new ImageIcon(Guias.class.getResource("/res/icons8-añadir-24.png")));
		btnAadirGuia.setFont(new Font("Verdana", Font.BOLD, 17));

		btnAadirGuia.setBackground(new Color(45, 51, 74));
		btnAadirGuia.setForeground(Color.WHITE);
		btnAadirGuia.setFont(new Font("Verdana", Font.BOLD, 17));

		btnEliminarGuia = new JButton("Eliminar guia");
		btnEliminarGuia.addActionListener(new BtnEliminarGuiaActionListener());
		btnEliminarGuia.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_btnEliminarGuia = new GridBagConstraints();
		gbc_btnEliminarGuia.fill = GridBagConstraints.BOTH;
		gbc_btnEliminarGuia.insets = new Insets(0, 0, 5, 0);
		gbc_btnEliminarGuia.gridx = 0;
		gbc_btnEliminarGuia.gridy = 2;
		pnlListaGuias.add(btnEliminarGuia, gbc_btnEliminarGuia);
		btnEliminarGuia.setFont(new Font("Verdana", Font.BOLD, 17));
		btnEliminarGuia.setIcon(new ImageIcon(Guias.class.getResource("/res/icons8-borrar-24.png")));
		btnEliminarGuia.setBackground(new Color(45, 51, 74));
		btnEliminarGuia.setForeground(Color.WHITE);
		btnEliminarGuia.setFont(new Font("Verdana", Font.BOLD, 17));

		scrollPaneBotones.setSize(new Dimension(pnlListaGuias.getSize()));
		GridBagConstraints gbc_scrollPaneBotones = new GridBagConstraints();
		gbc_scrollPaneBotones.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneBotones.gridx = 0;
		gbc_scrollPaneBotones.gridy = 4;
		pnlListaGuias.add(scrollPaneBotones, gbc_scrollPaneBotones);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(null);
		scrollPaneBotones.setViewportView(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 200, 0 };
		gbl_panel.rowHeights = new int[] { 891, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		lista_guias = new JList();
		lista_guias.setBorder(null);
		lista_guias.setFont(new Font("Verdana", Font.PLAIN, 11));
		lista_guias.addMouseListener(new Lista_guiasMouseListener());
		GridBagConstraints gbc_lista_guias = new GridBagConstraints();
		gbc_lista_guias.anchor = GridBagConstraints.WEST;
		gbc_lista_guias.fill = GridBagConstraints.VERTICAL;
		gbc_lista_guias.gridx = 0;
		gbc_lista_guias.gridy = 0;
		panel.add(lista_guias, gbc_lista_guias);

		lista_guias.setModel(modelo);
		lista_guias.setCellRenderer(new JListCellRenderer());

		panel_principal = new JPanel();
		panel_principal.setOpaque(false);
		panel_principal.setBounds(new Rectangle(0, 10, 0, 0));
		add(panel_principal, BorderLayout.CENTER);
		panel_principal.setLayout(new BorderLayout(0, 0));

		panel_informacion = new JPanel();
		panel_informacion.setOpaque(false);
		panel_principal.add(panel_informacion, BorderLayout.NORTH);
		GridBagLayout gbl_panel_informacion = new GridBagLayout();
		gbl_panel_informacion.columnWidths = new int[] { 0, 0, 0, 0, 80, 36, 139, 91, 100, 526, 10, 0 };
		gbl_panel_informacion.rowHeights = new int[] { 52, 36, 0, 43, 0, 0, 20, 20, 10, 0, 0 };
		gbl_panel_informacion.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		gbl_panel_informacion.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		panel_informacion.setLayout(gbl_panel_informacion);

		lblFoto = new JLabel("");
		ImageIcon imageIcon = new ImageIcon(
				new ImageIcon(Guias.class.getResource("/presentacion/recursos/pngocean.com(2).png")).getImage()
						.getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		lblFoto.setIcon(imageIcon);
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.gridwidth = 3;
		gbc_lblFoto.gridheight = 6;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 0;
		gbc_lblFoto.gridy = 1;
		panel_informacion.add(lblFoto, gbc_lblFoto);

		txtNombre = new JTextField("");
		txtNombre.setToolTipText("Nombre");
		txtNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridwidth = 4;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.gridx = 4;
		gbc_txtNombre.gridy = 2;
		panel_informacion.add(txtNombre, gbc_txtNombre);

		panel_1 = new JPanel();
		panel_1.setMaximumSize(new Dimension(100, 50));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 6;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 9;
		gbc_panel_1.gridy = 2;
		panel_informacion.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		scrollPane_2 = new JScrollPane();
		scrollPane_2.setPreferredSize(new Dimension(550, 50));
		panel_1.add(scrollPane_2);
		scrollPane_2.setOpaque(false);

		table_historial = new JTable();

		scrollPane_2.setViewportView(table_historial);

		lblTelfono = new JLabel("Teléfono:");
		GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
		gbc_lblTelfono.anchor = GridBagConstraints.EAST;
		gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelfono.gridx = 4;
		gbc_lblTelfono.gridy = 3;
		panel_informacion.add(lblTelfono, gbc_lblTelfono);

		try {
			JFormattedTextField txtTelefono = new JFormattedTextField(new MaskFormatter("(+34) ###  ###  ###"));
			txtTelefono.setEditable(false);
			lblTelefono = txtTelefono;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		lblTelefono.setToolTipText("Telefono");
		GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
		gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_txtTelefono.gridx = 6;
		gbc_txtTelefono.gridy = 3;
		panel_informacion.add(lblTelefono, gbc_txtTelefono);

		lblCorreo_1 = new JLabel("Correo:");
		GridBagConstraints gbc_lblCorreo_1 = new GridBagConstraints();
		gbc_lblCorreo_1.anchor = GridBagConstraints.EAST;
		gbc_lblCorreo_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreo_1.gridx = 4;
		gbc_lblCorreo_1.gridy = 4;
		panel_informacion.add(lblCorreo_1, gbc_lblCorreo_1);

		txtCorreo = new JTextField("");
		txtCorreo.setEditable(false);
		txtCorreo.setToolTipText("Correo");
		GridBagConstraints gbc_txtCorreo = new GridBagConstraints();
		gbc_txtCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCorreo.gridwidth = 2;
		gbc_txtCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_txtCorreo.gridx = 6;
		gbc_txtCorreo.gridy = 4;
		panel_informacion.add(txtCorreo, gbc_txtCorreo);

		panel_horario = new JPanel();
		panel_horario.setOpaque(false);
		panel_principal.add(panel_horario, BorderLayout.CENTER);
		GridBagLayout gbl_panel_horario = new GridBagLayout();
		gbl_panel_horario.columnWidths = new int[] { 21, 1265, 50, 0 };
		gbl_panel_horario.rowHeights = new int[] { 70, 430, 0 };
		gbl_panel_horario.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panel_horario.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		panel_horario.setLayout(gbl_panel_horario);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setPreferredSize(new Dimension(1300, 6));
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 1;
		panel_horario.add(scrollPane_1, gbc_scrollPane_1);

		table = new JTable();
		table.setRowHeight(50);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		JTableHeader jtableHeader = table.getTableHeader();
		jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
		table.setTableHeader(jtableHeader);
		table.setModel(new DefaultTableModel(
				new Object[][] { { "6:00", null, null, null, null, null, null, null },
						{ "8:00", null, null, null, null, null, null, null },
						{ "10:00", null, null, null, null, null, null, null },
						{ "12:00", null, null, null, null, null, null, null },
						{ "16:30", null, null, null, null, null, null, null },
						{ "18:30", null, null, null, null, null, null, null },
						{ "20:30", null, null, null, null, null, null, null },
						{ "22:30", null, null, null, null, null, null, null }, },
				new String[] { "Horas", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" }));

		TableColumnModel columnModel = table.getColumnModel();

		columnModel.getColumn(0).setPreferredWidth(95);
		columnModel.getColumn(1).setPreferredWidth(200);
		columnModel.getColumn(2).setPreferredWidth(200);
		columnModel.getColumn(3).setPreferredWidth(200);
		columnModel.getColumn(4).setPreferredWidth(200);
		columnModel.getColumn(5).setPreferredWidth(200);
		columnModel.getColumn(6).setPreferredWidth(200);
		columnModel.getColumn(7).setPreferredWidth(200);

		table.setShowVerticalLines(true);

		scrollPane_1.setViewportView(table);
		table.getTableHeader().setForeground(new Color(251, 227, 185));
		table.getTableHeader().setBackground(Color.BLACK);
		// table.getTableHeader().setBackground(new Color(45,51,74));
		table.getTableHeader().setOpaque(true);

		table.getColumnModel().getColumn(0).setCellRenderer(new CeldCalendario("numerico"));
		for (int i = 1; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(new CeldCalendario("texto"));
		}
		table.setCellSelectionEnabled(true);
		table.getTableHeader().setReorderingAllowed(false);
		table.setRowHeight(80);

		btnCambiarFoto = new JButton("Cambiar foto");
		btnCambiarFoto.setVisible(false);
		btnCambiarFoto.addActionListener(new BtnCambiarFotoActionListener());

		lblSueldo = new JLabel("Sueldo:");
		GridBagConstraints gbc_lblSueldo = new GridBagConstraints();
		gbc_lblSueldo.anchor = GridBagConstraints.EAST;
		gbc_lblSueldo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSueldo.gridx = 4;
		gbc_lblSueldo.gridy = 5;
		panel_informacion.add(lblSueldo, gbc_lblSueldo);

		txtSueldo = new JTextField("");
		txtSueldo.setEditable(false);
		txtSueldo.setToolTipText("Sueldo");
		GridBagConstraints gbc_txtSueldo = new GridBagConstraints();
		gbc_txtSueldo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSueldo.insets = new Insets(0, 0, 5, 5);
		gbc_txtSueldo.gridx = 6;
		gbc_txtSueldo.gridy = 5;
		panel_informacion.add(txtSueldo, gbc_txtSueldo);
		btnCambiarFoto.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnCambiarFoto.setIcon(new ImageIcon(Guias.class.getResource("/res/icons8-foto-24.png")));
		GridBagConstraints gbc_btnCambiarFoto = new GridBagConstraints();
		gbc_btnCambiarFoto.anchor = GridBagConstraints.NORTH;
		btnCambiarFoto.setBackground(new Color(45, 51, 74));
		btnCambiarFoto.setForeground(Color.WHITE);
		gbc_btnCambiarFoto.gridwidth = 3;
		gbc_btnCambiarFoto.insets = new Insets(0, 0, 5, 5);
		gbc_btnCambiarFoto.gridx = 0;
		gbc_btnCambiarFoto.gridy = 7;
		panel_informacion.add(btnCambiarFoto, gbc_btnCambiarFoto);

		btnCambiarFoto.setFont(new Font("Verdana", Font.BOLD, 17));

		btnModificarDatos = new JButton("Modificar datos");
		btnModificarDatos.setVisible(false);
		btnModificarDatos.addActionListener(new BtnModificarDatosActionListener());
		btnModificarDatos.setIcon(new ImageIcon(Guias.class.getResource("/res/icons8-editar-24.png")));
		GridBagConstraints gbc_btnModificarDatos = new GridBagConstraints();
		gbc_btnModificarDatos.anchor = GridBagConstraints.NORTH;
		gbc_btnModificarDatos.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnModificarDatos.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarDatos.gridx = 4;
		gbc_btnModificarDatos.gridy = 7;
		panel_informacion.add(btnModificarDatos, gbc_btnModificarDatos);
		btnModificarDatos.setBackground(new Color(45, 51, 74));
		btnModificarDatos.setForeground(Color.WHITE);
		btnModificarDatos.setFont(new Font("Verdana", Font.BOLD, 17));

		btnModificarCalendario = new JButton("Guardar calendario");
		btnModificarCalendario.addActionListener(new BtnModificarCalendarioActionListener());
		btnModificarCalendario.setVisible(false);
		btnModificarCalendario.setIcon(new ImageIcon(Guias.class.getResource("/res/icons8-calendario-24.png")));
		GridBagConstraints gbc_btnModificarCalendario = new GridBagConstraints();
		gbc_btnModificarCalendario.anchor = GridBagConstraints.NORTH;
		gbc_btnModificarCalendario.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarCalendario.gridx = 6;
		gbc_btnModificarCalendario.gridy = 7;
		panel_informacion.add(btnModificarCalendario, gbc_btnModificarCalendario);
		btnModificarCalendario.setBackground(new Color(45, 51, 74));
		btnModificarCalendario.setForeground(Color.WHITE);
		btnModificarCalendario.setFont(new Font("Verdana", Font.BOLD, 17));

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setVisible(false);
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.fill = GridBagConstraints.BOTH;
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 4;
		gbc_btnCancelar.gridy = 8;
		panel_informacion.add(btnCancelar, gbc_btnCancelar);

		btnAceptarCambios = new JButton("Aceptar cambios");
		btnAceptarCambios.addActionListener(new BtnAceptarCambiosActionListener());
		btnAceptarCambios.setVisible(false);
		GridBagConstraints gbc_btnAceptarCambios = new GridBagConstraints();
		gbc_btnAceptarCambios.fill = GridBagConstraints.BOTH;
		gbc_btnAceptarCambios.insets = new Insets(0, 0, 5, 5);
		gbc_btnAceptarCambios.gridx = 6;
		gbc_btnAceptarCambios.gridy = 8;
		panel_informacion.add(btnAceptarCambios, gbc_btnAceptarCambios);
		construirTabla();
		ocultarBotones();
		limpiarSeleccion();

	}

	private void construirTabla() {
		ArrayList<String> titulosList = new ArrayList<String>();
		titulosList.add("Nombre");
		titulosList.add("Grupo");
		titulosList.add("Guia");
		titulosList.add("Fecha");

		String titulos[] = new String[titulosList.size()];
		for (int i = 0; i < titulos.length; i++) {
			titulos[i] = titulosList.get(i);
		}
		Object[][] data = obtenerMatrizDatos(titulosList);
		construirTabla(titulos, data);
	}

	private Object[][] obtenerMatrizDatos(ArrayList<String> titulosList) {
		InfoHistorial infohistorial = new InfoHistorial();
		ArrayList<ConstHistorial> historial = infohistorial.getHistorial();

		String informacion[][] = new String[historial.size()][titulosList.size()];
		for (int i = 0; i < historial.size(); i++) {
			informacion[i][0] = historial.get(i).getNombre();
			informacion[i][1] = historial.get(i).getGrupo();
			informacion[i][2] = historial.get(i).getGuia();
			informacion[i][3] = historial.get(i).getFecha();

		}
		return informacion;
	}

	private class BtnCambiarFotoActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Image img = selim.SelectImage();
			Image newImg = img.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon image = new ImageIcon(newImg);

			lblFoto.setIcon(image);

		}
	}

	private class Lista_guiasMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			int guiaSeleccionado = lista_guias.getSelectedIndex();
			txtNombre.setText(guias.get(guiaSeleccionado).getNombre());
			txtCorreo.setText(guias.get(guiaSeleccionado).getCorreo());
			lblTelefono.setText(guias.get(guiaSeleccionado).getTelefono());
			txtSueldo.setText(guias.get(guiaSeleccionado).getSueldo() + "€");
			table.setModel(guias.get(guiaSeleccionado).getCalendario());

			TableColumnModel columnModel = table.getColumnModel();

			columnModel.getColumn(0).setPreferredWidth(95);
			columnModel.getColumn(1).setPreferredWidth(200);
			columnModel.getColumn(2).setPreferredWidth(200);
			columnModel.getColumn(3).setPreferredWidth(200);
			columnModel.getColumn(4).setPreferredWidth(200);
			columnModel.getColumn(5).setPreferredWidth(200);
			columnModel.getColumn(6).setPreferredWidth(200);
			columnModel.getColumn(7).setPreferredWidth(200);
			if (guias.get(guiaSeleccionado).getFoto() != "") {
				ImageIcon guia = new ImageIcon(
						new ImageIcon(Guias.class.getResource(guias.get(guiaSeleccionado).getFoto())).getImage()
								.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT));

				lblFoto.setIcon(guia);
			}
			btnModificarCalendario.setVisible(true);
			btnCambiarFoto.setVisible(true);
			btnModificarDatos.setVisible(true);
		}
	}

	private void ocultarBotones() {
		btnAceptarCambios.setVisible(false);
		btnCancelar.setVisible(false);

		txtCorreo.setEditable(false);
		txtNombre.setEditable(false);
		txtSueldo.setEditable(false);
		lblTelefono.setEditable(false);
	}

	private void activarBotones() {
		btnAceptarCambios.setVisible(true);
		btnCancelar.setVisible(true);
		btnModificarCalendario.setVisible(false);
		btnCambiarFoto.setVisible(false);
		btnModificarDatos.setVisible(false);

		txtCorreo.setEditable(true);
		txtNombre.setEditable(true);
		txtSueldo.setEditable(true);
		lblTelefono.setEditable(true);
	}

	private class BtnModificarDatosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			activarBotones();
		}
	}

	private class BtnAceptarCambiosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int guiaSeleccionado = lista_guias.getSelectedIndex();
			int resp = JOptionPane.showConfirmDialog(null,
					"¿Seguro que desea modificar al guia " + lista_guias.getSelectedValue().toString() + "?",
					"Modificar guia", JOptionPane.YES_NO_OPTION);
			if (resp == 0) {
				guias.get(guiaSeleccionado).setNombre(txtNombre.toString());
				guias.get(guiaSeleccionado).setCorreo(txtCorreo.toString());
				guias.get(guiaSeleccionado).setTelefono(lblTelefono.toString());
				guias.get(guiaSeleccionado).setSueldo(txtSueldo.toString());
				ocultarBotones();
			}
		}
	}

	private class BtnModificarCalendarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int guiaSeleccionado = lista_guias.getSelectedIndex();
			int resp = JOptionPane.showConfirmDialog(
					null, "¿Seguro que desea modificar el calendario al guia "
							+ lista_guias.getSelectedValue().toString() + "?",
					"Modificar calendario", JOptionPane.YES_NO_OPTION);
			if (resp == 0) {
				guias.get(guiaSeleccionado).setCalendario(table.getModel());
			}
		}
	}

	private class BtnEliminarGuiaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			int guiaSeleccionado = lista_guias.getSelectedIndex();
			try {
				int resp = JOptionPane.showConfirmDialog(null,
						"¿Desea eliminar la ruta " + lista_guias.getSelectedValue().toString() + "?", "Eliminar ruta",
						JOptionPane.YES_NO_OPTION);
				if (resp == 0) {

					guias.remove(guiaSeleccionado);
					((DefaultListModel) lista_guias.getModel()).remove(guiaSeleccionado);
					pnlListaGuias.repaint();
					pnlListaGuias.revalidate();
					limpiarSeleccion();
				}
			} catch (java.lang.NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "Por favor, seleccione una ruta a eliminar");
			}

		}

	}

	private void limpiarSeleccion() {
		txtCorreo.setText("");
		txtNombre.setText("");
		txtSueldo.setText("");
		lblTelefono.setText("");
	}

	private void construirTabla(String[] titulos, Object[][] data) {
		ModeloTabla modeloTablaHistorial = new ModeloTabla(data, titulos);
		table_historial.setModel(modeloTablaHistorial);

		table_historial.getColumnModel().getColumn(0).setCellRenderer(new GestionCeldas("texto"));
		table_historial.getColumnModel().getColumn(1).setCellRenderer(new GestionCeldas("texto"));
		table_historial.getColumnModel().getColumn(2).setCellRenderer(new GestionCeldas("texto"));
		table_historial.getColumnModel().getColumn(3).setCellRenderer(new GestionCeldas("numerico"));

		table_historial.getTableHeader().setReorderingAllowed(false);
		table_historial.setRowHeight(30);
		table_historial.setGridColor(new Color(0, 0, 0));

		JTableHeader jtableHeader = table_historial.getTableHeader();
		jtableHeader.setDefaultRenderer(new EncabezadoCalendario());
		table_historial.setTableHeader(jtableHeader);

	}
}
