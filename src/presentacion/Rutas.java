package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JViewport;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.MouseInputAdapter;

import dominio.ConstParada;
import dominio.ConstRuta;
import persistencia.InfoParadas;
import persistencia.InfoRutas;
import java.awt.event.HierarchyListener;
import java.awt.event.HierarchyEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class Rutas extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnAadirruta;
	private JButton btnEliminarruta;
	private JButton btnReservar;
	private JButton btnEnviar;
	private JButton btnModificar;

	private JComboBox cbGuiasDisponibles;
	private JComboBox cbTipoRuta;

	private JLabel lblFotos;
	private JLabel lblDuracinTotal;
	private JLabel lblDistancia;
	private JLabel lblGuiasDisponibles;
	private JLabel lblIdiomas;
	private JLabel lblPrecio;
	private JLabel lblComplejidad;
	public JTextField lblNombreRuta;
	private JLabel lblLblmapa;
	private JLabel lblTipo;

	private JList lista_rutas;
	private JList listParadas;

	private JPanel pnlBotones;
	private JPanel pnl_buttonRutas;
	private JPanel pnlGeneral;
	private JPanel pnlMapa;

	private JRadioButton rdbtnEspaol;
	private JRadioButton rdbtnIngls;
	private JRadioButton rdbtnOtro;

	private JScrollPane scrollPaneBtns;
	private JScrollPane scrollPaneComentarios;
	private JSlider sliderComplejidad;

	private JTextField txtDuracin;
	private JTextField txtDistancia;
	private JTextField txtPrecio;
	private JTextPane txtComentariosAdicionales;

	private Historial historial;
	InfoRutas inforutas = new InfoRutas();
	InfoParadas infoparadas = new InfoParadas();
	ArrayList<ConstRuta> rutas = inforutas.getRutas();
	ArrayList<ConstParada> paradas = infoparadas.getParadas();
	DefaultListModel<String> modeloRutas = new DefaultListModel();
	DefaultListModel<String> modeloParadas = new DefaultListModel();
	private JPanel pnl_derecha;
	private JButton btnConfirmarCambios;
	private JButton btnCancelar;
	private JLabel lblOferta;
	private JLabel lblRutas;

	/**
	 * Create the panel.
	 */
	public Rutas() {

		setOpaque(false);
		setLayout(new BorderLayout(0, 0));

		GridBagConstraints gbc_tableRutasHeader = new GridBagConstraints();
		gbc_tableRutasHeader.gridwidth = 10;
		gbc_tableRutasHeader.insets = new Insets(0, 0, 5, 5);
		gbc_tableRutasHeader.fill = GridBagConstraints.BOTH;
		gbc_tableRutasHeader.gridx = 1;
		gbc_tableRutasHeader.gridy = 2;

		pnlBotones = new JPanel();
		pnlBotones.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlBotones.setOpaque(false);
		add(pnlBotones, BorderLayout.WEST);
		GridBagLayout gbl_pnlBotones = new GridBagLayout();
		gbl_pnlBotones.columnWidths = new int[] { 200, 0 };
		gbl_pnlBotones.rowHeights = new int[] { 40, 20, 20, 5, 777, 0 };
		gbl_pnlBotones.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_pnlBotones.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		pnlBotones.setLayout(gbl_pnlBotones);
		
		lblRutas = new JLabel("Rutas");
		lblRutas.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 20));
		GridBagConstraints gbc_lblRutas = new GridBagConstraints();
		gbc_lblRutas.fill = GridBagConstraints.BOTH;
		gbc_lblRutas.insets = new Insets(0, 0, 5, 0);
		gbc_lblRutas.gridx = 0;
		gbc_lblRutas.gridy = 0;
		pnlBotones.add(lblRutas, gbc_lblRutas);

		btnAadirruta = new JButton(" Añadir ruta  ");
		btnAadirruta.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_btnAadirruta = new GridBagConstraints();
		gbc_btnAadirruta.fill = GridBagConstraints.BOTH;
		gbc_btnAadirruta.insets = new Insets(0, 0, 5, 0);
		gbc_btnAadirruta.gridx = 0;
		gbc_btnAadirruta.gridy = 1;
		pnlBotones.add(btnAadirruta, gbc_btnAadirruta);
		btnAadirruta.addActionListener(new BtnAadirrutaActionListener());
		btnAadirruta.setIcon(new ImageIcon(Rutas.class.getResource("/res/icons8-añadir-24.png")));
		btnAadirruta.setFont(new Font("Verdana", Font.BOLD, 17));

		btnAadirruta.setAlignmentX(Component.CENTER_ALIGNMENT);

		btnAadirruta.setBackground(new Color(45, 51, 74));
		btnAadirruta.setForeground(Color.WHITE);

		btnEliminarruta = new JButton("Eliminar ruta");
		btnEliminarruta.addActionListener(new BtnEliminarrutaActionListener());
		btnEliminarruta.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_btnEliminarruta = new GridBagConstraints();
		gbc_btnEliminarruta.fill = GridBagConstraints.BOTH;
		gbc_btnEliminarruta.insets = new Insets(0, 0, 5, 0);
		gbc_btnEliminarruta.gridx = 0;
		gbc_btnEliminarruta.gridy = 2;
		pnlBotones.add(btnEliminarruta, gbc_btnEliminarruta);
		btnEliminarruta.setFont(new Font("Verdana", Font.BOLD, 17));
		btnEliminarruta.setIcon(new ImageIcon(Rutas.class.getResource("/res/icons8-borrar-24.png")));
		btnEliminarruta.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnEliminarruta.setBackground(new Color(45, 51, 74));

		btnEliminarruta.setForeground(Color.WHITE);

		scrollPaneBtns = new JScrollPane();
		scrollPaneBtns.setViewportBorder(null);
		scrollPaneBtns.setOpaque(false);
		GridBagConstraints gbc_scrollPaneBtns = new GridBagConstraints();
		gbc_scrollPaneBtns.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneBtns.gridx = 0;
		gbc_scrollPaneBtns.gridy = 4;
		pnlBotones.add(scrollPaneBtns, gbc_scrollPaneBtns);

		pnl_buttonRutas = new JPanel();
		pnl_buttonRutas.setBackground(Color.WHITE);
		pnl_buttonRutas.setBorder(null);
		scrollPaneBtns.setViewportView(pnl_buttonRutas);
		for (int i = 0; i < rutas.size(); i++) {
			modeloRutas.add(i, rutas.get(i).getNombreRuta());
		}
		GridBagLayout gbl_pnl_buttonRutas = new GridBagLayout();
		gbl_pnl_buttonRutas.columnWidths = new int[] { 200, 0 };
		gbl_pnl_buttonRutas.rowHeights = new int[] { 674, 0 };
		gbl_pnl_buttonRutas.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_pnl_buttonRutas.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pnl_buttonRutas.setLayout(gbl_pnl_buttonRutas);
		lista_rutas = new JList();
		lista_rutas.addListSelectionListener(new Lista_rutasListSelectionListener());
		lista_rutas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		GridBagConstraints gbc_lista_rutas = new GridBagConstraints();
		gbc_lista_rutas.anchor = GridBagConstraints.WEST;
		gbc_lista_rutas.fill = GridBagConstraints.VERTICAL;
		gbc_lista_rutas.gridx = 0;
		gbc_lista_rutas.gridy = 0;
		pnl_buttonRutas.add(lista_rutas, gbc_lista_rutas);
		lista_rutas.setModel(modeloRutas);
		lista_rutas.setCellRenderer(new JListCellRenderer());

		pnlGeneral = new JPanel();

		pnlGeneral.setOpaque(false);
		add(pnlGeneral, BorderLayout.CENTER);
		GridBagLayout gbl_pnlGeneral = new GridBagLayout();
		gbl_pnlGeneral.columnWidths = new int[] { 80, 150, 100, 40, 10, 50, 20, 100, 50, 100, 128, 0, 0, 20};
		gbl_pnlGeneral.rowHeights = new int[] { 40, 20, 50, 0, 24, 50, 50, 50, 50, 50, 50, 50, 0, 0, 50, 400, 0, 20 };
		gbl_pnlGeneral.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 3.0, 0.0,
				Double.MIN_VALUE };
		gbl_pnlGeneral.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 1.0, 20.0, Double.MIN_VALUE };
		pnlGeneral.setLayout(gbl_pnlGeneral);

		lblNombreRuta = new JTextField("Nombre ruta");
		lblNombreRuta.setPreferredSize(new Dimension(100, 28));
		lblNombreRuta.setSelectionEnd(1);
		lblNombreRuta.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombreRuta.setFont(new Font("SansSerif", Font.BOLD, 40));
		GridBagConstraints gbc_lblNombreRuta = new GridBagConstraints();
		gbc_lblNombreRuta.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNombreRuta.gridwidth = 8;
		gbc_lblNombreRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreRuta.gridx = 1;
		gbc_lblNombreRuta.gridy = 2;
		pnlGeneral.add(lblNombreRuta, gbc_lblNombreRuta);

		btnReservar = new JButton("Reservar");
		btnReservar.addActionListener(new BtnReservarActionListener());
		btnReservar.setFont(new Font("Verdana", Font.BOLD, 24));
		btnReservar.setIcon(new ImageIcon(Rutas.class.getResource("/res/icons8-comprar-50.png")));
		GridBagConstraints gbc_btnReservar = new GridBagConstraints();
		gbc_btnReservar.fill = GridBagConstraints.BOTH;
		gbc_btnReservar.gridheight = 2;
		gbc_btnReservar.gridwidth = 3;
		gbc_btnReservar.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservar.gridx = 1;
		gbc_btnReservar.gridy = 3;
		pnlGeneral.add(btnReservar, gbc_btnReservar);

		btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Verdana", Font.BOLD, 17));
		btnEnviar.setIcon(new ImageIcon(Rutas.class.getResource("/res/icons8-mensaje-de-promoción-24.png")));
		GridBagConstraints gbc_btnEnviar = new GridBagConstraints();
		gbc_btnEnviar.anchor = GridBagConstraints.EAST;
		gbc_btnEnviar.fill = GridBagConstraints.VERTICAL;
		gbc_btnEnviar.gridheight = 2;
		gbc_btnEnviar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnviar.gridx = 5;
		gbc_btnEnviar.gridy = 3;
		pnlGeneral.add(btnEnviar, gbc_btnEnviar);

		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new BtnModificarActionListener());
		btnModificar.setFont(new Font("Verdana", Font.BOLD, 17));
		btnModificar.setIcon(new ImageIcon(Rutas.class.getResource("/res/icons8-editar-24.png")));
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.gridwidth = 3;
		gbc_btnModificar.gridheight = 2;
		gbc_btnModificar.fill = GridBagConstraints.BOTH;
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 7;
		gbc_btnModificar.gridy = 3;
		pnlGeneral.add(btnModificar, gbc_btnModificar);

		for (int i = 0; i < paradas.size(); i++) {
			modeloParadas.add(i, paradas.get(i).getNombreParada());
		}
		listParadas = new JList();
		listParadas.addListSelectionListener(new ListParadasListSelectionListener());
		listParadas.setSelectedIndex(0);
		listParadas.setBorder(new TitledBorder(null, "Paradas de la ruta", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(59, 59, 59)));
		listParadas.setModel(modeloParadas);

		GridBagConstraints gbc_listParadas = new GridBagConstraints();
		gbc_listParadas.gridheight = 8;
		gbc_listParadas.gridwidth = 3;
		gbc_listParadas.insets = new Insets(0, 0, 5, 5);
		gbc_listParadas.fill = GridBagConstraints.BOTH;
		gbc_listParadas.gridx = 1;
		gbc_listParadas.gridy = 6;
		pnlGeneral.add(listParadas, gbc_listParadas);

		lblDuracinTotal = new JLabel("Duración total:");
		GridBagConstraints gbc_lblDuracinTotal = new GridBagConstraints();
		gbc_lblDuracinTotal.anchor = GridBagConstraints.EAST;
		gbc_lblDuracinTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblDuracinTotal.gridx = 5;
		gbc_lblDuracinTotal.gridy = 6;
		pnlGeneral.add(lblDuracinTotal, gbc_lblDuracinTotal);

		txtDuracin = new JTextField();
		GridBagConstraints gbc_txtDuracin = new GridBagConstraints();
		gbc_txtDuracin.gridwidth = 3;
		gbc_txtDuracin.insets = new Insets(0, 0, 5, 5);
		gbc_txtDuracin.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDuracin.gridx = 7;
		gbc_txtDuracin.gridy = 6;
		pnlGeneral.add(txtDuracin, gbc_txtDuracin);
		txtDuracin.setColumns(10);
		ImageIcon lugar = new ImageIcon(new ImageIcon(Guias.class.getResource(
				"/presentacion/recursos/pueblos_de_espana_finalistas_capital_del_turismo_rural_2018_877093971_940x627.jpg"))
						.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT));

		lblDistancia = new JLabel("Distancia:");
		GridBagConstraints gbc_lblDistancia = new GridBagConstraints();
		gbc_lblDistancia.anchor = GridBagConstraints.EAST;
		gbc_lblDistancia.insets = new Insets(0, 0, 5, 5);
		gbc_lblDistancia.gridx = 5;
		gbc_lblDistancia.gridy = 7;
		pnlGeneral.add(lblDistancia, gbc_lblDistancia);

		txtDistancia = new JTextField();
		GridBagConstraints gbc_txtDistancia = new GridBagConstraints();
		gbc_txtDistancia.gridwidth = 3;
		gbc_txtDistancia.insets = new Insets(0, 0, 5, 5);
		gbc_txtDistancia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDistancia.gridx = 7;
		gbc_txtDistancia.gridy = 7;
		pnlGeneral.add(txtDistancia, gbc_txtDistancia);
		txtDistancia.setColumns(10);

		pnl_derecha = new JPanel();
		pnl_derecha.setOpaque(false);
		GridBagConstraints gbc_pnl_derecha = new GridBagConstraints();
		gbc_pnl_derecha.gridheight = 9;
		gbc_pnl_derecha.insets = new Insets(0, 0, 5, 5);
		gbc_pnl_derecha.fill = GridBagConstraints.BOTH;
		gbc_pnl_derecha.gridx = 11;
		gbc_pnl_derecha.gridy = 6;
		pnlGeneral.add(pnl_derecha, gbc_pnl_derecha);
		GridBagLayout gbl_pnl_derecha = new GridBagLayout();
		gbl_pnl_derecha.columnWidths = new int[] { 0, 0 };
		gbl_pnl_derecha.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_pnl_derecha.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_pnl_derecha.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		pnl_derecha.setLayout(gbl_pnl_derecha);

		lblFotos = new JLabel("");
		GridBagConstraints gbc_lblFotos = new GridBagConstraints();
		gbc_lblFotos.insets = new Insets(0, 0, 5, 0);
		gbc_lblFotos.gridx = 0;
		gbc_lblFotos.gridy = 1;
		pnl_derecha.add(lblFotos, gbc_lblFotos);
		lblFotos.setMinimumSize(new Dimension(700, 400));
		lblFotos.setPreferredSize(new Dimension(700, 400));

		lblFotos.setIcon(lugar);

		lblGuiasDisponibles = new JLabel("Guias disponibles:");
		GridBagConstraints gbc_lblGuiasDisponibles = new GridBagConstraints();
		gbc_lblGuiasDisponibles.anchor = GridBagConstraints.EAST;
		gbc_lblGuiasDisponibles.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuiasDisponibles.gridx = 5;
		gbc_lblGuiasDisponibles.gridy = 8;
		pnlGeneral.add(lblGuiasDisponibles, gbc_lblGuiasDisponibles);

		cbGuiasDisponibles = new JComboBox();
		cbGuiasDisponibles
				.setModel(new DefaultComboBoxModel(new String[] { "", "Lucia A.", "Sergio G.", "Manolito R." }));
		GridBagConstraints gbc_cbGuiasDisponibles = new GridBagConstraints();
		gbc_cbGuiasDisponibles.gridwidth = 3;
		gbc_cbGuiasDisponibles.insets = new Insets(0, 0, 5, 5);
		gbc_cbGuiasDisponibles.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbGuiasDisponibles.gridx = 7;
		gbc_cbGuiasDisponibles.gridy = 8;
		pnlGeneral.add(cbGuiasDisponibles, gbc_cbGuiasDisponibles);

		lblIdiomas = new JLabel("Idiomas:");
		GridBagConstraints gbc_lblIdiomas = new GridBagConstraints();
		gbc_lblIdiomas.anchor = GridBagConstraints.EAST;
		gbc_lblIdiomas.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdiomas.gridx = 5;
		gbc_lblIdiomas.gridy = 9;
		pnlGeneral.add(lblIdiomas, gbc_lblIdiomas);

		rdbtnEspaol = new JRadioButton("Español");
		rdbtnEspaol.setContentAreaFilled(false);
		GridBagConstraints gbc_rdbtnEspaol = new GridBagConstraints();
		gbc_rdbtnEspaol.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnEspaol.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnEspaol.gridx = 7;
		gbc_rdbtnEspaol.gridy = 9;
		pnlGeneral.add(rdbtnEspaol, gbc_rdbtnEspaol);

		rdbtnIngls = new JRadioButton("Inglés");
		rdbtnIngls.setContentAreaFilled(false);
		GridBagConstraints gbc_rdbtnIngls = new GridBagConstraints();
		gbc_rdbtnIngls.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnIngls.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnIngls.gridx = 8;
		gbc_rdbtnIngls.gridy = 9;
		pnlGeneral.add(rdbtnIngls, gbc_rdbtnIngls);

		rdbtnOtro = new JRadioButton("Otro");
		rdbtnOtro.setContentAreaFilled(false);
		GridBagConstraints gbc_rdbtnOtro = new GridBagConstraints();
		gbc_rdbtnOtro.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnOtro.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnOtro.gridx = 9;
		gbc_rdbtnOtro.gridy = 9;
		pnlGeneral.add(rdbtnOtro, gbc_rdbtnOtro);

		ButtonGroup idiomas = new ButtonGroup();
		idiomas.add(rdbtnEspaol);
		idiomas.add(rdbtnIngls);
		idiomas.add(rdbtnOtro);

		lblPrecio = new JLabel("Precio (€):");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 5;
		gbc_lblPrecio.gridy = 10;
		pnlGeneral.add(lblPrecio, gbc_lblPrecio);

		txtPrecio = new JTextField();
		txtPrecio.setText("Precio");
		GridBagConstraints gbc_txtPrecio = new GridBagConstraints();
		gbc_txtPrecio.gridwidth = 3;
		gbc_txtPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecio.gridx = 7;
		gbc_txtPrecio.gridy = 10;
		pnlGeneral.add(txtPrecio, gbc_txtPrecio);
		txtPrecio.setColumns(10);

		lblOferta = new JLabel("");
		lblOferta.setIcon(new ImageIcon(Rutas.class.getResource("/res/icons8-descuento-50.png")));
		GridBagConstraints gbc_lblOferta = new GridBagConstraints();
		gbc_lblOferta.anchor = GridBagConstraints.WEST;
		gbc_lblOferta.insets = new Insets(0, 0, 5, 5);
		gbc_lblOferta.gridx = 10;
		gbc_lblOferta.gridy = 10;
		pnlGeneral.add(lblOferta, gbc_lblOferta);

		lblComplejidad = new JLabel("Complejidad:");
		GridBagConstraints gbc_lblComplejidad = new GridBagConstraints();
		gbc_lblComplejidad.anchor = GridBagConstraints.EAST;
		gbc_lblComplejidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblComplejidad.gridx = 5;
		gbc_lblComplejidad.gridy = 11;
		pnlGeneral.add(lblComplejidad, gbc_lblComplejidad);

		sliderComplejidad = new JSlider();
		sliderComplejidad.setBorder(null);
		sliderComplejidad.setPaintLabels(true);
		sliderComplejidad.setPaintTicks(true);
		sliderComplejidad.setMajorTickSpacing(1);
		sliderComplejidad.setValue(5);
		sliderComplejidad.setMaximum(10);
		GridBagConstraints gbc_sliderComplejidad = new GridBagConstraints();
		gbc_sliderComplejidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_sliderComplejidad.gridwidth = 3;
		gbc_sliderComplejidad.insets = new Insets(0, 0, 5, 5);
		gbc_sliderComplejidad.gridx = 7;
		gbc_sliderComplejidad.gridy = 11;
		pnlGeneral.add(sliderComplejidad, gbc_sliderComplejidad);

		lblTipo = new JLabel("Tipo:");
		GridBagConstraints gbc_lblTipo = new GridBagConstraints();
		gbc_lblTipo.anchor = GridBagConstraints.EAST;
		gbc_lblTipo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipo.gridx = 5;
		gbc_lblTipo.gridy = 12;
		pnlGeneral.add(lblTipo, gbc_lblTipo);

		cbTipoRuta = new JComboBox();
		GridBagConstraints gbc_cbTipoRuta = new GridBagConstraints();
		gbc_cbTipoRuta.gridwidth = 3;
		gbc_cbTipoRuta.insets = new Insets(0, 0, 5, 5);
		gbc_cbTipoRuta.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbTipoRuta.gridx = 7;
		gbc_cbTipoRuta.gridy = 12;
		pnlGeneral.add(cbTipoRuta, gbc_cbTipoRuta);

		btnConfirmarCambios = new JButton("Confirmar cambios");
		btnConfirmarCambios.addActionListener(new BtnConfirmarCambiosActionListener());
		btnConfirmarCambios.setVisible(false);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new BtnCancelarActionListener());
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 7;
		gbc_btnCancelar.gridy = 13;
		pnlGeneral.add(btnCancelar, gbc_btnCancelar);
		GridBagConstraints gbc_btnConfirmarCambios = new GridBagConstraints();
		gbc_btnConfirmarCambios.insets = new Insets(0, 0, 5, 5);
		gbc_btnConfirmarCambios.gridx = 9;
		gbc_btnConfirmarCambios.gridy = 13;
		pnlGeneral.add(btnConfirmarCambios, gbc_btnConfirmarCambios);
		btnConfirmarCambios.setBackground(new Color(45, 51, 74));
		btnConfirmarCambios.setForeground(Color.WHITE);

		txtComentariosAdicionales = new JTextPane();
		txtComentariosAdicionales.setBorder(
				new TitledBorder(null, "Comentarios adicionales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_txtComentariosAdicionales = new GridBagConstraints();
		gbc_txtComentariosAdicionales.gridwidth = 9;
		gbc_txtComentariosAdicionales.insets = new Insets(0, 0, 5, 5);
		gbc_txtComentariosAdicionales.fill = GridBagConstraints.BOTH;
		gbc_txtComentariosAdicionales.gridx = 1;
		gbc_txtComentariosAdicionales.gridy = 15;
		pnlGeneral.add(txtComentariosAdicionales, gbc_txtComentariosAdicionales);

		scrollPaneComentarios = new JScrollPane();
		GridBagConstraints gbc_scrollPaneComentarios = new GridBagConstraints();
		gbc_scrollPaneComentarios.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneComentarios.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneComentarios.gridx = 11;
		gbc_scrollPaneComentarios.gridy = 15;
		pnlGeneral.add(scrollPaneComentarios, gbc_scrollPaneComentarios);

		pnlMapa = new JPanel();
		new Mover(pnlMapa);
		scrollPaneComentarios.setViewportView(pnlMapa);

		lblLblmapa = new JLabel("");
		lblLblmapa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblLblmapa.setIcon(new ImageIcon(Rutas.class.getResource("/presentacion/recursos/Callejero-de-Madrid.jpeg")));
		pnlMapa.add(lblLblmapa);
		btnReservar.setBackground(new Color(45, 51, 74));
		btnEnviar.setBackground(new Color(45, 51, 74));
		btnModificar.setBackground(new Color(45, 51, 74));
		btnCancelar.setBackground(new Color(45, 51, 74));
		btnReservar.setForeground(Color.WHITE);
		btnEnviar.setForeground(Color.WHITE);
		btnModificar.setForeground(Color.WHITE);
		btnCancelar.setForeground(Color.WHITE);

		limpiarSeleccion();
		desactivar();
		btnReservar.setVisible(false);
		btnModificar.setVisible(false);
		btnEnviar.setVisible(false);
	}

	public void desactivar() {
		btnConfirmarCambios.setVisible(false);
		btnCancelar.setVisible(false);
		lblNombreRuta.setEditable(false);
		sliderComplejidad.setEnabled(false);
		txtComentariosAdicionales.setEditable(false);
		txtDistancia.setEditable(false);
		cbGuiasDisponibles.setEnabled(false);
		cbTipoRuta.setEditable(false);
		rdbtnEspaol.setEnabled(false);
		rdbtnIngls.setEnabled(false);
		rdbtnOtro.setEnabled(false);
		txtDistancia.setEditable(false);
		txtDuracin.setEditable(false);
		cbTipoRuta.setEnabled(false);
	}

	public class Mover extends MouseInputAdapter {

		private JComponent m_view = null;
		private Point m_holdPointOnView = null;

		public Mover(JComponent view) {
			m_view = view;
			m_view.addMouseListener(this);
			m_view.addMouseMotionListener(this);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			m_view.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
			m_holdPointOnView = e.getPoint();
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			m_view.setCursor(null);
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Point dragEventPoint = e.getPoint();
			JViewport viewport = (JViewport) m_view.getParent();
			Point viewPos = viewport.getViewPosition();
			int maxViewPosX = m_view.getWidth() - viewport.getWidth();
			int maxViewPosY = m_view.getHeight() - viewport.getHeight();

			if (m_view.getWidth() > viewport.getWidth()) {
				viewPos.x -= dragEventPoint.x - m_holdPointOnView.x;

				if (viewPos.x < 0) {
					viewPos.x = 0;
					m_holdPointOnView.x = dragEventPoint.x;
				}

				if (viewPos.x > maxViewPosX) {
					viewPos.x = maxViewPosX;
					m_holdPointOnView.x = dragEventPoint.x;
				}
			}

			if (m_view.getHeight() > viewport.getHeight()) {
				viewPos.y -= dragEventPoint.y - m_holdPointOnView.y;

				if (viewPos.y < 0) {
					viewPos.y = 0;
					m_holdPointOnView.y = dragEventPoint.y;
				}

				if (viewPos.y > maxViewPosY) {
					viewPos.y = maxViewPosY;
					m_holdPointOnView.y = dragEventPoint.y;
				}
			}

			viewport.setViewPosition(viewPos);
		}
	}

	private class BtnAadirrutaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblNombreRuta.setText("");
			sliderComplejidad.setValue(5);
			txtComentariosAdicionales.setText("");
			txtDistancia.setText("");
			txtPrecio.setText("");
			cbGuiasDisponibles.setSelectedItem("");
			cbTipoRuta.setSelectedItem("");
			txtDuracin.setText("");

		
			Callejero callejero = new Callejero();

		}
	}

	private class BtnEliminarrutaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int rutaSeleccionada = lista_rutas.getSelectedIndex();
			try {
				int resp = JOptionPane.showConfirmDialog(null,
						"¿Desea eliminar la ruta " + lista_rutas.getSelectedValue().toString() + "?", "Eliminar ruta",
						JOptionPane.YES_NO_OPTION);
				if (resp == 0) {

					rutas.remove(rutaSeleccionada);
					((DefaultListModel) lista_rutas.getModel()).remove(rutaSeleccionada);
					pnl_buttonRutas.repaint();
					pnl_buttonRutas.revalidate();
					limpiarSeleccion();
				}
			} catch (java.lang.NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "Por favor, seleccione una ruta a eliminar");
			}

		}
	}

	private class ListParadasListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent arg0) {
			int paradaSeleccionada = listParadas.getSelectedIndex();
			if (paradaSeleccionada > -1) {
				ImageIcon lugar = new ImageIcon(
						new ImageIcon(Guias.class.getResource(paradas.get(paradaSeleccionada).getImgParada()))
								.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT));
				lblFotos.setIcon(lugar);
			}
		}
	}

	private class Lista_rutasListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			int rutaSeleccionada = lista_rutas.getSelectedIndex();
			if (rutaSeleccionada > -1) {
				lblNombreRuta.setText(rutas.get(rutaSeleccionada).getNombreRuta().toString());
				sliderComplejidad.setValue(Integer.valueOf(rutas.get(rutaSeleccionada).getComplejidadRuta()));
				txtComentariosAdicionales.setText(rutas.get(rutaSeleccionada).getComentarioRuta().toString());
				txtDistancia.setText(rutas.get(rutaSeleccionada).getKmRuta().toString() + " km");
				txtPrecio.setText(rutas.get(rutaSeleccionada).getPrecioRuta().toString() + " € ");
				cbGuiasDisponibles.setSelectedItem(rutas.get(rutaSeleccionada).getNombreGuia().toString());
				cbTipoRuta.setSelectedItem(rutas.get(rutaSeleccionada).getTipoRuta().toString());
				txtDuracin.setText(rutas.get(rutaSeleccionada).getDuracionRuta().toString());
				SeleccionarRadioButton(rutaSeleccionada);

				modeloParadas.clear();

				for (int i = 0; i < 4; i++) {
					int elemento = (int) (Math.random() * paradas.size());
					modeloParadas.add(i, paradas.get(elemento).getNombreParada());
				}
				listParadas.setSelectedIndex(0);
				btnReservar.setVisible(true);
				btnModificar.setVisible(true);
				btnEnviar.setVisible(true);
			}
		}
	}

	private class BtnModificarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			btnConfirmarCambios.setVisible(true);
			btnCancelar.setVisible(true);
			lblNombreRuta.setEditable(true);
			sliderComplejidad.setEnabled(true);
			txtComentariosAdicionales.setEditable(true);
			txtDistancia.setEditable(true);
			cbGuiasDisponibles.setEnabled(true);
			cbTipoRuta.setEditable(true);
			rdbtnEspaol.setEnabled(true);
			rdbtnIngls.setEnabled(true);
			rdbtnOtro.setEnabled(true);
			txtDistancia.setEditable(true);
			txtDuracin.setEditable(true);
			cbTipoRuta.setEnabled(true);

		}
	}

	private class BtnConfirmarCambiosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int rutaSeleccionada = lista_rutas.getSelectedIndex();
			int resp = JOptionPane.showConfirmDialog(null,
					"¿Desea modificar la ruta " + lista_rutas.getSelectedValue().toString() + "?", "Modificar ruta",
					JOptionPane.YES_NO_OPTION);
			if (resp == 0) {
				rutas.get(rutaSeleccionada).setNombreRuta(lblNombreRuta.toString());
				rutas.get(rutaSeleccionada).setComplejidadRuta(sliderComplejidad.toString());
				rutas.get(rutaSeleccionada).setComentarioRuta(txtComentariosAdicionales.toString());
				rutas.get(rutaSeleccionada).setKmRuta(txtDistancia.toString());
				rutas.get(rutaSeleccionada).setPrecioRuta(txtPrecio.toString());
				rutas.get(rutaSeleccionada).setTipoRuta(cbTipoRuta.getItemAt(rutaSeleccionada).toString());
				desactivar();
			}

		}
	}

	private class BtnReservarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			ReservarRuta reservar = new ReservarRuta();
			reservar.setHistorial(historial);
			reservar.lblNombreRuta.setText(lblNombreRuta.getText());
			reservar.setVisible(true);
			reservar.setLocationRelativeTo(null);

		}
	}

	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			desactivar();
		}
	}

	private void limpiarSeleccion() {
		lblNombreRuta.setText("");
		sliderComplejidad.setValue(5);
		txtComentariosAdicionales.setText("");
		txtDistancia.setText("");
		txtPrecio.setText("");
		cbGuiasDisponibles.setSelectedItem("");
		cbTipoRuta.setSelectedItem("");
		txtDuracin.setText("");
		lista_rutas.setSelectedIndex(-1);
		listParadas.setSelectedIndex(-1);
		modeloParadas.clear();
		lblFotos.setIcon(null);
	}

	private void SeleccionarRadioButton(int rutaSeleccionada) {
		String idio = rutas.get(rutaSeleccionada).getIdiomaRuta().toString();
		if (idio == "ES") {
			rdbtnEspaol.setSelected(true);
		} else if (idio == "EN") {
			rdbtnIngls.setSelected(true);
		} else {
			rdbtnOtro.setSelected(true);
		}

	}

	public void setHistorial(Historial historial) {

		this.historial = historial;
	}
}
